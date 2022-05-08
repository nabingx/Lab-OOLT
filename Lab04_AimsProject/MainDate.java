package Lab04_AimsProject;

public class MainDate {

	public static void main(String[] args) {
		
		MyDate curDate = new MyDate();
		MyDate nextDate = new MyDate("18th", "Feb", 2022);
		nextDate.setMyDate("19th", "Feb", 2022);
		nextDate.getMyDate();
		nextDate.print();
		MyDate anotherDate = new MyDate("15th Aug 2022");
		//anotherDate.accept();
		MyDate stringDate = new MyDate("nineteenth", "May", "twenty thirty one"); // twenty nineteen still correct
		stringDate.Print(); // Print()  != print()
		// Phần print theo format như Table 1 em vẫn chưa làm kịp do phải định dạng kĩ hơn
		
	}
}
