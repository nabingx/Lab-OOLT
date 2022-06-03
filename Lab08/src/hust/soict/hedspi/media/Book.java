package Lab08.src.hust.soict.hedspi.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();

	public String getTitle() {
		return super.getTitle();
	}

	public void setTitle(String title) {
		super.setTitle(title);
		//this.title = title;
	}

	public String getCategory() {
		return super.getCategory();
	}

	public void setCategory(String category) {
		super.setCategory(category);
		//this.category = category;
	}

	public float getCost() {
		return super.getCost();
	}

	public void setCost(float cost) {
		super.setCost(cost);
		//this.cost = cost;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		//(int i = 0; i < authors.size(); i++) {
		//}
		if(!authors.contains(authorName)) authors.add(authorName);
		else System.out.println("This book is already in!");
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) authors.remove(authorName);
		else System.out.println("This book doesn't exist!");
	}

}
