package com.mybatis.plus.util;

import com.mybatis.plus.bean.Staff;

public class RunnableDemo {

	public static class RunnableDemo2Test implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10000;i++) {
				Staff staff = new Staff(1L+i, "wz","nan","123456"+i);
				staff.insert();
			}
			System.out.println(Thread.currentThread().getName()+"正在运行");
		}
		
		
	}
	
}
