package week9;

public class CastTest {
	public static void main(String[] args) {
		byte b = 1; int i = 6;
		i = b; //���� ū �� ������ ���� ��
		//b = i; ���� ���� �� ������ ū �� (x)
		b = (byte) i; //�����ս��� �߻��ϴ��� casting�� �ϸ� �� 
		SubCls sub = new SubCls(100, 99, 100);
		SupCls sup = new SupCls(95,89,100);
		SupCls sup1 = new SubCls(95,85,55); //���� �θ� ������ �ڽ�
		Object sup2 = new SubCls();
		//SubCls sub1 = new SupCls(); ���� �ڽ� ������ �θ� (x)
		SubCls nsub = (SubCls)sup1;
		System.out.println(sub);
		System.out.println(sup);
		System.out.println(sup1);
		System.out.println(sup2);
		System.out.println(nsub);
	}
}
