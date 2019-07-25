package com.mybatis.plus.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wzf
 * @since 2019-07-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StaffOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("userId")
    private Long userId;

    @TableField("shopName")
    private String shopName;

    @TableField("shopId")
    private Long shopId;


}
