package Lab10.src.hust.soict.hedspi.test.disc;

import javax.naming.LimitExceededException;

import Lab10.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab10.src.hust.soict.hedspi.aims.order.Order;

public class TestPassingParameter {

	public static void main(String[] args) throws LimitExceededException {

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
		
		Order anOrder = null;
		anOrder = new Order();
		
		anOrder.addDigitalVideoDisc(jungleDVD);
		//anOrder.addDigitalVideoDisc(cinderellaDVD);
		anOrder.addDigitalVideoDisc(stapeDVD);
		anOrder.addDigitalVideoDisc(sigmaDVD, gammaDVD);
		
		for(int i = 0; i < anOrder.getQtyOrdered(); i++) {
			System.out.println(anOrder.getItemsOrdered(i));
		}
		
		/*Swap swap = new Swap();
		swap.swap(jungleDVD, cinderellaDVD);
		jungleDVD = swap.getO1();
		cinderellaDVD = swap.getO2();*/
		swap(jungleDVD, cinderellaDVD);
		System.out.println("********After swap********\njungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title :" + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		print(anOrder);
		
		//Order anOrder2 = new Order();
		//anOrder2.addDigitalVideoDisc(jungleDVD);
		//anOrder2.addDigitalVideoDisc(sigmaDVD, gammaDVD);
		//anOrder2.addDigitalVideoDisc(cinderellaDVD);
		//anOrder2.addDigitalVideoDisc(stapeDVD);
		
		//print(anOrder2);
		
		DigitalVideoDisc luckyDisc = anOrder.getALuckyItem();
		System.out.println("Lucky DVD Item: " + luckyDisc.getTitle() + " - " + luckyDisc.getCost() + "$ - " + anOrder.getOrderIndex(luckyDisc));
		
		//DigitalVideoDisc luckyDisc2 = anOrder2.getALuckyItem();
		//System.out.println("Lucky DVD Item: " + luckyDisc2.getTitle() + " - " + luckyDisc2.getCost() + "$ - " + anOrder2.getOrderIndex(luckyDisc2));
		
		//print(anOrder2);
		
	}
	
		public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
			String tmp = o1.getTitle();
			o1.setTitle(o2.getTitle());
			o2.setTitle(tmp);
			
			tmp = o1.getCategory();
			o1.setCategory(o2.getCategory());
			o2.setCategory(tmp);
			
			tmp = o1.getDirector();
			o1.setDirector(o2.getDirector());
			o2.setDirector(tmp);
			
			int tmp1 = o1.getLength();
			o1.setLength(o2.getLength());
			o2.setLength(tmp1);
			
			float tmp2 = o1.getCost();
			o1.setCost(o2.getCost());
			o2.setCost(tmp2);
		}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void print(Order anOrder) {
		System.out.println("************Order************");
		anOrder.MyDate();
		System.out.println("Order Items:");
		for(int i = 0; i < anOrder.getQtyOrdered(); i++) {
			System.out.println((i + 1) + ". DVD - " + anOrder.getItemsOrdered(i));
		}
		System.out.println("Total cost: " + anOrder.totalCost() + "$"); // totalCost bê từ bài trước nên hàm này vẫn đúng
	}

}
