package Lab03_AimsProject;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class MyDate {
	
	private String day;
	private String month;
	private String curYear;
	private int year;
	private String fullDate = day + " " + month + " " + year;
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	MyDate(){
		/*SimpleDateFormat formatter= new SimpleDateFormat("EEEE yyyy-MM-dd 'at' HH:mm:ss a");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));*/
		
		day = "dd";
		month = "MMMM";
		curYear = "yyyy";
		
		//Set the pattern
        //String pattern = "dd MMMM yyyy, EEEE,hh:mm a";
		String pattern = day + " " + month + " " + curYear + ", hh:mm a";
		// Nếu set year là int thì dùng Integer.toString(year) vẫn bị lỗi
       
        //Create SimpleDateFormat Object
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       
        //Convert date to the string value
        String dateVal = simpleDateFormat.format(new Date());
       
        //Split the date value based on comma(,)
        String[] today_arr = dateVal.split(", ");
       
        //Print the formatted output
        System.out.println("Date - " + today_arr[0] + /*"\nDay - " + today_arr[1] + */"\nTime - " + today_arr[1]);
	}
	
	MyDate(String day, String month, int year){
		System.out.println(day + " " + month + " " + year);
	}
	
	MyDate(String fullDate){
		this.fullDate = fullDate;
		System.out.println(this.fullDate);
	}
	
	public void setMyDate(String day, String month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void getMyDate() {
		System.out.println(day + " " + month + " " + year);
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input day:");
		this.day = sc.next();
		System.out.print("Input month:");
		this.month = sc.next();
		System.out.print("Input year:");
		this.year = sc.nextInt();
		MyDate date = new MyDate(this.day, this.month, this.year);
		sc.close();
	}
	
	public void print() {
		System.out.println(this.day + " " + this.month + " " + this.year);
	}
	
}