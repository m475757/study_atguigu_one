package com.yex.b_twoSingleton;


/**
 * 懒汉式:(线程安全)
 *  延迟创建这个实例对象
 *
 * (1)构造器私有化
 * (2)用一个静态变量保存则个唯一的实例
 * (3)提供一个静态方法,获取这个实例对象
 */
public class Singleton5 {
	private static  Singleton5 instance;
	
	private Singleton5(){
		
	}
	public static Singleton5 getInstance(){
		if(instance==null){
			synchronized (Singleton5.class) {
				if(instance==null){
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
