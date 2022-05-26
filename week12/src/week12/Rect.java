package week12;

public class Rect extends Shape {
	public Rect() {
		name = "Rect";
	}
	@Override
	public void draw() {
		System.out.println(name);
	}
}
