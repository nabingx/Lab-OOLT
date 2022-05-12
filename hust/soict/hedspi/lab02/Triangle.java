package hust.soict.hedspi.lab02;

public class Triangle {

	public static void main(String[] args) {
		
		System.out.println("Height of the triangle is 5");
		int h = 5;
		int h2 = h * 2, count = 1;
		
		for(int i = 1; i < h2 ; i++) {
			/*for(int k = 0; k < (h - i); k++) {
				if(i % 2 == 1) System.out.print(" ");
			}*/
			//int push = 10 - count;
			int push = h2 - count;
			while(push > 0) {
				System.out.print(" ");
				push--;
			}
			if(i % 2 == 0) {System.out.println(); count--;}
			else for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			count++;
			//if(i % 2 == 0) continue;
			//else System.out.println();
		}

	}

}
