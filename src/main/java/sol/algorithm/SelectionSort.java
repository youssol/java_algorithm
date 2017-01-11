package main.java.sol.algorithm;

public class SelectionSort {
	
	public static void main(String[] args){
		
		int[] data = {1, 68, 99, 54, 43, 77, 87, 24, 32, 11};
		
		int temp = 0;
		
		for (int i = 0; i < data.length-1; i++) {
			
			for (int j = i+1; j < data.length; j++) {
				if (data[i] > data[j]) {
					
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
			Showarray(data);
		}
		
		System.out.println("============°á°ú===========");
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
	}
	
	public static void Showarray(int[] data) {
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
}