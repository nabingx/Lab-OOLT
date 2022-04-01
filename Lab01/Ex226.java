package Lab01;

import java.util.Scanner;

public class Ex226 {
    public static void main(String[] args){
        double a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 coefficients of ax + b: ");
        a = Double.parseDouble(scanner.next());
        b = Double.parseDouble(scanner.next());
        System.out.println("x = -b/a = -" + (int)b + "/" + (int)a + " = " + (- b / a));

        double a11, a12, a21, a22, b1, b2, D, D1, D2;
        System.out.println("Enter the coefficients of a11x1 + a12x2 = b1\n\t\t\t  a21x1 + a22x2 = b2");

        System.out.print("a11 = ");
        a11 = Double.parseDouble(scanner.next());
        System.out.print("a12 = ");
        a12 = Double.parseDouble(scanner.next());
        System.out.print("b1 = ");
        b1 = Double.parseDouble(scanner.next());
        System.out.print("a21 = ");
        a21 = Double.parseDouble(scanner.next());
        System.out.print("a22 = ");
        a22 = Double.parseDouble(scanner.next());
        System.out.print("b2 = ");
        b2 = Double.parseDouble(scanner.next());

        D = a11 * a22 - a21 * a12;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;

        System.out.println("D = " + D + "\nD1 = " + D1 + "\nD2 = " + D2);

        if(D != 0) System.out.println("The system has a unique solution (x1, x2) = (" + D1/D + ", " + D2/D + ")");
        else if(D == 0 && D1 == 0 && D2 == 0) System.out.println("The system has infinitely many solutions");
        else System.out.println("No solution");

        System.out.println("Enter the coefficients of Ax^2 + Bx + C = 0 (A != 0): ");
        Double A, B, C;

        System.out.print("A = ");
        A = Double.parseDouble(scanner.next());
        System.out.print("B = ");
        B = Double.parseDouble(scanner.next());
        System.out.print("C = ");
        C = Double.parseDouble(scanner.next());

        Double delta = B * B - 4 * A * C;
        System.out.println("delta = " + delta);

        if(delta == 0) System.out.println("The equation has double root " + (-B / (2 * A)));
        else if(delta > 0) System.out.println("The equation has 2 distinct roots " + ((-B + Math.sqrt(delta)) / (2*A)) + " and " + ((-B - Math.sqrt(delta)) / (2*A)));
        else System.out.println("The equation has no solution");

        scanner.close();
    }

}
