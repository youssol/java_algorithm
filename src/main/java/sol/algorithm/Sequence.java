package main.java.sol.algorithm;

/*
 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 * 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = ?
 * 패턴 : 홀수는 + , 짝수는  -
 */

public class Sequence {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i%2 != 0) { // 홀수
				sum += i;
			}
			else { // 짝수
				sum -= i;
			}
		}
		
		System.out.println("결과 = " + sum);
	}
	
	
}