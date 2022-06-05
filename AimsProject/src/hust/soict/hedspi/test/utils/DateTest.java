package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
	public static void main(String args[]) {
		MyDate d1 = new MyDate("second","September","nineteen twenty-one");
		MyDate d2 = new MyDate("first","November","nineteen twenty-one");
		DateUtils.compare(d1, d2);
	}
}
