package Lab04;

public class TestPassingParameter {
	public static void main(String args[]) {
		DigitalVideoDisc2 jungleDVD = new DigitalVideoDisc2("Jungle");
		DigitalVideoDisc2 cinderellaDVD = new DigitalVideoDisc2("Cinderella");
		
		
		swapObject(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	
	public static void swap(Object o1,Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
	
	public static void swapObject(DigitalVideoDisc2 d1,DigitalVideoDisc2 d2) {
		DigitalVideoDisc2 temp = new DigitalVideoDisc2(d1.getTitle());
		temp.setTitle(d1.getTitle());
		temp.setCost(d1.getCost());
		temp.setDirector(d1.getDirector());
		temp.setLength(d1.getLength());
		temp.setCategory(d1.getCategory());
		
		d1.setTitle(d2.getTitle());
		d1.setCategory(d2.getCategory());
		d1.setCost(d2.getCost());
		d1.setDirector(d2.getDirector());
		d1.setLength(d2.getLength());
		
		d2.setTitle(temp.getTitle());
		d2.setCategory(temp.getCategory());
		d2.setCost(temp.getCost());
		d2.setDirector(temp.getDirector());
		d2.setLength(temp.getLength());
		
	}
	
	public static void changeTitle(DigitalVideoDisc2 dvd,String title) {
		dvd.setTitle(title);
	}
}
