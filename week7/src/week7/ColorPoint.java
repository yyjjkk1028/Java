package week7;

public class ColorPoint extends Point{
	private String color; // ���� ��
	
	public void setColor(String color) {
		this.color = color;
		x = 10; y = 20;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color + "(" + x + "," + y + ")");
	}
}