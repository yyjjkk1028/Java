package week9;

class A{
	public A() { System.out.println("持失切 A"); }
	public A(int a) { System.out.println("持失切 Aa"); }
}
class B extends A{
	public B() { System.out.println("持失切 B");	}
	public B(int b) { System.out.println("持失切 Bb");	}
}
class C extends B{
	public C() { System.out.println("持失切 C");	}
	public C(int c) {
		super();
		System.out.println("持失切 Cc");	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C(1);
	}
}
