package main.java.sol.algorithm;


public class Sum {
	
	public static void main(String[] args) {
		
		int[] score = {73, 85, 66, 97, 53, 48}; // 6�� ����
		int sum = 0; // ����
		int sumCondition = 0; // ���� ���� (80���̻�)
	
		//Sum
		for(int i = 0; i < score.length; i++) {
			
			sum += score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			
			if(score[i] > 80) {
				sumCondition += score[i];
			}
		}
	
		System.out.println(score.length + "���� ���� = " + sum);
		System.out.println(score.length + "�� �� 80 �� �̻��� ���� = " + sumCondition);
	}
	
}