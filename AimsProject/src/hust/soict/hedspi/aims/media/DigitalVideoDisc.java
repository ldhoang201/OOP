package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {
   
	public DigitalVideoDisc(String title,String category,float cost,String director,int length)
	{
		super(title, category, cost, director, length);
	}

	@Override
	public void play() {
		
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
	
	@Override
	public String toString() {
		return "DVD" + super.toString();
	}
}
