package com.may.day002;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//Ӧ��˰�� = (˰ǰ���� - �۳���) * ˰�� - ����۳���
		//taxPayment = (preTax - deduction) * taxRat - rapid
		
		System.out.println("����������˰ǰ����:");
		Scanner input = new Scanner(System.in);
		double preTax = input.nextInt();
		
		int deduction = 3500;
		double payPart = preTax - deduction;
		
		//˰��
		double[] taxRat = {0.03, 0.1, 0.2, 0.25, 0.3, 0.35, 0.45};
		
		//�۳���
		int[] rapid = {0, 105, 555, 1005, 2755, 5505, 13505};
		
		//Ӧ��˰��
		double taxPayment = 0;
		
		if(preTax <= 3500) {
			System.out.println("���Ĺ��ʱ�׼���ڿ۳��������ý��ɸ�������˰!");
		}else if(payPart <= 1500) {
			taxPayment = payPart * taxRat[0] - rapid[0];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else if(payPart > 1500 && payPart <= 4500) {
			taxPayment = payPart * taxRat[1] - rapid[1];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else if(payPart > 4500 && payPart <= 9000) {
			taxPayment = payPart * taxRat[2] - rapid[2];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else if(payPart > 9000 && payPart <= 35000) {
			taxPayment = payPart * taxRat[3] - rapid[3];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else if(payPart > 35000 && payPart <= 55000) {
			taxPayment = payPart * taxRat[4] - rapid[4];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else if(payPart > 55000 && payPart <= 80000) {
			taxPayment = payPart * taxRat[5] - rapid[5];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}else {
			taxPayment = payPart * taxRat[6] - rapid[6];
			System.out.println("��Ӧ���ɵ�����˰Ϊ:" + taxPayment);
		}
	}
}
