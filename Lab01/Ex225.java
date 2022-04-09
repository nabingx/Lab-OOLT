package Lab01;

import java.util.Scanner;

public class Ex225{
	public static void main(String[] args) {
		
		double num1, num2;
		System.out.println("Enter 2 number: ");

		Scanner scanner = new Scanner(System.in);
		num1 = Double.parseDouble(scanner.next());
		num2 = Double.parseDouble(scanner.next());

		System.out.println(num1);
		System.out.println(num2);

		System.out.println("Sum: " + (num1 + num2));
		System.out.println("Difference: " + (num1 - num2));
		System.out.println("Product: " + (num1 * num2));
		System.out.println("Quotient: " + (int)(num1 / num2));
		System.out.println("Divisor of the division: " + (num1 % num2));

		scanner.close();
		
	}
}