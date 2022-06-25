package Lab11.src.hust.soict.hedspi.test.disc;

import javax.naming.LimitExceededException;

import Lab11.src.hust.soict.hedspi.aims.PlayerException;
import Lab11.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab11.src.hust.soict.hedspi.aims.order.Order;
import Lab11.src.hust.soict.hedspi.media.Media;
import Lab11.src.hust.soict.hedspi.media.Book;
import Lab11.src.hust.soict.hedspi.aims.disc.*;

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
		CompactDisc cd1 = new CompactDisc("Amily");
		cd1.setCost(3.2f);
		cd1.setLength(-2);
		
		Order anOrder = null;
		anOrder = new Order();
		
		anOrder.addMedia(jungleDVD);
		anOrder.addMedia(stapeDVD);
		anOrder.addMedia(dvd);
		anOrder.addMedia(sigmaDVD, gammaDVD);
		anOrder.addMedia(book1);
		
		try {
			Order(anOrder);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("A problem occured: " + e);
		}
		
		anOrder.removeMedia(gammaDVD);
		//anOrder.removeMedia(book1);
		
		print(anOrder);
		
		//DigitalVideoDisc luckyDisc = anOrder.getALuckyItem();
		//System.out.println("Lucky DVD Item: " + luckyDisc.getTitle() + " - " + luckyDisc.getCost() + "$ - " + anOrder.getOrderIndex(luckyDisc));
		// Vì là Lucky Item nên set lại giá = 0
		
		Media luckyMedia = anOrder.getALuckyItem2();
		System.out.println("Lucky Item: " + luckyMedia.getTitle() + " - " + luckyMedia.getCost() + "$ - " + anOrder.getOrderIndex2(luckyMedia));
		
		jungleDVD.setLength(-1);
		try {
			jungleDVD.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			System.err.println("A problem occured: " + e);
		}
		
		try {
			cd1.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			System.err.println("A problem occured: " + e);
		}

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
	
	public static void Order(Order anOrder) throws LimitExceededException{
		if (anOrder.getNbOrders() < anOrder.getMaxNumbersOrdered()) {
			// TODO Set initial values for object attributes
			anOrder.setNbOrders(anOrder.getNbOrders());
		}
		else {
			throw new LimitExceededException("ERROR: The number of orders has reached its limit!");
		}
	}

}
