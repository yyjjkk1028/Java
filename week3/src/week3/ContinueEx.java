package week3;

import java.util.Scanner;

public class ContinueEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5�� �Է��ϼ���>>");
		int sum = 0;
		for(int i = 0; i<5; i++) {
			System.out.printf("%d ��° ����: ",i+1);
			int num = sc.nextInt();
			if(num < 0)
				continue;
			sum += num;
		}
		System.out.print("�Է��� ���� ���� ����: "+sum);
	}

}
