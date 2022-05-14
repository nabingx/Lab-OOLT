package Lab05.src.hust.soict.hedspi.test.disc;

import Lab05.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab05.src.hust.soict.hedspi.aims.order.Order;

public class DiskTest extends TestPassingParameter{

	public static void main(String[] args) {
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("Stars Under The Sea");
		dvd.setCost(4.6f);
		System.out.println("subSearch result = " + dvd.subSearch("Under"));
		System.out.println("search result = " + dvd.search("Sea Under The"));
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		jungleDVD.setCost(2.7f);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		cinderellaDVD.setCost(3.2f);
		DigitalVideoDisc[] stapeDVD = {new DigitalVideoDisc("Alpha"), new DigitalVideoDisc("Beta")};
		stapeDVD[0].setCost(2.3f);
		stapeDVD[1].setCost(4.3f);
		DigitalVideoDisc sigmaDVD = new DigitalVideoDisc("Sigma");
		sigmaDVD.setCost(5.6f);
		DigitalVideoDisc gammaDVD = new DigitalVideoDisc("Gamma");
		gammaDVD.setCost(7.1f);
		
		Order anOrder = new Order();
		anOrder.addDigitalVideoDisc(jungleDVD);
		//anOrder.addDigitalVideoDisc(cinderellaDVD);
		anOrder.addDigitalVideoDisc(stapeDVD);
		anOrder.addDigitalVideoDisc(dvd);
		anOrder.addDigitalVideoDisc(sigmaDVD, gammaDVD);
		
		print(anOrder);
		
		DigitalVideoDisc luckyDisc = anOrder.getALuckyItem();
		System.out.println("Lucky DVD Item: " + luckyDisc.getTitle() + " - " + luckyDisc.getCost() + "$ - " + anOrder.getOrderIndex(luckyDisc));
		// Vì là Lucky Item nên set lại giá = 0

	}

}
