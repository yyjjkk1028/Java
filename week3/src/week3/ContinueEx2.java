package week3;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("5���� ���� �Է��ϼ���>>");
		int i=1;
		while(i<=5) {
			System.out.print(i+"��° ���� �Է� : ");
			int num = sc.nextInt();
			if(num<0) {
				i++;
				continue;
			}
			i++;
			sum += num;
			
		}
		System.out.print("�� �������� ���� "+sum);
	}

}
