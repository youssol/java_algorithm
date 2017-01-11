package main.java.sol.algorithm;

public class ManyIndex {
	
	public static void main(String[] args) {
		
		int[] data = {1, 2, 8, 9, 1, 4, 5, 8, 7, 8};
		int mode = 0; // 가장 많은 빈도수 값이 담길 변수
		int[] index = new int[11]; // 0~10 까지 인덱스에 카운터 저장
		int max = Integer.MIN_VALUE; // 최대값 저장할 변수 : 초기값은 최소값
		
		for (int i = 0; i < data.length; i++) {
			
			index[data[i]]++;
			
			System.out.println("인덱스  " + data[i] + " : " +  index[data[i]]);
			
		}
		
		for (int i = 0; i < index.length; i++) {
			
			if (max < index[i]) {
				max = index[i];
				mode = i;
			}
			
		}
		
		System.out.println("가장 빈도수가 많은 수 = " + mode);
		
		
	}
	
}