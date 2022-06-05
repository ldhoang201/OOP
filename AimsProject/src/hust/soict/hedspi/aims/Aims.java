package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.media.factory.BookCreation;
import hust.soict.hedspi.aims.media.factory.CDCreation;
import hust.soict.hedspi.aims.media.factory.DVDCreation;
import hust.soict.hedspi.aims.media.factory.MediaCreation;
import hust.soict.hedspi.aims.media.factory.TrackCreation;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.store.Store;

public class Aims {
	 static Store store = new Store();
	 static Order order;
	 
	    public static void main(String[] args) {
	    	
	    	while(true) showDuoMenu();
	        
	    }
	    
	    public static void showDuoMenu() {
	    	System.out.println("AIMS Store Management: ");
	    	System.out.println("--------------------------------");
	    	System.out.println("1. Admin");
	    	System.out.println("2. User");
	    	System.out.println("0. Exit");
	    	Scanner scn = new Scanner(System.in);
	    	int menuChoice = Integer.parseInt(scn.nextLine());
	    	switch (menuChoice) {
	    	case 0:
	    		System.out.println("Exit.");
	    		System.exit(0);
			case 1: {
				showAdminMenu();
			}
			case 2:{
				showUserMenu();
			}
		}
	   }
	      
	    public static Media createMedia(MediaCreation mc) {
	    	return mc.createMediaFromConsole();
	    	}
	    
	    public static void showUserMenu() {
	    	int choice;
			do {
		    	System.out.println("Welcome to AIMS Store: ");
		    	System.out.println("--------------------------------");
		    	System.out.println("1. Create new order");
		    	System.out.println("2. Search for an item from the list by title");
		    	System.out.println("3. Add item to order by id (id in the list of available items of the store");
		    	System.out.println("4. Remove item from order by id (id in the order)");
		    	System.out.println("5. Display the order information");
		    	System.out.println("0. Exit");
		    	System.out.println("--------------------------------");
		    	System.out.println("Please choose a number: 0-1-2-3-4-5");
		    	
		    	Scanner scanner = new Scanner(System.in);
		    	choice = Integer.parseInt(scanner.nextLine());
		    	switch (choice){
		    	case 0:
		    		System.out.println("Exit");
		    		return;
				case 1: 
					order = Order.createOrder();
					System.out.println("Create Order Successfully.");
					break;
	
				case 2:
					System.out.println("Title: ");
					String titleSearch = scanner.nextLine();
					ArrayList<Media> mediaFound = store.searchItems(titleSearch);
					if(mediaFound == null)
					{
						break;
					}
					System.out.println("------Items Found------");
					store.show(mediaFound);
					break;
				case 3:
					System.out.println("Item's ID: ");
					Media mediaById = store.searchId(Integer.parseInt(scanner.nextLine()));				
					order.addMedia(mediaById);
					break;
				case 4:
					System.out.println("Item's ID");
					order.removeMedia(Integer.parseInt(scanner.nextLine()));
					break;
				case 5:
					System.out.printf("%s - %s\n","ID","Media");
					order.show();
					System.out.println("Total is: " + order.totalCost() + "$");
					break;
		    	}
	    	}while(choice!=0);
				
	    }
	    
	    public static void showAdminMenu() {
	    	int choose;
			do {
				System.out.println("Order Management Application: ");
		        System.out.println("--------------------------------");
		        System.out.println("1. Create new item");
		        System.out.println("2. Delete item by id");
		        System.out.println("3. Display the items list");
		        System.out.println("0. Exit");
		        System.out.println("--------------------------------");
		        System.out.println("Please choose a number: 0-1-2-3: ");
		        Scanner sc = new Scanner(System.in);
		        choose = Integer.parseInt(sc.nextLine());
		        switch (choose) {
		            case 0:
		                System.out.println("Exit");
		                return;
		            case 1:
		            {
		            	System.out.println("""
	                            Choose type of Media:
	                            1.Book
	                            2.CompactDisc
	                            3.DigitalVideoDisc
	                            4.Track
	                            """);
		            	int mediaChoice = Integer.parseInt(sc.nextLine());
		            	switch (mediaChoice)
		            	{
							case 1: 
								Book book = (Book) createMedia(new BookCreation());
								store.addMedia(book);
								break;
							case 2:
								CompactDisc cd = (CompactDisc) createMedia(new CDCreation());
								store.addMedia(cd);
								break;
							
							case 3:
								DigitalVideoDisc dvd = (DigitalVideoDisc) createMedia(new DVDCreation());
								store.addMedia(dvd);
								break;
								
							case 4:
								Track track = (Track) createMedia(new TrackCreation());
								store.addMedia(track);
								break;
								
							default:
								throw new IllegalArgumentException("Unexpected value: " + mediaChoice);
		            	}
		            }
		            break;
		            case 2:
		            	System.out.println("Media's id: ");
		            	store.removeMedia(sc.nextInt());
		            	break;
		            case 3:
		            	store.show();
		            	break;
		        }
			}while(choose!=0);
	    }
}
