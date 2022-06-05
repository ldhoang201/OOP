package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc(String title,String category,float cost,String director,int length)
	{
		super(title, category, cost, director, length);
	}
	
	public CompactDisc(String title,int length) {
		super(title, length);
	}
	
	public CompactDisc(String title,String category,float cost,String director,int length,String artist,ArrayList<Track> tracks) {
		super(title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}
	
	public int getLength() {
		int totalLength = 0;
		for (int i = 0; i < tracks.size(); i++) {
			totalLength += tracks.get(i).getLength();
		}
		return totalLength;
	}
	
	public void addTrack(Track track) {
		tracks.add(track);
	}
	
	public void removeTrack(Track track) {
		tracks.remove(track);
	}

	@Override
	public void play() {
		for(Track track:tracks) {
			track.play();
		}
		
	}

	@Override
	public String toString() {
		return "CompactDisc:" + super.toString() +  "[artist=" + artist + ", tracks=" + tracks + "]";
	}
	
	
	
}