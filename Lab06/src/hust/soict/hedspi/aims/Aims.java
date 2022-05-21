package Lab06.src.hust.soict.hedspi.aims;

import java.util.Scanner;

import Lab06.src.hust.soict.hedspi.aims.order.Order;
import Lab06.src.hust.soict.hedspi.media.Media;
import Lab06.src.hust.soict.hedspi.test.disc.TestPassingParameter;

public class Aims extends TestPassingParameter{
	
	public static void main(String[] args) {
		showMenu();
		int choice = 0;
		String newTitle = new String();
		//int counter = 0;
		Order anOrder = null;
		int id = 0;
		
		while(choice < 5) {
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
				break;
			case 2:
				System.out.print("New Item's Title: ");
				newTitle = sc.next();
				anOrder.addMedia(new Media(newTitle));
				break;
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
			default:
				System.out.println("Wrong number. Please try again");
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
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

}
