package hust.soict.hedspi.aims.media.factory;


import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class CDCreation implements MediaCreation{

	@Override
	public Media createMediaFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Media Title: ");
		String title = sc.nextLine();
		System.out.println("Media Category: ");
		String category = sc.nextLine();
		System.out.println("Media Price: ");
		float cost = Float.parseFloat(sc.nextLine());
		System.out.println("CD Director: ");
		String director = sc.nextLine();
		System.out.println("CD Length: ");
		int length = Integer.parseInt(sc.nextLine());
		System.out.println("CD Artist: ");
		String artist = sc.nextLine();
		System.out.println("Number Of Tracks: ");
		int trackNum = Integer.parseInt(sc.nextLine());
		ArrayList<Track> tracks = new ArrayList<>();
		for (int i = 0; i < trackNum; i++) {
			System.out.printf("Track %d\n",i+1);
			System.out.println("Track title: ");
			String trTitle = sc.nextLine();
			System.out.println("Track length: ");
			int trLength = Integer.parseInt(sc.nextLine());
			Track element = new Track(trTitle, trLength);
			tracks.add(element);
		}
		
		return new CompactDisc(title, category, cost, director, length, artist, tracks);
		
	}
	
}
