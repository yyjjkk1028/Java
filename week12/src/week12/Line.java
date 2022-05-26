package week12;

public class Line extends Shape {
	public Line() {
		name = "Line";
	}
	@Override
	public void draw() {
		System.out.println(name);
	}

}
