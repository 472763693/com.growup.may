package com.may.day002;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������:");
		int years = input.nextInt();
		
		System.out.println("�������·�:");
		int months = input.nextInt();
		
		if(years > 3000 || years < 0) {
			System.out.println("��������������!");
		}else if(months > 12 || months < 0) {
			System.out.println("��������·�����!");
		}else if((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
			switch(months) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(years+ "���" + months + "����" + 31 + "��");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(years+ "���" + months + "����" + 30 + "��");
				break;
				
			case 2:
				System.out.println(years+ "���" + months + "����" + 29 + "��");
				break;
			}
		}else {
			switch(months) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(years+ "���" + months + "����" + 31 + "��");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(years+ "���" + months + "����" + 30 + "��");
				break;
				
			case 2:
				System.out.println(years+ "���" + months + "����" + 28 + "��");
				break;
			}
		}
	}
}
