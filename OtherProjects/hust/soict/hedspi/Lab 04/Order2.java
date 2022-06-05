package Lab04;


public class Order2 {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	

	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;
	
	private static int nbOrders = 0;
	
	int qtyOrdered = 0;
	
	private DigitalVideoDisc2 itemsOrdered[] = new DigitalVideoDisc2[MAX_NUMBERS_ORDERED];
	
	static MyDate2 dateOrder = new MyDate2();
	
	public static Order2 createOrder() {
		
		if (nbOrders >= MAXIMUM_ORDERS)
		{
			dateOrder = dateOrder.getDateOrdered();
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Order2();
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc2 dics) {
			itemsOrdered[qtyOrdered] = dics;
			System.out.println("The dics " + dics.getTitle() +" has been added");
			qtyOrdered ++;
		if(qtyOrdered > itemsOrdered.length - 1) {
			System.out.println("The Order is almost full!\n");
			return;
		}
		
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc2[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered++;
			if(qtyOrdered > itemsOrdered.length - 1) {
				System.out.println("The Order is almost full!\n");
				return;
			}
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc2 dvd1,DigitalVideoDisc2 dvd2) {
		itemsOrdered[qtyOrdered] = dvd1;
		itemsOrdered[qtyOrdered++] = dvd2;
		qtyOrdered++;
		if(qtyOrdered > itemsOrdered.length - 1) {
			System.out.println("The Order is almost full!\n");
			return;
		}
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc2 dics) {
		for (int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(dics)) {
				while(i < qtyOrdered)
					itemsOrdered[i] = itemsOrdered[++i];
				qtyOrdered--;
			}
		}
		
	}
	
	float totalCost() {
			float total = 0;
			for (int i = 0; i < qtyOrdered; i++) {
				total += itemsOrdered[i].getCost();
			}
			return total;
		}
}