package main.java.sol.algorithm;

/*
 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  1+2+4+7+11+16+22+... +
 *  �����ϴ�� 20�� �ݺ����� ���� ������� ? ��?
 */


public class Sequence3 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int data = 1;
		
		for (int i = 0; i < 20; i++) {
			
			if(i != 19) System.out.print(data + " + ");
			else System.out.print(data + "\n");
			
			sum += data;
			data = data + (i+1);
			
		}
		System.out.println("result = " + sum);
	}
	
}