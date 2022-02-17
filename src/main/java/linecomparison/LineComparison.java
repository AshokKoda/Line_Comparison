package linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static int getInputFromUser(String number) {
		System.out.println("Enter the " + number + " value");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Line Comparison Computation-----------");

		// UC1 - Calculate Length
		System.out.println("Enter the first (x1, y1) point");
		int x1 = getInputFromUser("x1");
		int y1 = getInputFromUser("y1");
		System.out.println("Enter the second (x2, y2) point");
		int x2 = getInputFromUser("x2");
		int y2 = getInputFromUser("y2");
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		Double length = Math.floor(Math.sqrt(x + y));
		System.out.println("Length is: " + length);
		
		//UC2 - Equality of two lines
		System.out.println("Enter the second line of co-ordinated");
        System.out.println("Enter the first (a1, b1) point");
        int a1 = getInputFromUser("a1");
        int b1 = getInputFromUser("b1");
        System.out.println("Enter the second (a2, b2) point");
        int a2 = getInputFromUser("a2");
        int b2 = getInputFromUser("b2");
        double a = Math.pow((a2 - a1), 2);
        double b = Math.pow((b2 - b1), 2);
        double length1 = Math.floor(Math.sqrt(a + b));
        System.out.println("Length is: " + length1);
        
        //UC3 - Length comparison
        int result = length.compareTo(length1);
        System.out.println("Compare both lenghts is: " + result);
        if (result == 0) {
            System.out.println("This line is equals");
        } else if (result > 0) {
            System.out.println("First line is greater then second");
        } else if (result < 0) {
            System.out.println("Second line is greater then first");
        }

	}

}
