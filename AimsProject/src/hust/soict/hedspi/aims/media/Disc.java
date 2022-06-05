package hust.soict.hedspi.aims.media;

public class Disc extends Media{
	private String director;
	private int length;
	
	public Disc(String title,String category,float cost,String director,int length) {
		super(title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	public Disc(String title,int length) {
		super(title);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return super.toString() + "[director=" + director + ", length=" + length + "]";
	}
	
	
}
