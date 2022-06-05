package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
	public static void main(String args[]) {
		DigitalVideoDisc d1 = new DigitalVideoDisc("Spider Man");
		DigitalVideoDisc d2 = new DigitalVideoDisc("BatMan");
		Order order = new Order();
		order.addDigitalVideoDisc(d1,d2);
		System.out.println(d1.search("Spider"));
		System.out.println(d2.search("Man"));
		
		System.out.println(order.getALuckyItem());
	}
}
