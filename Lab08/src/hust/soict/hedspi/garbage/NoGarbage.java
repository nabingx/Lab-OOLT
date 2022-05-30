package Lab08.src.hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
	
	private StringBuffer sbf;
	private int data;
	private double[] arr;
	private int i = 0;
	
	public NoGarbage() {
		try {
			arr = new double[30000];
			sbf = new StringBuffer();
			FileReader reader = new FileReader("D:\\Lab-OOLT\\Lab05\\src\\hust\\soict\\hedspi\\garbage\\content_poem.txt");
			data = reader.read();
			while(true) {
				sbf.append((char) data);
				arr[i] = sbf.hashCode();
				i++;
				//System.out.print((char) data);
				data = reader.read();
				if(data == -1) break;
			}
			reader.close();
			System.out.println(sbf);
			//System.out.println(sbf.length());
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			
			int gab = arr.length;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] == arr[i + 1]) gab--;
			}
			
			//if(gab >= 20000) System.out.println("ALERT! - Too much garbages!");
			assert gab < 20000 : "ALERT! - Too much garbages!";
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
