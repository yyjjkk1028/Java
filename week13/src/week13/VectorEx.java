package week13;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>(); // var v = new Vector<Integer>();��  Vector<Integer> v = new Vector<>(); �� �ص� ��
		v.add(5); // 5 ����
		v.add(4); // 4 ����
		v.add(-1); // -1 ����
		
		// ���� �߰��� �����ϱ�
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����

		System.out.println("���� ���� ��� ��ü �� : " + v.size()); // ũ�� 3
		System.out.println("������ ���� �뷮 : " + v.capacity()); // ������ ����Ʈ �뷮 10
		
		// ��� ��� ���� ����ϱ�
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i); // ������ i ��° ����
			System.out.println(n);
		}
		
		// ���� ���� ��� ���� ���ϱ�
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); // ������ i ��° ����
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}
}