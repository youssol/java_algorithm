package main.java.sol.algorithm;

public class Sum1to100 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 101; i++) {
			
			sum += i;
			
		}
		
		System.out.println("1 부터 100 까지 합 = " + sum);
	
	}

}