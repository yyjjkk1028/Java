package week4;

import java.util.Scanner;
public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int max = 0;
		int min = 5632166;
		int sum = 0;
		System.out.print("5���� ���� ������ �Է��Ͻÿ�:");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) { 
				min = intArray[i];	
			}
		}
			
			System.out.println();
		for (int i : intArray) {
			System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("�Է��� ���� ����"+sum +"�Դϴ�.");
			System.out.println("�Է��� �� �߿� �ִ밪��"+max +"�Դϴ�.");
			System.out.println("�Է��� �� �߿� �ּҰ���"+min +"�Դϴ�.");
			sc.close();
		}
}
