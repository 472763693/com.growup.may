package com.may.day001;

public class RandomCharacters {
	//�������6λ�ַ�
	public static void main(String[] args) {
		//����һ�����ַ���
		String result = "";
		
		for(int i = 0; i < 6; i++) {
			//����һ��97-122��int������
			int intVal = (int) (Math.random() * 26 + 97);
			
			//�����ɵ�int������ǿ��ת����char����
			result += (char)intVal;
		}
		System.out.println(result);
	}
}