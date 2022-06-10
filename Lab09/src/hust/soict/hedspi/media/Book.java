package Lab09.src.hust.soict.hedspi.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
	
	public void getWordFreq() {
		Set<String> keySet = wordFrequency.keySet();
		for (String key : keySet) {
            System.out.println(key + " - " + wordFrequency.get(key));
        }
	}
	
	public void setWordFreq() {
		String[] contentArr = content.split(" ");
		int[] count = new int[contentArr.length];
		Arrays.fill(count, 1); // = memset in C lang
		for(int i = 0; i < contentArr.length; i++) {
			if (!wordFrequency.containsKey(contentArr[i])) ((TreeMap<String, Integer>) wordFrequency).put(contentArr[i], count[i]);
			else {
				for(int j = 0; j < i; j++) {
					//if (wordFrequency.containsKey(contentArr[j])) count[i]++;
					if (contentArr[j].equals(contentArr[i])) count[i]++;
				}
				((TreeMap<String, Integer>) wordFrequency).put(contentArr[i], count[i]);
			}
		}
		for(int i : count) System.out.print(i + " "); // check int[] count
		System.out.println();
		for (String i : contentArr) System.out.print(i + " ");
		System.out.println();
		
		// Collections.sort(wordFrequency, (o1, o2) -> o1.compareTo(o2));
		// TreeMap tự sort nên ko cần cmd trên
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
		setWordFreq();
	}
	
	@Override
	public String toString() {
		getContentTokens();
		getWordFreq();
		return getTitle() + " - " + getCategory() + " - " + getCost();
	}

}
