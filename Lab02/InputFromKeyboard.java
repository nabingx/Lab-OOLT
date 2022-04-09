package Lab02;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		//similar to other data types
		//nextByte(), nextShort(), nextLong()
		//nextFloat(), next Boolean
		
		System.out.println("Mr/Mrs " + strName + ", " + iAge + " years olds. " + "Your height is " + dHeight + ".");

	}

}
