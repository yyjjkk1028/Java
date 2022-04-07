package week6;

import java.util.Scanner;

class Book{
	String title, author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
public class BookArray {
	public static void main(String[] args) {
		Book[] book = new Book[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.print("����>>");
			String title = sc.next();
			System.out.print("����>>");
			String author = sc.next();
			book[i] = new Book(title,author);
		}
		for (int i = 0; i < book.length; i++) 
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		
		sc.close();
	}
}
