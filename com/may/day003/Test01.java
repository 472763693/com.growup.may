package com.may.day003;

import java.util.Scanner;

public class Test01 {
	//��������Ϸ 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������²������(1-1000)�������˳���������0");
		int num = input.nextInt();
		
		int numbers = (int)(Math.random() * 100 + 1);
		boolean condition = true;
		
		while(condition) {
			if(num == 0) {
				System.out.println("��������������Ϸ����");
				break;
			}
			
			if(num > numbers) {
				System.out.println("���ԣ��´���");
			}else if(num == numbers) {
				System.out.println("���������¶���");
				break;
			}else {
				System.out.println("����Ŷ����С��");
			}
			System.out.println("���ٴ����룬�����˳���������0");
			num = input.nextInt();
		}
	}
}
