package Lab06.src.hust.soict.hedspi.aims.disc;

import Lab06.src.hust.soict.hedspi.media.Media;

public class DigitalVideoDisc extends Media{

	private String title;
	private String category;
	private String director;
	private int length;
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
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}

	/*public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}*/
	
	public DigitalVideoDisc(String title) {
		super(title);
	}

	/*public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}*/
	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}

	/*public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}*/
	
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}

	/*public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}*/
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category);
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public boolean subSearch(String title) { // method xử lí title có 1 token
		String str = title.toLowerCase();
		//String[] arr2 = this.title.toLowerCase().split(" ");
		String[] arr2 = super.getTitle().toLowerCase().split(" "); // đổi do title ở lớp cha (Media)
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].equals(str)) return true;
		}
		return false;
	}
	
	public boolean search(String title) {
		String[] arr1 = title.toLowerCase().split(" ");
		boolean res = true;
		//int i = 0;
		//while(subSearch(arr1[i]) == true/* && i < arr1.length*/) {
		for(int i = 0; i < arr1.length; i++) {
			//if(subSearch(arr1[i]) == false) return false;
			//if(i < arr1.length - 1) i++;
			//break;
			res = subSearch(arr1[i]);
			if(res == false) return res;
		}
		
		return res;
	}
	
}
