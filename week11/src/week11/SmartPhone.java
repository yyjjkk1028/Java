package week11;

public class SmartPhone extends Calc implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("Ring ring");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 4));
		phone.schedule();
	}
}
