package com.may.day004;

import java.util.Scanner;

public class Test01 {
	//10��������ӷ�������
	public static void main(String[] args) {
		System.out.println("������ʼ10��������ӷ����㿼�ԣ������˳���������0");
		int condition = 10;
		Test01 t = new Test01();
		t.printAnser(condition);  //���ÿ��Է���
	}
	
	public static void printAnser(int condition) {
		Scanner input = new Scanner(System.in);		
		int sum = 0;  //��
		int score = 0; //����
		
		for(int i = 1; i <= condition; i++) {
			int addend1 = (int)(Math.random() * 100 + 1);
			int addend2 = (int)(Math.random() * 100 + 1);
			System.out.println("��" + i + "�⣬" + addend1 + " + " + addend2 + " = ?");
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("��ѡ������Ȩ���Ѿ��˳�����");
				break;
			}
			
			if(num == addend1 + addend2) {
				System.out.println("�����");
				score++;
			}else {
				System.out.println("����ˣ�����ϸ");
			}
		}
		System.out.println("���Խ�������ĳɼ�Ϊ:" + score);
	}
}
