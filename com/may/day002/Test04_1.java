package com.may.day002;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test04_1 {
	public static void main(String[] args) {
		System.out.println("������3�����֣�a��b��c��");
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		
		System.out.println("����ֵΪ:" + arr[2]);
	}
}
