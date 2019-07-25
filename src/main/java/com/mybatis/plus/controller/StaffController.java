package com.mybatis.plus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.plus.bean.Staff;
import com.mybatis.plus.service.StaffService;
import com.mybatis.plus.util.SnowflakeIdWorker;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	  /**
	   * 插入 OR 修改
     * http://localhost:8181/staff/test1
     */
    @GetMapping("/test1")
    public String test3() {
        Staff staff = new Staff(new SnowflakeIdWorker(1,1).nextId(), "王zf", "男","13488125646");
        boolean b = staffService.saveOrUpdate(staff);
        System.out.println("插入 OR 修改"+b);
        if(b) {
        	return "success";
        }
        return "error";
    }
    
    
    /**
     * 增删改查 CRUD
     * http://localhost:8181/staff/test2
     */
    @GetMapping("/test2")
    public Staff test2() {
        System.err.println("删除一条数据：" + staffService.removeById(1L));
        System.err.println("插入一条数据：" + staffService.save(new Staff(new SnowflakeIdWorker(1,1).nextId(), "王zf", "男","13488125646")));
        Staff user = new Staff(new SnowflakeIdWorker(1,1).nextId(), "王zf", "男","13488125646");
        boolean result = staffService.save(user);
        // 自动回写的ID
        Long id = user.getId();
        System.out.println(id);
        System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
//        System.err.println("查询：" + staffService.getById(id));//时间处理
        System.err.println("更新一条数据：" + staffService.updateById(new Staff(id, "天青","女", "110")));
        for (int i = 0; i < 15; ++i) {
        	staffService.save(new Staff(new SnowflakeIdWorker(1,1).nextId(), "张三" + i,"男",i+"**88125646"));
        }
        IPage<Staff> userListPage = staffService.page(new Page<Staff>(1, 5), new QueryWrapper<Staff>());
        System.err.println("total=" + userListPage.getTotal() + ", current list size=" + userListPage.getRecords().size());
        System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        userListPage = staffService.page(new Page<Staff>(1, 5), new QueryWrapper<Staff>().orderByDesc("name"));
        System.err.println("total=" + userListPage.getTotal() + ", current list size=" + userListPage.getRecords().size());
        return staffService.getById(id);
    }
    
    /**
     * 测试事物
     * http://localhost:8181/staff/test_transactional<br>
  * 访问如下并未发现插入数据说明事物可靠！！<br>
     * http://localhost:8080/user/test<br>
     * <br>
     * 启动  Application 加上 @EnableTransactionManagement 注解其实可无默认貌似就开启了<br>
     * 需要事物的方法加上 @Transactional 必须的哦！！
     */
    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/test_transactional")
    public void testTransactional() {
        Staff staff = new Staff(1000L, "测试事物", "女", "12346");
        staffService.save(staff);
        System.out.println(" 这里手动抛出异常，自动回滚数据");
        throw new RuntimeException();
    }
    
    /**
     * <p>
     * 参数模式分页
     * </p>
     * <p>
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8181/staff/page?size=1&current=1<br>
     * <p>
     * 集合模式，不进行分页直接返回所有结果集：
     * http://localhost:8181/staff/page?listMode=true
     */
    @GetMapping("/page")
    public IPage page(Page page, boolean listMode) {
        if (listMode) {
            // size 小于 0 不在查询 total 及分页，自动调整为列表模式。
            // 注意！！这个地方自己控制好！！
            page.setSize(-1);
        }
        return staffService.page(page, null);
    }
    
    /**
     * http://localhost:8181/staff/select_wrapper
     */
    @GetMapping("/select_wrapper")
    public Object getUserByWrapper() {
        return staffService.selectListByWrapper(new QueryWrapper<Staff>()
                .lambda().like(Staff::getName, "毛")
                .or(e -> e.like(Staff::getName, "张")));
    }
    
    /**
     * http://localhost:8181/staff/select_sql
     */
    @GetMapping("/select_sql")
    public Object getStaffBySql() {
        return staffService.selectListBySQL();
    }
    
    /**
    * AR 部分测试
    * http://localhost:8181/staff/test
    */
   @GetMapping("/test")   //实体继承Model的使用CRUD
   public IPage<Staff> test() {
	   Staff staff = new Staff(1L, "wz","nan","123456");
       System.err.println("删除所有：" + staff.delete(null));
       staff.setName("ttt");
       staff.setTel("789");
       System.err.println("查询插入结果：" + staff.selectById().toString());
       staff.setName("mybatis-plus-ar");
       System.err.println("更新：" + staff.updateById());
       return staff.selectPage(new Page<Staff>(0, 12), null);
   }
   
   /**
    * AR 部分测试
    * http://localhost:8181/staff/testadd
    */
   @GetMapping("/testadd")   //实体继承Model的使用CRUD
   public void testadd() {
	   
	   staffService.testadd();
	  
   }

}
