package week9;

class A{
	public A() { System.out.println("������ A"); }
	public A(int a) { System.out.println("������ Aa"); }
}
class B extends A{
	public B() { System.out.println("������ B");	}
	public B(int b) { System.out.println("������ Bb");	}
}
class C extends B{
	public C() { System.out.println("������ C");	}
	public C(int c) {
		super();
		System.out.println("������ Cc");	}
}

public class ConstructorEx {
	public static void main(String[] args) {
		C c = new C();
		C c1 = new C(1);
	}
}
