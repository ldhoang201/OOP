package Lab02;

import java.util.Scanner;

public class bai55 {
	
	static boolean leapYear(int year) {
		if (year % 400 == 0)
			return true;
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		
		return false;
	}
	
	static boolean checkExistMonth(String month,String[] monthName) {
		for (int i = 0; i < monthName.length; i++) {
			if(!month.equals(monthName[i])) {
				return false;
			}
		}
		return true;
	}
	
	static void inumberOfDays(int month,int year) {
		switch (month){
		case 1,3,5,7,8,10,12: {
			System.out.println("Has 31 days");
			break;
		}
		case 4,6,9,11 :{
			System.out.println("Has 30 days");
			break;
		}
		case 2:{
			if(leapYear(year))
				System.out.println("Has 29 days");
			else {
				System.out.println("Has 28 days");
			}
			break;
		}
		default : System.out.println("Invalid Month:" + month);
		}
	}
	
	static void strnumberOfDays(String month,int year) {
		switch (month) {
		case "January","Jan","Jan.","March","Mar","Mar.",
		"May","July","Jul","August","Aug.","Aug","October",
		"Oct.","Oct","December","Dec.","Dec": {
			System.out.println("Has 31 days");
			break;
			
		}
		case "April","Apr.","Apr","June","Jun","September",
		"Sept.","Sep","November","Nov.","Nov" :{
			System.out.println("Has 30 days");
			break;
			
		}
		
		case "February","Feb.","Feb":{
			if(leapYear(year)) {
				System.out.println("Has 29 days");
			}
			else {
				System.out.println("Has 28 days");
			}
			break;
		}
		default : System.out.println("Invalid month:" + month);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year, month = 0;
		String choose;
		String strMonth =""; 
		String[] monthName = {"January","February","March","April","May","June",
				"July","August","September","October","November","December",
				"Jan.","Jan","Feb.","Feb","Mar.","Mar","Apr.","Apr","Jun",
				"Jul","Aug.","Aug","Sept.","Sep","Oct.","Oct","Nov.","Nov",
				"Dec.","Dec"};
		System.out.println("Input month by name or by number?");
		choose = sc.next();
		
			if(choose.equals("name")) {
//				do {
					System.out.printf("Input name of month: ");
					strMonth = sc.next();
//					if(!checkExistMonth(strMonth, monthName)){
//						System.out.printf("Invalid month!\n");
//					}
//				}while(!checkExistMonth(strMonth, monthName));
				
				do {
					System.out.printf("Input year: ");
					year = sc.nextInt();
					if(year < 0)
						System.out.printf("Invalid year!\n");
				} while (year < 0);
				
				strnumberOfDays(strMonth, year);
			}
				
			else {
				do {
				System.out.printf("Input number of month: ");
				month = sc.nextInt();
				if(month < 1 || month > 12) {
					System.out.printf("Invalid month!\n");
				}
				}while(month < 1 || month > 12);
				
				do {
					System.out.printf("Input year: ");
					year = sc.nextInt();
					if(year < 0)
						System.out.printf("Invalid year!\n");
				} while (year < 0);
				
				inumberOfDays(month, year);
			}

		sc.close();
	}
}
