package com.may.day002;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("����������:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int c = a > b ? a : b;
		
		System.out.println("����ֵΪ:" + c);
	}
}
