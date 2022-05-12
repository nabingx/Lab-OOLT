package hust.soict.hedspi.lab02;

//import java.util.Arrays;
import java.util.Scanner;

public class DisplayDayofMonth {
	
	public static boolean isLeapYear(int year) {
		 if (year % 4 == 0) {

		      // if the year is century
		      if (year % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0)
		          return true;
		        else
		          return false;
		      }
		      
		      // if the year is not century
		      else
		        return true;
		    }
		    
		    else
		      return false;
	}
	
	public static void DaysInCommonYear(String month) {
		int Day = 0;
		switch(month){
		case "1": Day = 31; break;
		case "2": Day = 28; break;
		case "3": Day = 31; break;
		case "4": Day = 30; break;
		case "5": Day = 31; break;
		case "6": Day = 30; break;
		case "7": Day = 31; break;
		case "8": Day = 31; break;
		case "9": Day = 30; break;
		case "10": Day = 31; break;
		case "11": Day = 30; break;
		case "12": Day = 31; break;
		}
		System.out.println("Days of the month: " + Day);
	}
	
	public static void DaysInLeapYear(String month) {
		int Day = 0;
		switch(month){
		case "1": Day = 31; break;
		case "2": Day = 29; break;
		case "3": Day = 31; break;
		case "4": Day = 30; break;
		case "5": Day = 31; break;
		case "6": Day = 30; break;
		case "7": Day = 31; break;
		case "8": Day = 31; break;
		case "9": Day = 30; break;
		case "10": Day = 31; break;
		case "11": Day = 30; break;
		case "12": Day = 31; break;
		}
		System.out.println("Days of the month: " + Day);
	}
	
	public static void main(String[] args) {
		
		InputMonth[] Month = new InputMonth[12];
		
		Month[0] = new InputMonth("January", "Jan.", "Jan", "1");
		Month[1] = new InputMonth("February", "Feb.", "Feb", "2");
		Month[2] = new InputMonth("March", "Mar.", "Mar", "3");
		Month[3] = new InputMonth("April", "Apr.", "Apr", "4");
		Month[4] = new InputMonth("May", "May", "May", "5");
		Month[5] = new InputMonth("June", "June", "June", "6");
		Month[6] = new InputMonth("July", "July", "July", "7");
		Month[7] = new InputMonth("August", "Aug.", "Aug", "8");
		Month[8] = new InputMonth("September", "Sep.", "Sep", "9");
		Month[9] = new InputMonth("October", "Oct.", "Oct", "10");
		Month[10] = new InputMonth("November", "Nov.", "Nov", "11");
		Month[11] = new InputMonth("December", "Dec.", "Dec", "12");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a month: ");
		String value = keyboard.next();
		String answer = "";
		
		for(int i = 0; i < 12; i++) {
			if(value.equals(Month[i].month) || value.equals(Month[i].abbre) || value.equals(Month[i].in3Letters) || value.equals(Month[i].inNumber)) {
				System.out.println("Month: " + Month[i].month);
				System.out.println("Abbreviation: " + Month[i].abbre);
				System.out.println("In 3 letters: " + Month[i].in3Letters);
				System.out.println("In Number: " + Month[i].inNumber);
				answer = Month[i].inNumber;
				}
		}
		
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		while(year != (int)year || year < 1000){	// Em đặt đi�?u kiện < 1000 vì không rõ chỗ đ�? bài giải thích year không được bằng 99
			System.out.println("Wrong input, enter again: ");
			year = keyboard.nextInt();
		}
		
		System.out.println("Year: " + year);
		if(isLeapYear(year)) {System.out.println(year + " is a leap year"); DaysInLeapYear(answer);} 
		else {System.out.println(year + " is a common year"); DaysInCommonYear(answer);}
		
		keyboard.close();

	}

}
