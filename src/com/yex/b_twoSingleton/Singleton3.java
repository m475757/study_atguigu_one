package com.yex.b_twoSingleton;


/**
 * 静态代码块饿汉式(适合复杂实例化)
 * 
 */
public class Singleton3 {
	public static final Singleton3 INSTANCE;
	
	static{
		INSTANCE=new Singleton3();
	}
	private Singleton3(){
		
	}
}
