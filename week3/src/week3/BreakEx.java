package week3;

import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
//		while(true) 
//		{
//			System.out.println(">>");
//			String txt = sc.next();
//			if(txt.equals("exit"))
//				break;
//		}
		for(;;) 
		{
			System.out.println(">>");
			String txt = sc.next();
			if(txt.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�.");
	}

}
