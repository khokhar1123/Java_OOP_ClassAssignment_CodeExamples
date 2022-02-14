
//The following program performs several arithmetic calculations
package labs.lab1;
import java.util.Scanner;
public class ArithmeticCalculations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//scanner named input is used to define scanner
		
		System.out.print("Enter your age : "); // prompts the user for input of their age
		int user_age =Integer.parseInt(input.nextLine()); // stores the input in a variable called user_age
		
		System.out.print("Enter your father's age : "); // prompts user to enter their fathers age
		int father_age =Integer.parseInt(input.nextLine());// stores the input in the fathers_age variable
		
		System.out.println("The following calculation will tell you the difference between your and your father's age");
		int difference = father_age - user_age;// calculates the difference between user's father age and user age
		System.out.println("Difference : " + difference); // outputs the difference onto console screen
		
		System.out.print("Enter your birthyear : "); // prompts user to enter their birth year
		int year =Integer.parseInt(input.nextLine()); // stores the input from user into a variable year
		System.out.println("The following calculation will tell you the twice of your birthyear which is : " + (year*2)); // outputs the twice of birth year onto console screen
		
		System.out.print("Enter your height in inches : ");// prompts user for height in inches
		int height_inches =Integer.parseInt(input.nextLine());// stores the input in a variable called height_inches and converts the input to integer
		System.out.println("The following calculation will tell your height in cm which is : " + (height_inches*2.54) + ""); //outputs the height in cm 
		
		
			int heightinfeet = height_inches / 12; // performs division on user height
			int inchesheight = height_inches % 12; // performs the modulo function
			System.out.println(" And Your height in feet and inches which is : " + heightinfeet + " ft " + inchesheight + " inches");// output user height in feet and inches
		
		
		input.close(); //closes the scanner
		
	
	}

}
