package week3;

import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		
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
		System.out.println("종료합니다.");
	}

}
