package Lab08.src.hust.soict.hedspi.test.media;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Lab08.src.hust.soict.hedspi.aims.disc.CompactDisc;
import Lab08.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab08.src.hust.soict.hedspi.media.Book;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		
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
		CompactDisc cd1 = new CompactDisc("MVP");
		Book book1 = new Book("Fahasa");
		
		System.out.println(sigmaDVD.compareTo(cinderellaDVD));
		System.out.println(jungleDVD.compareTo(sigmaDVD));
		System.out.println(sigmaDVD.compareTo(cd1));
		
		Collection<DigitalVideoDisc> collection = new java.util.ArrayList();
		
		// Add the CD, DVD or Book objects to the ArrayList
		collection.add(jungleDVD);
		collection.add(cinderellaDVD);
		collection.add(stapeDVD[0]);
		collection.add(stapeDVD[1]);
		collection.add(sigmaDVD);
		collection.add(gammaDVD);
		//collection.add(cd1);
		//collection.add(book1);
		//collection.remove(cinderellaDVD);
		
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
		Collections.sort((List) collection);
		
		// Iterate through the ArrayList and output their titles
		// (unsorted order)
		iterator = collection.iterator();
		
		System.out.println("----------------------------------");
		System.out.println("The DVDs currently in the order are:");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		
		System.out.println("----------------------------------");
		
	}

}