package Lab08.src.hust.soict.hedspi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media {
	
	//private String title;
	//private String category;
	//private float cost;
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String,Integer> wordFrequency = new TreeMap<String, Integer>();
	//private TreeMap<String, Integer> contentMap = new TreeMap<String, Integer>();

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setContentTokens() {
		String[] contentArr = content.split(" ");
		for(int i = 0; i < contentArr.length; i++) {
			contentTokens.add(contentArr[i]);
		}
		Collections.sort(contentTokens, (o1, o2) -> o1.compareTo(o2));
	}
	
	public void getContentTokens() {
		for (String s : contentTokens) {
            System.out.println(s);
        }
	}
	
	public void getContentFreq() {
		
	}
	
	public void setWordFreq() {
		String[] contentArr = content.split(" ");
		for(int i = 0; i < contentArr.length; i++) {
			((TreeMap<String, Integer>) wordFrequency).put(contentArr[i], 0);
		}
		//Collections.sort(wordFrequency, (o1, o2) -> o1.compareTo(o2));
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
	
	public void processContent() {
		setContentTokens();
		
	}

}
