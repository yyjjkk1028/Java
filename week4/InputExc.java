package week4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오: ");
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
				System.out.println("정수가 아닙니다, 다시입력하세요.");
				sc.next();
				i--;
				continue;
				}
			sum += n;
		}
		System.out.println("합은"+ sum);
		sc.close();
	}

}
