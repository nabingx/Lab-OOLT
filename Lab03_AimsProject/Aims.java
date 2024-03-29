package Lab03_AimsProject;

import Lab03_AimsProject.Order;

public class Aims {

	public static void main(String[] args) {
		
		Order anOrder = new Order();
		// anOrder.createNewDVD();
		// create a new dvd object an set the fields
		/*DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);*/
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		/*DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);*/
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		/*DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);*/
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total Cost after removing dvd3 is: " + anOrder.totalCost());

	}

}
