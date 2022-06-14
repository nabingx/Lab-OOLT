package Lab10.src.hust.soict.hedspi.test.media;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.naming.LimitExceededException;

import Lab10.src.hust.soict.hedspi.aims.disc.CompactDisc;
import Lab10.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab10.src.hust.soict.hedspi.aims.order.Order;
import Lab10.src.hust.soict.hedspi.media.Book;
import Lab10.src.hust.soict.hedspi.media.Track;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		jungleDVD.setCost(2.7f);
		jungleDVD.setLength(87);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		cinderellaDVD.setCost(3.2f);
		cinderellaDVD.setLength(124);
		DigitalVideoDisc[] stapeDVD = {new DigitalVideoDisc("Alpha"), new DigitalVideoDisc("Beta")};
		stapeDVD[0].setCost(7.1f);
		stapeDVD[0].setLength(90);
		stapeDVD[1].setCost(4.3f);
		stapeDVD[1].setLength(3);
		DigitalVideoDisc sigmaDVD = new DigitalVideoDisc("Sigma");
		sigmaDVD.setCost(5.6f);
		sigmaDVD.setLength(4);
		DigitalVideoDisc gammaDVD = new DigitalVideoDisc("Gamma");
		gammaDVD.setCost(5.6f);
		gammaDVD.setLength(6);
		
		CompactDisc cd1 = new CompactDisc("MVP");
		cd1.addTrack(new Track("Hello1"));
		cd1.addTrack(new Track("Hello2"));
		CompactDisc cd2 = new CompactDisc("ABCD");
		cd2.addTrack(new Track("Hello3"));
		
		Book book1 = new Book("Fahasa");
		
		System.out.println(sigmaDVD.compareTo(cinderellaDVD));
		System.out.println(jungleDVD.compareTo(sigmaDVD));
		System.out.println(sigmaDVD.compareTo(cd1));
		System.out.println(sigmaDVD.compareTo(book1));
		System.out.println(cd1.compareTo(cd2));
		
		Order anOrder = null;
		try {
			anOrder = new Order();
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		anOrder.addDigitalVideoDisc(jungleDVD);
		anOrder.addDigitalVideoDisc(cinderellaDVD);
		anOrder.addDigitalVideoDisc(stapeDVD);
		anOrder.addDigitalVideoDisc(sigmaDVD, gammaDVD);
		
		for(int i = 0; i < anOrder.getQtyOrdered(); i++) {
			System.out.println("Playing DVD: " + anOrder.getItemsOrderedTitle(i));
			System.out.println("DVD Length: " + anOrder.getItemsOrderedLength(i));
		}
		
		Collection<DigitalVideoDisc> collection = new java.util.ArrayList<DigitalVideoDisc>();
		
		// Add the CD, DVD or Book objects to the ArrayList
		collection.add(jungleDVD);
		collection.add(cinderellaDVD);
		collection.add(stapeDVD[0]);
		collection.add(stapeDVD[1]);
		collection.add(sigmaDVD);
		collection.add(gammaDVD);
		//collection.add(cd1);
		//collection.add(book1);
		System.out.println(collection.contains(sigmaDVD));
		//collection.remove(sigmaDVD);
		
		// Iterate through the ArrayList and output their titles
		// (unsorted order)
		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		
		System.out.println("----------------------------------");
		System.out.println("The DVDs currently in the order are:");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		// Sort the collection of DVDs - based on the compareTo()
		// method
		Collections.sort((List<DigitalVideoDisc>) collection);
		
		// Iterate through the ArrayList and output their titles
		// (unsorted order)
		iterator = collection.iterator();
		
		System.out.println("----------------------------------");
		System.out.println("The DVDs currently in the order are:");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		System.out.println("----------------------------------");
		
		// Ä�Ă£ cĂ³ modify template á»Ÿ cĂ¡c class
	}

}