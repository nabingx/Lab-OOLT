package Lab06.src.hust.soict.hedspi.media;

import Lab06.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Media {
	
	private String title;
	private String category;
	private float cost;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String title) {
		this.title = title;
	}
	
}
