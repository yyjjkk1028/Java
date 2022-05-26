package week12;

public abstract class Shape {
	String name;
	private Shape next;
	public Shape() {
		next = null;
	}
	public Shape getNext() {
		return next;
	}
	public void setNext(Shape next) {
		this.next = next;
	}
	public abstract void draw();
}
