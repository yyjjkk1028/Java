package week5;
class Circle{
	int radius;
	String name;
	// method overloading	�Ű������� Ÿ��, ����, ��ġ  --> �ñ״�ó
	public Circle() {
		
	}
	public Circle(int radius, String name) {
		this.radius = radius; //this(radius);
		this.name = name;
	}
	double getArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}
public class Pizza {
	public static void main(String[] args) {
		Circle pizza = new Circle(5,"�ڹ�����");
		//pizza.radius = 5;
		//pizza.name = "�ڹ�����";
		System.out.println(pizza.name +"�� ������ " + pizza.getArea(pizza.radius));
		Circle donut = new Circle(2,"�ڹٵ���");
		//donut.radius = 2;
		//donut.name = "�ڹٵ���";
		System.out.println(donut.name +"�� ������ " + donut.getArea(donut.radius));
	}

}
