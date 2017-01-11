package main.java.sol.algorithm;

public class Near {
	
	public static void main(String[] args){
		
		int[] data = {68, 99, 54, 43, 77, 87, 24, 32, 55};
		int target = 6; // ã�� �� ����
		int near = 0; // ����� ���� ������ ����
		int min = Integer.MAX_VALUE; //���̰��� ���밪�� ������ ���� - �ʱⰪ�� �ִ밪
		
		for (int i = 0; i < data.length; i++) {
			
				int a = Math.abs((data[i] - target)); //Math.abs(��) : ���밪�� ���ϴ� �Լ�
				
				if(min > a) {
					min = a; // �ּҰ� �˰���
					near = data[i];
				}
			
		}
		
		System.out.println("���� ����� �� = " + near);
		
	}
}