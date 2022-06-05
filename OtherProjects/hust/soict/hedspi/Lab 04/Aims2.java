package Lab04;

public class Aims2 {
		public static void main(String args[]) {
			
			Order2 anOrder = Order2.createOrder();

			Order2.dateOrder.printDate();
			DigitalVideoDisc2 dvd1 = new DigitalVideoDisc2("The Lion King");
			dvd1.setCategory("Animation");
			dvd1.setCost(19.95f);
			dvd1.setDirector("Roger Allers");
			dvd1.setLength(87);
			
			anOrder.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc2 dvd2 = new DigitalVideoDisc2("Star Wars");
			dvd2.setCategory("Science Fiction");
			dvd2.setCost(24.95f);
			dvd2.setDirector("George Lucas");
			dvd2.setLength(124);
			
			anOrder.addDigitalVideoDisc(dvd2);
			
			DigitalVideoDisc2 dvd3 = new DigitalVideoDisc2("Aladdin");
			dvd3.setCategory("Animation");
			dvd3.setCost(18.99f);
			dvd3.setDirector("John Musker");
			dvd3.setLength(90);
			
			anOrder.addDigitalVideoDisc(dvd3);
			
			
			
					
			System.out.println("Total cost is: ");
			System.out.println(anOrder.totalCost());
		}

}
