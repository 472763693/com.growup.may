package com.may.day005;

import java.util.Arrays;
import java.util.Scanner;

public class CreatRandom {
	//�������鳤�ȣ����ɸ÷�Χ�ڵ����������
	public static void main(String[] args) {
		int[] arr = CreatRandom.outArray();
		System.out.println("���ɵ����������Ϊ��" + Arrays.toString(arr));
	}
	
	public static int[] outArray() {
		System.out.println("����������ĳ���:");
		Scanner input = new Scanner(System.in);
		int alength = input.nextInt();
		int[] randomArray = new int[alength];
		
		for(int i = 0; i < alength; i++) {
			int num = (int)(Math.random() * alength);
			randomArray[i] = num;
		}
		
		return randomArray;
	}
}
