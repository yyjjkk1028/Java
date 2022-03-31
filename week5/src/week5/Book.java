package week5;

public class Book {
	String tite, author;

	public Book(String tite, String author) {
		this.tite = tite;
		this.author = author;
	}

	public Book(String tite) {
		this.author = "¿€∞°πÃªÛ";
		this.tite = tite;
		
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("æÓ∏∞ø’¿⁄","Ωﬂ∂º¡„∫£∏Æ");
		Book loveStory = new Book("√·«‚¿¸");
		System.out.println(littlePrince.tite + "  " + littlePrince.author);
		System.out.println(loveStory.tite + "  " + loveStory.author);
	}
	

}
