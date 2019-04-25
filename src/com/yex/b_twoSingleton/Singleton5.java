package com.yex.b_twoSingleton;


/**
 * ����ʽ:(�̰߳�ȫ)
 *  �ӳٴ������ʵ������
 *
 * (1)������˽�л�
 * (2)��һ����̬�����������Ψһ��ʵ��
 * (3)�ṩһ����̬����,��ȡ���ʵ������
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
