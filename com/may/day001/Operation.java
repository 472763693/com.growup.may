package com.may.day001;

public class Operation {
	//String s="1234567" Ҫ�����Ϊһ��һ�������� �����������  Ȼ������������
	
	public static void main(String[] args) {
		String s = "1234567";
		int[] num = new int[s.length()];  //���ڴ�����ֵ�����
		
		for(int i = 0; i < s.length(); i++) {
			
			//��s�е�����ͨ��""�ָ�
			//charAt() �������ڷ���ָ�����������ַ�
			num[i] = Integer.parseInt(s.charAt(i) + "");
		}
		
		//�鿴�����е�Ԫ��
		for(int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}
}
