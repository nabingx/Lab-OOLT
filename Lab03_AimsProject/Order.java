package Lab03_AimsProject;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	/*void createNewDVD() {
		for(int i = 0; i < 10; i++) {
			itemsOrdered[i] = new DigitalVideoDisc(null, null, null, 0, 0);
		}
	}*/
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			//itemsOrdered[qtyOrdered].setTitle(disc.getTitle());
			//itemsOrdered[qtyOrdered].setCategory(disc.getCategory());
			//itemsOrdered[qtyOrdered].setDirector(disc.getDirector());
			//itemsOrdered[qtyOrdered].setLength(disc.getLength());
			//itemsOrdered[qtyOrdered].setCost(disc.getCost());
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}else System.out.println("Can't add more");
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				break;
			}
		}
	}
	
	float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
}
