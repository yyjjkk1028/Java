package week2;

import java.util.Scanner;

public class InoutScn {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("�����Է�: ");
		a = sc.nextInt();
		System.out.print("�̸��Է�: ");
		name = sc.next();
		
		System.out.println(a);
		System.out.print(name);
		sc.close();
		
		
	}

}
