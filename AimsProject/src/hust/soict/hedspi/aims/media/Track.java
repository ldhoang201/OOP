package hust.soict.hedspi.aims.media;

public class Track extends Media implements Playable{
	private String title;
	private int length;
	
	public Track(String title,int length) {
		super(title);
		this.length = length;
	}
	
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}

	@Override
	public String toString() {
		return "title=" +super.getTitle() + ", length=" + length + "]";
	}
	
	
}
