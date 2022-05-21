package Lab06.src.hust.soict.hedspi.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();

	public String getTitle() {
		return super.getTitle();
	}

	public void setTitle(String title) {
		super.setTitle(title);
	}

	public String getCategory() {
		return super.getCategory();
	}

	public void setCategory(String category) {
		super.setCategory(category);
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
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
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) authors.remove(authorName);
	}

}
