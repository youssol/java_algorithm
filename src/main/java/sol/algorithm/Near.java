package main.java.sol.algorithm;

public class Near {
	
	public static void main(String[] args){
		
		int[] data = {68, 99, 54, 43, 77, 87, 24, 32, 55};
		int target = 6; // 찾을 수 지정
		int near = 0; // 가까운 값을 지정할 변수
		int min = Integer.MAX_VALUE; //차이값의 절대값을 저장할 변수 - 초기값은 최대값
		
		for (int i = 0; i < data.length; i++) {
			
				int a = Math.abs((data[i] - target)); //Math.abs(값) : 절대값을 구하는 함수
				
				if(min > a) {
					min = a; // 최소값 알고리즘
					near = data[i];
				}
			
		}
		
		System.out.println("가장 가까운 수 = " + near);
		
	}
}