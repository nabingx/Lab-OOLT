package Lab08.src.hust.soict.hedspi.aims.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public void swap(MyDate date1, MyDate date2) {
		MyDate tmp = date1;
		date1.setMyDate2(date2);
		date2.setMyDate2(tmp);
	}

	public int compare2Dates(MyDate date1 , MyDate date2) throws ParseException {
		
		SimpleDateFormat tmp = new SimpleDateFormat("dd MM yyyy");
		Date dateComp1 = tmp.parse(date1.getMyDate2());
		Date dateComp2 = tmp.parse(date2.getMyDate2());
		
		return dateComp1.compareTo(dateComp2);
	}
	
	public void sort(MyDate[] myDate_arr) throws ParseException {
		for(int i = 0 ; i < myDate_arr.length; i++) 
			for(int j = i ; j < myDate_arr.length; j++) 
				if(compare2Dates(myDate_arr[i], myDate_arr[j]) > 0) swap(myDate_arr[i], myDate_arr[j]);
	}
	

}
