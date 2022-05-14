package Lab05.src.hust.soict.hedspi.aims.order;

import java.text.SimpleDateFormat;
import java.util.Date;

import Lab05.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Order {

	public static final int MAX_NUMBERS_ORDERED = 10; // có thể cho cái này bằng 3 hay 4 để test báo lỗi ko add đc thêm
	private int qtyOrdered = 0;
	private static int nbOrders = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private String day;
	private String month;
	private String curYear;
	
	/*void createNewDVD() {
		for(int i = 0; i < 10; i++) {
			itemsOrdered[i] = new DigitalVideoDisc(null, null, null, 0, 0);
		}
	}*/
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			//itemsOrdered[qtyOrdered].setTitle(disc.getTitle());
			//itemsOrdered[qtyOrdered].setCategory(disc.getCategory());
			//itemsOrdered[qtyOrdered].setDirector(disc.getDirector());
			//itemsOrdered[qtyOrdered].setLength(disc.getLength());
			//itemsOrdered[qtyOrdered].setCost(disc.getCost());
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			nbOrders++;
		}else System.out.println("Can't add " + disc.getTitle());
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered--;
				nbOrders--;
				break;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] disc) {
		for(int i = 0; i < disc.length; i++) {
			addDigitalVideoDisc(disc[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		addDigitalVideoDisc(d1);
		addDigitalVideoDisc(d2);
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	public String getItemsOrdered(int i) {
		return itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector()
				 + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$";
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void MyDate(){
		/*SimpleDateFormat formatter= new SimpleDateFormat("EEEE yyyy-MM-dd 'at' HH:mm:ss a");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));*/
		
		day = "dd";
		month = "MMMM";
		curYear = "yyyy";
		
		//Set the pattern
        //String pattern = "dd MMMM yyyy, EEEE,hh:mm a";
		String pattern = day + " " + month + " " + curYear + ", hh:mm a";
       
        //Create SimpleDateFormat Object
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       
        //Convert date to the string value
        String dateVal = simpleDateFormat.format(new Date());
       
        //Split the date value based on comma(,)
        String[] today_arr = dateVal.split(", ");
       
        //Print the formatted output
        System.out.println("Date - " + today_arr[0] + /*"\nDay - " + today_arr[1] + */"\nTime - " + today_arr[1]);
	}
	
	public DigitalVideoDisc getALuckyItem() {
		DigitalVideoDisc lucky = itemsOrdered[getALuckyItemIndex()];
		lucky.setCost(0);
		return lucky;
	}
	
	public int getALuckyItemIndex() {
		double rd = Math.random() * qtyOrdered;
		int i = (int) rd;
		//return itemsOrdered[i];
		return i;
	}
	
	public int getOrderIndex(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) return i + 1;  
		}
		return 0;
	}

}
