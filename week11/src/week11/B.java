package week11;

public class B extends A{
	void f() {
		System.out.println("부모 클래스의 메소드 호출");
		super.f();
		System.out.println("이 메소드는 재정의한 메소드입니다");
	}
	void g() {
		System.out.println("자식클래스의 g 메소드");
	}
}
