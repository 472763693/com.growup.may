package com.may.day001;

public class AutomaticPromotion {
	//���ʽ���Զ�����
	public static void main(String[] args) {
		//����1��short���͵ı���
		short sValue = 5;
		
		//���ʽ�е�sValue���Զ�����Ϊint����
		//��1��int���͸�ֵ��shortʱ���ᱨ��
		//sValue = sValue - 2;  ������Ϊ����֮������Ͳ�ͬ
		
		byte b = 40;
		char c = 'a';
		int i = 23;
		double d = .314;
		
		//'a'��unicode����Ϊ97
		double result = b + c + i * d;
		System.out.println("b��ֵΪ:" + b);
		System.out.println("c��ֵΪ:");
		System.out.println(c);
		System.out.println("b��c�ĺ�Ϊ��");
		System.out.println(b + c);    //char������16λ��,�ײ����unicode���뱣��
		System.out.println(result);
	}
}
