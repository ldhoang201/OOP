package Lab04;

public class DateTest2 {
	public static void main(String args[]) {
		MyDate2 d1 = new MyDate2("second","September","nineteen twenty-one");
		MyDate2 d2 = new MyDate2("first","November","nineteen twenty-one");
		DateUtils.compare(d1, d2);
	}
	
}
