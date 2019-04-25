package com.yex.b_twoSingleton;

/**
 * 饿汉式:
 *  直接创建实例对象,不管你是否需要这个对象都会创建
 * 
 * (1)构造器私有化
 * (2)自行创建,并且用静态变量保存
 * (3)强调这是一个单例,可以用final修饰
 * (4)向外提供这个实例
 * 
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();
	
	private Singleton1(){
		
	}
}
