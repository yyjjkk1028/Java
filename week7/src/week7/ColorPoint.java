package week7;

public class ColorPoint extends Point{
	private String color; // 점의 색
	
	public void setColor(String color) {
		this.color = color;
		x = 10; y = 20;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color + "(" + x + "," + y + ")");
	}
}