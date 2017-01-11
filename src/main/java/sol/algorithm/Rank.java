package main.java.sol.algorithm;

public class Rank {
	
	public static void main(String[] args) {
		
		int[] data = {68, 99, 54, 43, 77, 87, 24, 32, 55};
		
		int[] rank = {1,1,1,1,1,1,1,1,1};
		
		for (int i = 0; i < data.length; i++) {
			
			rank[i] = 1; // rank 를 1로 초기화
			
			for (int j = 0; j < data.length; j++) {
				
				if (data[i] < data[j]) {
					
					rank[i]++;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println( rank[i] + " 위 는 " + data[i] );
		}
		
	}
}