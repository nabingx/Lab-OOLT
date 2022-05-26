package Lab07.src.hust.soict.hedspi.test.disc;

import Lab07.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab07.src.hust.soict.hedspi.aims.order.Order;
import Lab07.src.hust.soict.hedspi.media.Media;
import Lab07.src.hust.soict.hedspi.media.Book;

public class DiskTest extends TestPassingParameter{

	public static void main(String[] args) {
		
		// Hiểu rõ cách hoạt động của super

		Media dvd = new DigitalVideoDisc("Stars Under The Sea");
		//dvd.setCost(4.6f);
		System.out.println("subSearch result = " + dvd.subSearch("Under"));
		System.out.println("search result = " + dvd.search("Sea Under The"));
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		jungleDVD.setCost(2.7f);
		//System.out.println(jungleDVD.getTitle());
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		//cinderellaDVD.setCost(3.2f);
		DigitalVideoDisc[] stapeDVD = {new DigitalVideoDisc("Alpha"), new DigitalVideoDisc("Beta")};
		stapeDVD[0].setCost(2.3f);
		stapeDVD[1].setCost(4.3f);
		DigitalVideoDisc sigmaDVD = new DigitalVideoDisc("Sigma");
		sigmaDVD.setCost(5.6f);
		DigitalVideoDisc gammaDVD = new DigitalVideoDisc("Gamma");
		gammaDVD.setCost(7.1f);
		Book book1 = new Book("Miss Crane");
		book1.setCost(3.8f);
		
		Order anOrder = new Order();
		//anOrder.addDigitalVideoDisc(jungleDVD);
		//anOrder.addDigitalVideoDisc(cinderellaDVD); - old
		//anOrder.addDigitalVideoDisc(stapeDVD);
		//anOrder.addDigitalVideoDisc(dvd);
		//anOrder.addDigitalVideoDisc(sigmaDVD, gammaDVD);
		anOrder.addMedia(jungleDVD);
		anOrder.addMedia(stapeDVD);
		anOrder.addMedia(dvd);
		anOrder.addMedia(sigmaDVD, gammaDVD);
		anOrder.addMedia(book1);
		
		anOrder.removeMedia(gammaDVD);
		//anOrder.removeMedia(book1);
		
		print(anOrder);
		
		//DigitalVideoDisc luckyDisc = anOrder.getALuckyItem();
		//System.out.println("Lucky DVD Item: " + luckyDisc.getTitle() + " - " + luckyDisc.getCost() + "$ - " + anOrder.getOrderIndex(luckyDisc));
		// Vì là Lucky Item nên set lại giá = 0
		
		Media luckyMedia = anOrder.getALuckyItem2();
		System.out.println("Lucky Item: " + luckyMedia.getTitle() + " - " + luckyMedia.getCost() + "$ - " + anOrder.getOrderIndex2(luckyMedia));

	}
	
	public static void print(Order anOrder) {
		System.out.println("************Order************");
		anOrder.MyDate();
		System.out.println("Order Items:");
		for(int i = 0; i < anOrder.getMediaSize(); i++) {
			//System.out.println((i + 1) + ". DVD - " + anOrder.getItemsOrdered2(i));
			System.out.println((i + 1) + ". " + anOrder.getItemsOrdered2(i));
		}
		System.out.println("Total cost: " + anOrder.totalCost2() + "$"); // totalCost bê từ bài trước nên hàm này vẫn đúng
	}

}
