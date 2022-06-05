package Lab03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class MyDate {
	int day;
	int month;
	int year;
	
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
	
	public void printDate() {
		System.out.printf("Today is %d-%d-%d",day,month,year);
	}
	
	
}
