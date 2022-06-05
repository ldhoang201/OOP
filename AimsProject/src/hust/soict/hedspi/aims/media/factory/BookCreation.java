package hust.soict.hedspi.aims.media.factory;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;

public class BookCreation implements MediaCreation{

	@Override
	public Media createMediaFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Media Title: ");
		String title = sc.nextLine();
		System.out.println("Media Category: ");
		String category = sc.nextLine();
		System.out.println("Media Price: ");
		float cost = Float.parseFloat(sc.nextLine());
		ArrayList<String> authors= new ArrayList<>();
		System.out.println("Number Of Authors: ");
		int authorNum = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < authorNum; i++) {
			System.out.println("Author's Name: ");
			authors.add(sc.nextLine());
		}
		
		return new Book(title, category, cost, authors);
		
	}

}
