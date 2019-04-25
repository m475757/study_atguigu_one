package com.yex.c_threeClassInit;

/**
 * 父类的初始化<clinit>:
 * (1)j = method();
 * (2)父类的静态代码块
 *
 */
public class Father {
	private int i = test();
	private static int j = method();
	static{
		System.out.print("(1)");
	}
	Father(){
		System.out.print("(2)");
	}
	{
		System.out.print("(3)");
	}
	public int test(){
		System.out.print("(4)");
		return 1;
	}
	public static int method(){
		System.out.print("(5)");
		return 1;
	}
}
