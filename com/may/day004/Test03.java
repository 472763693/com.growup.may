package com.may.day004;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	//������Ԫ���е����ֵ
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.printArrayValue();
	}
	
	public static void printArrayValue() {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ĳ���");
		int[] arr = new int[input.nextInt()];
		int max = 0;  //�м���
		
		//�������
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("�����е�Ԫ�طֱ�Ϊ:" + Arrays.toString(arr));
		System.out.println("����������Ԫ��Ϊ:" + max);
	}
}
