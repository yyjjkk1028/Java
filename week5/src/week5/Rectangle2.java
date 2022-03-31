package week5;

import java.util.Scanner;
class Rect{
	private int width, height;
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	int getArea() {
		return width * height;
	}
}

public class Rectangle2 {
	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력: ");
		rect.setHeight(sc.nextInt());
		System.out.print("너비 입력: ");
		rect.setWidth(sc.nextInt());
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
		
	}
}
