package com.may.day003;

import java.util.Scanner;

public class Test_s04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		int num = input.nextInt();
		
		System.out.println("����������:");
		int team = input.nextInt();
		
		int sum = getSum(num, team);
		System.out.println("��Ϊ:" + sum);
	}
	
	public static int getSum(int num, int team) {
		int sum = 0;
		for(int i = 0; i < team; i++) {
			sum += num;
			num += num * 10;  //���ĺ�һ��������������10���ټ���������
		}
		return sum;
	}
}
