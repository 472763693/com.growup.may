package com.may.day002;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("���������:");
		Scanner input = new Scanner(System.in);
		
		int years = input.nextInt();
		if(years > 3000 || years < 0) {
			System.out.println("������������!");
		}else if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
			System.out.println("�������������!");
		}else {
			System.out.println("����Ĳ�������Ŷ!");
		}
	}
}
