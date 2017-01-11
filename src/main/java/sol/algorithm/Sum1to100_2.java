package main.java.sol.algorithm;

public class Sum1to100_2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 101; i++) {
			
			if(i%2 == 0){
				
				sum += i;
				
			}
			
		}
		
		System.out.println("1 부터 100 까지 짝수 합 = " + sum);
	
	}

}