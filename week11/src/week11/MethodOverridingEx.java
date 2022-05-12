package week11;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		//Line line = new Line();
		Rect rect = new Rect();
		paint(rect);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
