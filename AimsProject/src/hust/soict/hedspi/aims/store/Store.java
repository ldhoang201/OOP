package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.Media;

public class Store {
	private final ArrayList<Media> availableItems = new ArrayList<>();
	private int id = 0;
	
	public void addMedia(Media md) {
		md.setId(id);
		availableItems.add(md);
		id++;
	}
	
	public void addMedia(Media[] md) {
		for(Media ele:md) {
			ele.setId(id);
			availableItems.add(ele);
			id++;
		}
	}
	
	public void removeMedia(Media md) {
		availableItems.remove(md);
	}
	
	public void removeMedia(int id) {
		for (int i = 0; i < availableItems.size(); i++) {
			Media element = availableItems.get(i);
			if(element.getId() == id) 
			{
				availableItems.remove(i);
				int temp = id;
				for (int j = temp; j <availableItems.size(); j++) {
					availableItems.get(j).setId(id);
					id++;
				}
			}
		}
	}
	
	public void show() {
		availableItems.forEach((System.out::println));
	}
	
	 public void show(ArrayList<Media> medias) {
	    	for (Media media : medias) {
				System.out.println(media);
			}
	    }
	
	public ArrayList<Media> searchItems(String title) {
		ArrayList<Media> mediaFound= new ArrayList<>();
		for (Media ele : availableItems) {
			if (ele.getTitle().contains(title))
				mediaFound.add(ele);
		}
		if(mediaFound.isEmpty())
		{
			System.out.println("Items not found!");
			return null;
		}
		return mediaFound;
	}
	
	public Media searchId(int id) {
		for (Media ele : availableItems) {
			if(ele.getId()==id)
				return ele;
		}
		System.out.println("Item not found!");
		return null;
	}
	
}
