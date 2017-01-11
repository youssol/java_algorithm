package main.java.sol.algorithm;


public class Sum {
	
	public static void main(String[] args) {
		
		int[] score = {73, 85, 66, 97, 53, 48}; // 6¸í Á¡¼ö
		int sum = 0; // ÃÑÁ¡
		int sumCondition = 0; // Á¶°Ç ÃÑÁ¡ (80Á¡ÀÌ»ó)
	
		//Sum
		for(int i = 0; i < score.length; i++) {
			
			sum += score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			
			if(score[i] > 80) {
				sumCondition += score[i];
			}
		}
	
		System.out.println(score.length + "¸íÀÇ ÃÑÁ¡ = " + sum);
		System.out.println(score.length + "¸í Áß 80 Á¡ ÀÌ»óÀÇ ÃÑÁ¡ = " + sumCondition);
	}
	
}