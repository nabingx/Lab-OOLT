package Lab11.src.hust.soict.hedspi.aims.order;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import javax.naming.LimitExceededException;

import Lab11.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab11.src.hust.soict.hedspi.media.Book;
import Lab11.src.hust.soict.hedspi.media.Media;

public class Order {

	public static final int MAX_NUMBERS_ORDERED = 5; // có thể cho cái này bằng 3 hay 4 để test báo lỗi ko add đc thêm
	public static double FIXED_PROBALITY = 0.6;
	private int qtyOrdered = 0;
	private static int nbOrders = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private ArrayList<Media> itemsOrdered2 = new ArrayList<Media>();
	private float threshold = 0.0f;
	
	private String day;
	private String month;
	private String curYear;
	
	/*void createNewDVD() {
		for(int i = 0; i < 10; i++) {
			itemsOrdered[i] = new DigitalVideoDisc(null, null, null, 0, 0);
		}
	}*/
	
	public void addMedia(Media media) {
		if(itemsOrdered2.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered2.add(media); // <, not <=
			qtyOrdered++;
			nbOrders++;
			//threshold += media.getCost() * 0.12;
		}
		else System.out.println("Can't add " + media.getTitle());
	}
	
	public void removeMedia(Media media) {
		if(itemsOrdered2.contains(media)) {
			itemsOrdered2.remove(media);
			qtyOrdered--;
			nbOrders--;
			threshold -= media.getCost() * 0.12;
		}
		else System.out.println(media.getTitle() + " doesn't exist!");
	}
	
	public int getMediaSize() {
		return itemsOrdered2.size();
	}
	
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
		}else { 
			System.out.println("Can't add " + disc.getTitle());
		}
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
	
	public void addMedia(Media[] media) {
		for(int i = 0; i < media.length; i++) {
			addMedia(media[i]);
		}
	}
	
	public void addMedia(Media m1, Media m2) {
		addMedia(m1);
		addMedia(m2);
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public float totalCost2() {
		float total = 0;
		for(int i = 0; i < itemsOrdered2.size(); i++) {
			total += itemsOrdered2.get(i).getCost();
		}
		return total;
	}

	public String getItemsOrderedTitle(int i) {
		return itemsOrdered[i].getTitle();
	}
	
	public int getItemsOrderedLength(int i) {
		return itemsOrdered[i].getLength();
	}
	
	public String getItemsOrdered(int i) {
		assert i > MAX_NUMBERS_ORDERED : "Out of Order Length";
		return itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector()
				 + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$";
	}
	
	public String getItemsOrdered2(int i) {
		assert i > MAX_NUMBERS_ORDERED : "Out of Order Length";
		return itemsOrdered2.get(i).getTitle() + " - " + itemsOrdered2.get(i).getCategory()
				+ ": " + itemsOrdered2.get(i).getCost() + "$";
	}
	
	public Media getItemsOrdered2Media(int i) {
		return itemsOrdered2.get(i);
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		assert qtyOrdered > MAX_NUMBERS_ORDERED : "Out of Default Length";
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
	
	public Media getALuckyItem2() {
		int ratio = getALuckyItemIndex2();
		Media lucky = itemsOrdered2.get(ratio);
		if(getPercentageLuckyItem2(ratio) > 0) return lucky;
		else {
			Media temp = new Book(null);
			temp.setCost(0);
			return temp;
		}
		//lucky.setCost(0);
		//return lucky;
	}
	
	public int getALuckyItemIndex() {
		double rd = Math.random() * qtyOrdered;
		int i = (int) rd;
		//return itemsOrdered[i];
		return i;
	}
	
	public int getALuckyItemIndex2() {
		double rd = Math.random() * itemsOrdered2.size();
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
	
	public int getOrderIndex2(Media media) {
		for(int i = 0; i < itemsOrdered2.size(); i++) {
			if(itemsOrdered2.get(i) == media) return i + 1;  
		}
		return 0;
	}
	
	/*public Order() throws LimitExceededException{
		if (Order.nbOrders < MAX_NUMBERS_ORDERED) {
			// TODO Set initial values for object attributes
			nbOrders = nbOrders;
		}
		else {
			throw new LimitExceededException("ERROR: The number of orders has reached its limit!");
		}
	}*/

	public int getNbOrders() {
		return nbOrders;
	}

	public void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}

	public static double getFIXED_PROBALITY() {
		return FIXED_PROBALITY;
	}

	public static void setFIXED_PROBALITY(double fIXED_PROBALITY) {
		FIXED_PROBALITY = fIXED_PROBALITY;
	}

	public float getThreshold() {
		//sthreshold = totalCost2() * 0.12;
		return threshold;
	}

	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	
	public float defaultThreshold() {
		return threshold = (float) (totalCost2() * 0.12);
		
	}

	public int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}
	
	public double getPercentageLuckyItem2(int base_rate) { // Threshold
		//int base_rate = getALuckyItemIndex2();
		double rate = base_rate / itemsOrdered2.size();
		if (rate < FIXED_PROBALITY) return rate;
		else return 0;
	}
	
}
