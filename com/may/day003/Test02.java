package com.may.day003;

import java.util.Scanner;

public class Test02 {
	//����ӷ�������
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ʼ10������ӷ����㿼�ԣ������˳���������0");
			
		int count = 1;
		int score = 0;
		
		while(count < 11) {
			int addend1 = (int)(Math.random() * 100 + 1);
			int addend2 = (int)(Math.random() * 100 + 1);
			
			System.out.println("��" + count + "��" + addend1 + " + " + addend2 + " = ?");
			
			int num = input.nextInt();
			
			if(num == 0 || num == -1) {
				System.out.println("���������������Խ���");
				System.out.println("���ķ���Ϊ:" + score);
				break;
			}
			if(num == addend1 + addend2) {
				System.out.println("�����!");
				score++;
			}else {
				System.out.println("�����");
			}
			count++;
			if(count == 11) {
				System.out.println("���ķ���Ϊ:" + score);
				break;
			}
		}
	}
}
