package com.yex.b_twoSingleton;

/**
 * ����ʽ:
 *  ֱ�Ӵ���ʵ������,�������Ƿ���Ҫ������󶼻ᴴ��
 * 
 * (1)������˽�л�
 * (2)���д���,�����þ�̬��������
 * (3)ǿ������һ������,������final����
 * (4)�����ṩ���ʵ��
 * 
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();
	
	private Singleton1(){
		
	}
}
