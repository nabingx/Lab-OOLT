package Lab09.src.hust.soict.hedspi.aims.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {

	private String day;
	private String month;
	private String curYear;
	private int year;
	private String stringYear; // year dÄ‚Â¡Ă‚ÂºĂ‚Â¡ng String
	private String fullDate = day + " " + month + " " + year;
	private String dateUtilsString = day + " " + month + " " + year;
	
	String days_arr[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nineth", "tenth", "eleventh", "twelfth",
			  				"thirteen", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty first", "twenty-second",
			  				"twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth","twenty-seventh",
			  				"twenty-eighth", "twenty-nineth", "thirtieth", "thirty-first"};
	  
	String months_arr[] = {"January", "February", "March", "April", "May", "June",
			  				"July", "August", "September", "October", "November", "December"};
	
	String years_arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty",
				"sixty", "seventy", "eighty", "ninety"};
	
	// YĂ„â€�Ă‚Âªu cÄ‚Â¡Ă‚ÂºĂ‚Â§u ng dĂ„â€�Ă‚Â¹ng nhÄ‚Â¡Ă‚ÂºĂ‚Â­p vĂ„â€�Ă‚Â o nhÄ‚â€ Ă‚Â° Ä‚â€�Ă¢â‚¬ËœÄ‚Â¡Ă‚Â»Ă¢â‚¬Â¹nh dÄ‚Â¡Ă‚ÂºĂ‚Â¡ng 3 arr trĂ„â€�Ă‚Âªn
	
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
		// NĂ„â€�Ă‚Â¡Ä‚â€�Ă‚ÂºÄ‚â€�Ă‚Â¿u set year lÄ‚â€�Ă¢â‚¬ï¿½Ä‚â€�Ă‚Â  int thÄ‚â€�Ă¢â‚¬ï¿½Ä‚â€�Ă‚Â¬ dÄ‚â€�Ă¢â‚¬ï¿½Ä‚â€�Ă‚Â¹ng Integer.toString(year) vĂ„â€�Ă‚Â¡Ä‚â€�Ă‚ÂºÄ‚â€�Ă‚Â«n bĂ„â€�Ă‚Â¡Ä‚â€�Ă‚Â»Ä‚Â¢Ă¢â€�Â¬Ă‚Â¹ lĂ„â€�Ă‚Â¡Ä‚â€�Ă‚Â»Ä‚Â¢Ă¢â€�Â¬Ă¢â‚¬ï¿½i
       
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
	
	public String setMyDate2(MyDate i) {
		this.day = i.getDay();
		this.month = i.getMonth();
		this.year = i.getYear();
		return this.day + this.month + this.year;
	}
	
	public void getMyDate() {
		System.out.println(day + " " + month + " " + year);
	}
	
	public String getMyDate2() {
		return day + " " + month + " " + year; // dĂ„â€�Ă‚Â¹ng cho dateUtils, do cĂ„â€�Ă‚Â¡c hĂ„â€�Ă‚Â m trÄ‚Â¡Ă‚ÂºĂ‚Â£ vÄ‚Â¡Ă‚Â»Ă¯Â¿Â½ toĂ„â€�Ă‚Â n kiÄ‚Â¡Ă‚Â»Ă†â€™u void
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
	
	public void Print() {
		System.out.println(this.month + " " + this.day + " " + this.stringYear);
	}
	
	int StringDayToInt(String day) {
		day.toLowerCase(); // Ä‚â€�Ă¢â‚¬ËœÄ‚â€ Ă‚Â°a vÄ‚Â¡Ă‚Â»Ă¯Â¿Â½ giÄ‚Â¡Ă‚Â»Ă¢â‚¬Ëœng format cÄ‚Â¡Ă‚Â»Ă‚Â§a days_arr 
		for(int i = 0; i < days_arr.length; i++) {
			if(day.equals(days_arr[i])) return i+1;
		}
		return -1;
	}
	
	String IntDayTH(int day) { // dĂ„â€�Ă‚Â¹ng nÄ‚Â¡Ă‚Â»Ă¢â‚¬Ëœi tiÄ‚Â¡Ă‚ÂºĂ‚Â¿p method StringDayToInt
		String StringDayTH = Integer.toString(day);
		if(StringDayTH.equals("01") || StringDayTH.equals("11")|| StringDayTH.equals("21")|| StringDayTH.equals("31")|| StringDayTH.equals("1") )
			StringDayTH += "st";
		else if(StringDayTH.equals("02") ||StringDayTH.equals("12")|| StringDayTH.equals("22")|| StringDayTH.equals("2"))
			StringDayTH += "nd";
		else if(StringDayTH.equals("03") ||StringDayTH.equals("13")|| StringDayTH.equals("23")|| StringDayTH.equals("3"))
			StringDayTH += "rd";
		else 
			StringDayTH += "th";
		return StringDayTH;
	}
	
	int StringMonthToInt(String month) { // check cĂ„â€�Ă‚Â¡ch nhÄ‚Â¡Ă‚ÂºĂ‚Â­p month Ä‚â€�Ă¢â‚¬ËœĂ„â€�Ă‚Âºng format ko
		month.toLowerCase();
		for(int i = 0; i < months_arr.length; i++) {
			if(day.equals(months_arr[i])) return i+1;
		}
		return -1;
	}
	
	MyDate(String day, String month, String year) {
		//this.day = day;
		//IntDayTH(StringDayToInt(this.day));
		this.day = IntDayTH(StringDayToInt(day)); // method chaining
		this.month = month;
		StringMonthToInt(this.month);
		//String[] year_arr = year.split(" ");
		this.stringYear = CombineYear(year);
	}
	
	int PartiallYearToInt(String year) {
		switch (year) {
		case "zero": return 0;
		case "one": return 1;
		case "two": return 2;
		case "three": return 3;
		case "four": return 4;
		case "five": return 5;
		case "six": return 6;
		case "seven": return 7;
		case "eight": return 8;
		case "nine": return 9;
		case "ten": return 10;
		case "eleven": return 11;
		case "twelve": return 12;
		case "thirteen": return 13;
		case "fourteen": return 14;
		case "fifteen": return 15;
		case "sixteen": return 16;
		case "seventeen": return 17;
		case "eighteen": return 18;
		case "nineteen": return 19;
		case "twenty": return 20;
		case "thirty": return 30;
		case "fourty": return 40;
		case "fifty": return 50;
		case "sixty": return 60;
		case "seventy": return 70;
		case "eighty": return 80;
		case "ninety": return 90;
		default: return -1;
		}
	}
	
	String CombineYear(String year) {
		String finalYear = "";
		String[] year_arr = year.split(" ");
		if(year_arr.length == 2) {
			finalYear += Integer.toString(PartiallYearToInt(year_arr[0])) + Integer.toString(PartiallYearToInt(year_arr[1]));
		}
		else if(year_arr.length == 3) {
			finalYear += Integer.toString(PartiallYearToInt(year_arr[0]));
			int toIntSum = PartiallYearToInt(year_arr[1]) + PartiallYearToInt(year_arr[2]);
			finalYear += Integer.toString(toIntSum);
		}
		return finalYear;
	}
	

}
