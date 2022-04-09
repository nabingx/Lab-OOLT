package Lab02;

import java.util.Arrays; 

public class Ex56 {
	public static void main(String[] args){   
		int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
                  
		System.out.println("Original numeric array : " + Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
    
    }
}
