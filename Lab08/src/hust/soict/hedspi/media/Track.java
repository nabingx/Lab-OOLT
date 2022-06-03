package Lab08.src.hust.soict.hedspi.media;

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
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
		Track track = (Track) o;
		if (track == null) return false;
		if (this.title.equals(track.getTitle()) && this.length == track.getLength()) return true;
		else return false;
	}
	
}
