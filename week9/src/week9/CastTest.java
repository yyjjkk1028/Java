package week9;

public class CastTest {
	public static void main(String[] args) {
		byte b = 1; int i = 6;
		i = b; //왼쪽 큰 수 오른쪽 작은 수
		//b = i; 왼쪽 작은 수 오른쪽 큰 수 (x)
		b = (byte) i; //정보손실이 발생하더랃 casting을 하면 됨 
		SubCls sub = new SubCls(100, 99, 100);
		SupCls sup = new SupCls(95,89,100);
		SupCls sup1 = new SubCls(95,85,55); //왼쪽 부모 오른쪽 자식
		Object sup2 = new SubCls();
		//SubCls sub1 = new SupCls(); 왼쪽 자식 오른쪽 부모 (x)
		SubCls nsub = (SubCls)sup1;
		System.out.println(sub);
		System.out.println(sup);
		System.out.println(sup1);
		System.out.println(sup2);
		System.out.println(nsub);
	}
}
