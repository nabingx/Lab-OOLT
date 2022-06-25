package Lab11.src.hust.soict.hedspi.media;

import Lab11.src.hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable {
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return length;
	}
	
	public Track(String title) {
		this.title = title;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: Track length is non-positive");
		}
	}
	
	@Override
	public boolean equals(Object o) {
		Track track = (Track) o;
		if (track == null) return false;
		if (this.title.equals(track.getTitle()) && this.length == track.getLength()) return true;
		else return false;
	}
	
}
