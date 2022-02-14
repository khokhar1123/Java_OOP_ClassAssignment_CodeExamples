
// this program takes user first name as input and outputs their first initial
package labs.lab1;
import java.util.Scanner;
public class FirstInitials {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//scanner named input is used to define scanner
		System.out.print("Enter your first name please : "); // prompts user to enter first name
		String name = input.nextLine(); // stores first name in the variable called name
		char initial = name.charAt(0);  // extract the character first letter from user first name and store it in a variable initial
		System.out.println("Your First Initial is : " + initial ); // outputs the initials on to console screen
		
		input.close(); //closes the scanner
	}

}
