package main.java.sol.algorithm;

public class ManyIndex {
	
	public static void main(String[] args) {
		
		int[] data = {1, 2, 8, 9, 1, 4, 5, 8, 7, 8};
		int mode = 0; // ���� ���� �󵵼� ���� ��� ����
		int[] index = new int[11]; // 0~10 ���� �ε����� ī���� ����
		int max = Integer.MIN_VALUE; // �ִ밪 ������ ���� : �ʱⰪ�� �ּҰ�
		
		for (int i = 0; i < data.length; i++) {
			
			index[data[i]]++;
			
			System.out.println("�ε���  " + data[i] + " : " +  index[data[i]]);
			
		}
		
		for (int i = 0; i < index.length; i++) {
			
			if (max < index[i]) {
				max = index[i];
				mode = i;
			}
			
		}
		
		System.out.println("���� �󵵼��� ���� �� = " + mode);
		
		
	}
	
}