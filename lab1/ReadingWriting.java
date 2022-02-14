

// The following program takes in an input from the user and outputs it to the console screen
package labs.lab1;

import java.util.Scanner;

public class ReadingWriting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   // scanner named input is used to define scanner
		System.out.print("Enter your name please : "); // prompts the user for the name
		String name = input.nextLine(); // stores the input from user into variable called name
		System.out.println(name); // outputs the name to the console screen
		
		input.close(); //closes the scanner
				
	}

}
