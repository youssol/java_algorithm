package main.java.sol.algorithm;

/*
 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  1/2 - 2/3 + 3/4 - .... 98/99 + 99/100 = ?
 */

 public class Sequence2 {
 	
	 public static void main(String[] args) {
		
		 double sum = 0.0;
		 
		 for (int i = 0; i < 100; i++) {
			 
			 if (i%2 != 0) {
				sum += i / (double)(i+1);
			} else {
				sum -= i / (double)(i+1);
			}
			
		}
		 
		 System.out.println("result = " + sum);
		 
	}
	 
 }