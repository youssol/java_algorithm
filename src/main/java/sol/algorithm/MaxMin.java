package main.java.sol.algorithm;

public class MaxMin {
	
	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE; // ����� �� �� ���� ���� ������ �ʱ�ȭ
		int min = Integer.MAX_VALUE; // ����� �� �� ���� ū ������ �ʱ�ȭ
		
		int[] data = {-68, 99, -54, 43, -77, 87, -24};
		
		for (int i = 0; i < data.length; i++) {
			
			if (data[i] > max) {
				max = data[i]; // ���� ���������� ������ ��� ���ϸ鼭 ū ���� max �� �ִ°��� ����Ʈ
			}
			
			if (data[i] < min) {
				min = data[i]; // ���� ū ������ ������ ��� ���ϸ鼭 �� ���� ���� min �� �ִ°��� ����Ʈ
			}
			
		}
		
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}
}