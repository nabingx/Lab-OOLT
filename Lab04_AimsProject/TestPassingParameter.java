package Lab04_AimsProject;

public class TestPassingParameter {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		DigitalVideoDisc[] stapeDVD = {new DigitalVideoDisc("Alpha"), new DigitalVideoDisc("Beta")};
		DigitalVideoDisc sigmaDVD = new DigitalVideoDisc("Sigma");
		DigitalVideoDisc gammaDVD = new DigitalVideoDisc("Gamma");
		
		Order anOrder = new Order();
		anOrder.addDigitalVideoDisc(jungleDVD);
		anOrder.addDigitalVideoDisc(cinderellaDVD);
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
