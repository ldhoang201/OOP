package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MyDate {
	int day;
	int month;
	int year;
	private MyDate dateOrdered;
	
	enum Day {
        first(1), second(2), third(3), fourth(4), fifth(5), sixth(6), seventh(7), eighth(8), ninth(9),
        tenth(10), eleventh(11), twelfth(12), thirteenth(13), fourteenth(14), fifteenth(15), sixteenth(16),
        seventeenth(17), eighteenth(18), nineteenth(19), twentieth(20), twenty_first(21), twenty_second(22),
        twenty_third(23), twenty_fourth(24), twenty_fifth(25), twenty_sixth(26), twenty_seventh(27), twenty_eighth(28),
        twenty_ninth(29), thirtieth(30), thirty_first(31);

        private int value;

        Day(int i) {
            value = i;
        }
    }
	
	public MyDate() {
		LocalDate currentdate = LocalDate.now();
		this.day = currentdate.getDayOfMonth();
		this.month = currentdate.getMonthValue();
		this.year = currentdate.getYear();		
	}
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(s.replaceAll("st ", " ").replaceAll("nd ", " ")
                .replaceAll("rd ", " ").replaceAll("th ", " "), formatter);
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
    }
	
	public MyDate(String day, String month, String year) {
        this.day = Day.valueOf(day).value;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(month + " 1 2000", formatter);
        this.month = date.getMonthValue();
        String[] tenty = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        for (int i = 0; i < tenty.length; i++) {
            year = year.replaceAll(tenty[i], (i + 1) + "0");
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            year = year.replaceAll(numbers[i], (i + 1) + "");
        }

        String[] dateS = year.split(" ");
        String s1, s2 = "";
        if (dateS[0].contains("-")) {
            s1 = String.valueOf(Integer.parseInt(dateS[0].split("-")[0]) + Integer.parseInt(dateS[0].split("-")[1]));
        } else
            s1 = String.valueOf(dateS[0]);

        if (dateS[1].contains("-")) {
            s2 = String.valueOf(Integer.parseInt(dateS[1].split("-")[0]) + Integer.parseInt(dateS[1].split("-")[1]));
        } else
            s2 = String.valueOf(dateS[1]);
        this.year = Integer.parseInt(s1 + s2);
    }
	
	public void print(String format) {
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.printf("%s.\n", dateformatter.format(localDate));
    }

	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day < 1 || day >31) {
			System.out.println("Invalid day");
			System.exit(0);
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("Invalid month");
			System.exit(0);
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year < 0) {
			System.out.print("Invalid year");
			System.exit(0);
		}
		this.year = year;
	}
	
	public void accept() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MyDate date = new MyDate(s);
        day = date.getDay();
        month = date.getMonth();
        year = date.getYear();
        sc.close();
    }
	
	public void print() {
		System.out.printf("OrderDate: %d-%d-%d\n",day,month,year);
	}
}
