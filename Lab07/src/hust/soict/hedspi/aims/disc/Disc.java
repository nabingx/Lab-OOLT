package Lab07.src.hust.soict.hedspi.aims.disc;

import Lab07.src.hust.soict.hedspi.media.Media;

public class Disc extends Media{
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category) {
		super(title, category);
	}
	
	public Disc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	
	public Disc(String title, String category, String director, int length) {
		super(title, category);
		this.director = director;
		this.length = length;
	}
	
}
