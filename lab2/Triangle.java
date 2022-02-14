package labs.lab2;
//This program takes an input for size of triangle from user and the outputs the triangle of that size to the console screen.
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // scanner named as input is used to scan input from console screen
	System.out.print(" Enter the size of the triangle: "); // prompts the user for the size of triangle
	int size = Integer.parseInt(input.nextLine());// stores the input from user into a variable named as size
		
	for (int i = 0; i < size; i++ ) { // for loop used to iterate through rows
			for (int j = 0; j <= i; j++) { // for loop used to iterate through columns
        	   System.out.print("*"); // prints the '*' for the every row and column
           }
			System.out.println();//moves to next line
		}
           
	
		
	input.close();// closes the scanner 
	}

}
