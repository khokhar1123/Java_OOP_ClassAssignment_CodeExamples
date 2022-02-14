package labs.lab1;

import java.util.Scanner;

public class AmountWood {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // scanner named as input is used to scan input from console screen
		System.out.print("Please enter length : "); //  prompts user for length
		int length =Integer.parseInt(input.nextLine()); // stores the input of length in a variable
		// check applied to avoid negative input for a length
		while (length <= 0) { 
			System.out.print("Please enter length : ");
			length =Integer.parseInt(input.nextLine()); 
		}
		
		System.out.print("Please enter width : "); // prompts user for width
		// check applied to avoid negative input for a width
		int width =Integer.parseInt(input.nextLine());
		while (width <= 0) {
			System.out.print("Please enter width : ");
            width =Integer.parseInt(input.nextLine());
		}
		System.out.print("Please enter depth : ");// prompts user for depth
		// check applied to avoid negative input for a depth
		int depth =Integer.parseInt(input.nextLine());
		while (depth <= 0) {
			System.out.print("Please enter depth : ");
			depth =Integer.parseInt(input.nextLine());
		}
		
		int amount = (2*length*width) + (2*length*depth) + (2*depth*width); // calculates the amount of wood needed and stores the answer in a variable called amount
		System.out.print("The amount of wood needed is : " + amount + " squarefeet" ); // outputs the amount to the console screen
		
		input.close();//closes the scanner
	}

}
/*
 * TEST PLAN
 * The formula used for the calculation of amount of wood needed is listed below.
 * amount = (2 x length x width) + (2 x length x depth) + (2 x depth x width)
 * 
 * Length(ft)     Width(ft)     Depth(ft)     Amount(sq.ft)
 * 100		      20            10            6400
 * 5		      5			    10		      250
 * 2	          2		        2  	 	      24
 * 1000		      2000		    3000          22000000
 * 
 *   The results match with the output produced by the program.
 */