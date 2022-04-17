package Lab03_AimsProject;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	void createNewDVD() {
		for(int i = 0; i < 10; i++) {
			itemsOrdered[i] = new DigitalVideoDisc(null, null, null, 0, 0);
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 10) {
			itemsOrdered[qtyOrdered].setTitle(disc.getTitle());
			itemsOrdered[qtyOrdered].setCategory(disc.getCategory());
			itemsOrdered[qtyOrdered].setDirector(disc.getDirector());
			itemsOrdered[qtyOrdered].setLength(disc.getLength());
			itemsOrdered[qtyOrdered].setCost(disc.getCost());
			qtyOrdered++;
		}else System.out.println("Can't add more");
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i <= qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle() == disc.getTitle() && itemsOrdered[i].getCategory() == disc.getCategory() && itemsOrdered[i].getDirector() == disc.getDirector() && itemsOrdered[i].getLength() == disc.getLength() && itemsOrdered[i].getCost() == disc.getCost()) {
				itemsOrdered[i].setTitle(null);
				itemsOrdered[i].setCategory(null);
				itemsOrdered[i].setDirector(null);
				itemsOrdered[i].setLength(0);
				itemsOrdered[i].setCost(0); // 0.0f ðúng hõn
				qtyOrdered--;
			}
		}
	}
	
	float totalCost() {
		float total = 0;
		for(int i = 0; i <= qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
}
