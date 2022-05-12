package week11;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("Ring ring");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
}
