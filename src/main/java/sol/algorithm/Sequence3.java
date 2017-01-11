package main.java.sol.algorithm;

/*
 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.
 *  1+2+4+7+11+16+22+... +
 *  위패턴대로 20번 반복했을 때의 결과값은 ? 얼마?
 */


public class Sequence3 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int data = 1;
		
		for (int i = 0; i < 20; i++) {
			
			if(i != 19) System.out.print(data + " + ");
			else System.out.print(data + "\n");
			
			sum += data;
			data = data + (i+1);
			
		}
		System.out.println("result = " + sum);
	}
	
}