package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMIT_ORDERS = 5;
    private final ArrayList<Media> itemsOrdered = new ArrayList<>();
    private static int nbOrders = 0;
    private static int[] orderId = new int[20];
    private static int index = 0;
    public Order() {
        new MyDate();
    }
    
    public int[] getOrderId() {
    	return orderId;
    }

    public static Order createOrder() {
        if (nbOrders >= MAX_LIMIT_ORDERS) {
            System.out.println("You have reached the maximum of Orders.");
            return null;
        } else {
            nbOrders++;
            return new Order();
        }
    }

    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("Order is full!");
        } else {
        	orderId[index] = index + 1;
            itemsOrdered.add(media);
            index ++;
        }
    }

    public void addMedia(Media[] media) {
        List<Media> discList = new ArrayList<>();
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("Order is full!");
        } else {
            for (Media media1 : media) {
                if (itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
                    discList.add(media1);
                    continue;
                }
                itemsOrdered.add(media1);
            }
        }
        if (discList.size() != 0) {
            System.out.println("Products that cannot be added into list.");
            discList.forEach(digitalVideoDisc -> System.out.println(digitalVideoDisc.getTitle()));
        }
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

    public void removeMedia(int id) {
        itemsOrdered.remove(id);
    }

    public void show() {
        for (int i = 0; i < itemsOrdered.size(); i++) {
			Media element = itemsOrdered.get(i);
			System.out.printf("%-2d - ",orderId[i]);
			System.out.println(element);
		}
    }
  
    public float totalCost() {
    	
    	float total = 0;
    	for (int i = 0; i < itemsOrdered.size(); i++) {
    		Media element = itemsOrdered.get(i);
    		total += element.getCost();
		}
    	return total;

    }

//    public Media getALuckyItem() {
//        return itemsOrdered.get((int) (Math.random() * itemsOrdered.size()));
//    }
}
