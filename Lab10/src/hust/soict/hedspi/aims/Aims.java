package Lab10.src.hust.soict.hedspi.aims;

import java.util.Scanner;

import javax.naming.LimitExceededException;

import Lab10.src.hust.soict.hedspi.aims.disc.CompactDisc;
import Lab10.src.hust.soict.hedspi.aims.order.Order;
import Lab10.src.hust.soict.hedspi.media.Media;
import Lab10.src.hust.soict.hedspi.test.disc.TestPassingParameter;
import Lab10.src.hust.soict.hedspi.media.Book;

// Nhá»› chá»�n 1 khi menu láº§n Ä‘áº§u show ra Ä‘á»ƒ khá»Ÿi táº¡o anOrder

public class Aims extends TestPassingParameter{
	
	public static void main(String[] args) throws LimitExceededException {
		showMenu();
		int choice = 0;
		String newTitle = new String();
		//int counter = 0;
		Order anOrder = null;
		int id = 0; // for case 3
		int c = 0; // for case 2's switch case
		int count = 0;
		
		while(choice < 6) {
			System.out.print("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 0: {
				System.exit(0);
				break;
			}
			case 1:
				anOrder = new Order();
				System.out.println("Initialize anOrder successfully!");
				break;
			/*case 2:
				System.out.print("New Item's Title: ");
				newTitle = sc.next();
				//anOrder.addMedia(new Media(newTitle));
				Media media = new Media(newTitle);
				anOrder.addMedia();
				break;*/
			case 3:
				System.out.println("Enter id(number): ");
				id = sc.nextInt();
				id--;
				anOrder.removeMedia(anOrder.getItemsOrdered2Media(id));
				break;
			case 4:
				for(int i = 0; i < anOrder.getMediaSize(); i++) {
					System.out.println( (i + 1) + ". " + anOrder.getItemsOrdered2(i));
				}
				break;
			case 2:
				System.out.print("Choose a number (Book - 1, CD - 2, DVD - 3): ");
				c = sc.nextInt();
				switch (c) {
				case 1:
					System.out.println("New Book's Title: ");
					newTitle = sc.next();
					Book book = new Book(newTitle);
					count++;
					book.setId(count);
					anOrder.addMedia(book);
					break;
				case 2:
					System.out.println("New CD's Title: ");
					newTitle = sc.next();
					CompactDisc cd = new CompactDisc(newTitle);
					count++;
					cd.setId(count);
					anOrder.addMedia(cd);
					System.out.println("Do you want to play the CD(yes/no)?");
					if(sc.next().equals("yes")) cd.play();
					break;
				case 3:
					System.out.println("New DVD's Title: ");
					newTitle = sc.next();
					CompactDisc dvd = new CompactDisc(newTitle);
					count++;
					dvd.setId(count);
					anOrder.addMedia(dvd);
					System.out.println("Do you want to play the DVD(yes/no)?");
					String input = sc.next();
					if(input.equals("yes")) dvd.play();
					break;
				default:
					System.out.println("Wrong number of disc");
					break;
				}
			default:
				System.out.println("Wrong number. Please try again");
				break; // Em ko hiá»ƒu sao sau khi xong case 2 cá»§a choice nĂ³ cá»© in cĂ¡i default nĂ y áº¡
				}
		}
	}
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		//System.out.println("5. Add Book, CD or DVD to the order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

}
