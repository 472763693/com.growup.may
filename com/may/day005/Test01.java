package com.may.day005;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Test01.outStudnetsPerformance();
	}
	
	public static void outStudnetsPerformance() {
		System.out.println("������ѧ������:");
		Scanner input = new Scanner(System.in);
		int students = input.nextInt();
		int[] performance = new int[students];
		for(int i = 1; i <= students; i++) {
			System.out.println("�������" + i + "��ѧ���ĳɼ�:");
			performance[i -1] = input.nextInt();
			System.out.println("ѧ��" + i + "�ĳɼ�Ϊ��"+ performance[i -1] + "\n");
		}
		System.out.println("�ɼ���ϢΪ:" + Arrays.toString(performance));
		
		//�ɼ�����
		int temp = 0;
		for(int i = 0; i <= performance.length; i++) {
			for(int j = i + 1; j < performance.length; j++) {
				if(performance[i] > performance[j]) {
					temp = performance[i];
					performance[i] = performance[j];
					performance[j] = temp;
				}
			}
		}
		System.out.println("�ɼ�����:" + Arrays.toString(performance));
	}
} 
