package Lab08.src.hust.soict.hedspi.test.media;

import Lab08.src.hust.soict.hedspi.media.Book;

public class BookTest {

	public static void main(String[] args) {

		Book book1 = new Book("Lalala");
		book1.setContent("One Two Three Four Apex");
		book1.setContentTokens();
		book1.getContentTokens();
		
	}

}
