package Lab03_AimsProject;

public class MainDate {

	public static void main(String[] args) {
		
		MyDate curDate = new MyDate();
		MyDate nextDate = new MyDate("18th", "Feb", 2022);
		nextDate.setMyDate("19th", "Feb", 2022);
		nextDate.getMyDate();
		nextDate.print();
		MyDate anotherDate = new MyDate("15th Aug 2022");
		anotherDate.accept();
		
	}
}