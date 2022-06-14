package Lab10.src.hust.soict.hedspi.aims.disc;

import java.util.ArrayList;

import Lab10.src.hust.soict.hedspi.aims.disc.Disc;
import Lab10.src.hust.soict.hedspi.media.Media;
import Lab10.src.hust.soict.hedspi.media.Playable;
import Lab10.src.hust.soict.hedspi.media.Track;

public class CompactDisc extends Disc implements Playable{

	private String title;
	private String category;
	private float cost;
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
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
		//return cost;
	}
	
	public void setCost(float cost) {
		super.setCost(cost);
		//this.cost = cost;
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
	
	public int getNumberOfTracks() {
		return tracks.size();
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
	
	@Override
	public int compareTo(Object obj) {
		CompactDisc cd = (CompactDisc) obj;
		if (cd == null) return 0;
		else {
			if (tracks.size() > cd.getNumberOfTracks()) return 1;
			else if (tracks.size() < cd.getNumberOfTracks()) return -1;
			else {
				if (this.getLength() > cd.getLength()) return 1;
				else if (this.getLength() < cd.getLength()) return -1;
				else {
					if (title.length() > cd.getTitle().length()) return 1;
					else if (title.length() < cd.getTitle().length()) return -1;
				}
			}
		}
		return 0;
	}
	
}
