package com.may.day003;

import java.util.Scanner;

public class Test_s05 {
	public static void main(String[] args) {
		System.out.println("����������:");
		
		Scanner input = new Scanner(System.in);
		int team = input.nextInt();
		
		double sum = getSum(team);
		System.out.println("��Ϊ:"+ sum);
	}
	public static double getSum(int team) {
		double sum = 0;
		for(int i = 1; i <= team; i++) {
			sum += 1.0 / i;  //�˴����ӻ��ĸ����Ϊdouble����
		}
		return sum;
	}
}
