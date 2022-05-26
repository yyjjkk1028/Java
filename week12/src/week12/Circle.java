package week12;

public class Circle extends Shape {
	public Circle() {
		name = "Circle";
	}
	@Override
	public void draw() {
		System.out.println(name);
	}
}
