package hust.soict.hedspi.aims.media.factory;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class DVDCreation implements MediaCreation{

	@Override
	public Media createMediaFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Media Title: ");
		String title = sc.nextLine();
		System.out.println("Media Category: ");
		String category = sc.nextLine();
		System.out.println("Media Price: ");
		float cost = Float.parseFloat(sc.nextLine());
		System.out.println("DVD Director: ");
		String director = sc.nextLine();
		System.out.println("DVD Length: ");
		int length = Integer.parseInt(sc.nextLine());
		return new DigitalVideoDisc(title, category,
		cost, director, length);
		}
	}
