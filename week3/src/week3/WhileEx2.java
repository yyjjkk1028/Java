package week3;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0 , score, sum = 0;
		double avg;
		
		System.out.println("������ �Է��ϼ���(0: ����)");
		
		while((score = sc.nextInt()) != 0) {
			sum += score;
			cnt++;
		}
		avg = (double)sum / cnt;
		System.out.println(cnt + "�� �л����� ������ �ԷµǾ����ϴ�.");
		System.out.println("����"+ sum + "�̰� �����" + avg +"�Դϴ�.");
	}

}
