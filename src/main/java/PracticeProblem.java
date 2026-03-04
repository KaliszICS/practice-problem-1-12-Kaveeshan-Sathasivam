/**
 * File: Converting Data Types
 * Author: Kaveeshan
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        number = number + 3;

        System.out.println(number);
	}

	public static void q2() {
		//Write question 2 code here
      	Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String input = scanner.nextLine();
        String concatenated = input + "4";
        double number = Double.parseDouble(concatenated);
        number = number + 2;
        System.out.println(number);

	}

	public static void q3() {
		//Write question 3 code here
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Input a radius: ");
        double radius = scanner.nextDouble();
		double area = 3.14 * (radius * radius);

        System.out.println(area);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String input = scanner.nextLine();

        double number = Double.parseDouble(input);
        number = number * 12;

        number = Math.floor(number);

        System.out.println(number);


	}

}
