package week4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�: ");
		int sum = 0;
		int n = 0;
		for (int i = 0; i < 3; i++) 
		{
			System.out.print(i+ ">>");
			try {
				n = sc.nextInt();
				} 
			catch (InputMismatchException e) 
				{
				System.out.println("������ �ƴմϴ�, �ٽ��Է��ϼ���.");
				sc.next();
				i--;
				continue;
				}
			sum += n;
		}
		System.out.println("����"+ sum);
		sc.close();
	}

}
