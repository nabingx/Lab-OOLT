package Lab08.src.hust.soict.hedspi.aims.disc;

import java.util.ArrayList;

import Lab08.src.hust.soict.hedspi.aims.disc.Disc;
import Lab08.src.hust.soict.hedspi.media.Playable;
import Lab08.src.hust.soict.hedspi.media.Track;
import Lab08.src.hust.soict.hedspi.media.Comparable;

public class CompactDisc extends Disc implements Playable, Comparable{

	private String title;
	private String category;
	private float cost;
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getTitle() {
		return super.getTitle();
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return super.getCategory();
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
	
	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title) {
		super(title);
	}
	
	public CompactDisc(String title, String category) {
		super(title, category);
	}
	
	public CompactDisc(String title, String category, float cost) {
		super(title, category);
		setCost(cost);
	}
	
	public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category);
		setCost(cost);
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		if(!tracks.contains(track)) tracks.add(track);
		else System.out.println("This track has already been added earlier!");
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) tracks.remove(track);
		else System.out.println("This track doesn't exist!");
	}
	
	public int getLength() {
		int length = 0;
		for(Track track: tracks) {
			length += track.getLength();
		}
		return length;
	}
	
	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
	}
	
	public void playAll() {
		for(Track track: tracks) {
			track.play();
		}
	}

}
