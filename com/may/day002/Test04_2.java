package com.may.day002;

import java.util.Scanner;

public class Test04_2 {
	public static void main(String[] args) {
		System.out.println("������a��b��c3������:");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] arr = {a, b, c};
		
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("��3�����У�����Ϊ" + arr[2]);
	}
}
