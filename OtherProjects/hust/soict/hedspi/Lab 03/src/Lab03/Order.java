package Lab03;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	int qtyOrdered = 0;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	void addDigitalVideoDisc(DigitalVideoDisc dics) {
			itemsOrdered[qtyOrdered] = dics;
			System.out.println("The dics " + dics.getTitle() +" has been added");
			qtyOrdered ++;
		if(qtyOrdered == itemsOrdered.length - 1) {
			System.out.println("The Order is almost full!\n");
			return;
		}
		
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc dics) {
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
