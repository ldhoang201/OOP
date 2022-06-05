package hust.soict.hedspi.aims.media.factory;

import java.util.Scanner;


import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;


public class TrackCreation implements MediaCreation{
	
	@Override
	public Media createMediaFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Track Title: ");
		String title = sc.nextLine();
		System.out.println("Track Length: ");
		int length = Integer.parseInt(sc.nextLine());
		return new Track(title, length);
	}

}
