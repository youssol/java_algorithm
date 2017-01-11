package main.java.sol.algorithm;

public class MaxMin {
	
	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE; // 경우의 수 중 가장 작은 값으로 초기화
		int min = Integer.MAX_VALUE; // 경우의 수 중 가장 큰 값으로 초기화
		
		int[] data = {-68, 99, -54, 43, -77, 87, -24};
		
		for (int i = 0; i < data.length; i++) {
			
			if (data[i] > max) {
				max = data[i]; // 가장 작은값부터 시작해 계속 비교하면서 큰 값을 max 에 넣는것이 포인트
			}
			
			if (data[i] < min) {
				min = data[i]; // 가장 큰 값부터 시작해 계속 비교하면서 더 작은 값을 min 에 넣는것이 포인트
			}
			
		}
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}
}