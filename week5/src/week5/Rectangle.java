package week5;

import java.util.Scanner;

public class Rectangle {
	int width, height;
	int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		rect.height = sc.nextInt();
		System.out.print("�ʺ� �Է�: ");
		rect.width = sc.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		sc.close();
		
	}
}
