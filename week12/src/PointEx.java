import java.util.Objects;

class Point{
	private int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}


	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class PointEx {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = a;
		
		System.out.println(p.toString()); // 객체의 문자열
		if (a == b) {
			System.out.println(a.hashCode() + "와" + b.hashCode() +"같습니다.");
		}
		else {
			System.out.println(a.hashCode() + "와" + b.hashCode() +"같지않습니다.");
		}
		if (a == c) {
			System.out.println(a.hashCode() + "와" + c.hashCode() +"같습니다.");
		}
		else {
			System.out.println(a.hashCode() + "와" + c.hashCode() +"같지않습니다.");
		}
		if (a.equals(b)) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("같지않습니다.");
		}
	}
}
