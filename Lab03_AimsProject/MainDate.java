package Lab03_AimsProject;

public class MainDate {

	public static void main(String[] args) {
		
		MyDate curDate = new MyDate();
		curDate.print();
		MyDate nextDate = new MyDate("18th", "Feb", "2022");
		nextDate.setMyDate("19th", "Feb", "2022");
		nextDate.getMyDate();
		MyDate anotherDate = new MyDate("15th Aug 2022");
		
	}
}
