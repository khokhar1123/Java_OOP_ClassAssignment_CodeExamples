package labs.lab2;
// This program is used to take inputs for grades continuously until the user wishes to exit. It then outputs the average of those grades.
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// scanner named as input is used to scan input from console screen
		//line 10- 12 is the initialization of the variables
		int option = 0;
		int count = 0;
		double avg = 0.0;
		double total = 0.0;
		
		//following is  a while loop used which will exit the loop if the variable option is equal to -1
		while (option != -1) {
			System.out.print("Enter grade : ");//prompts the user to enter a grade
		    double grade = Double.parseDouble(input.nextLine()); // stores the user input into a variable named as grade
		    count++;//increments the counter by 1
		    total = total + grade;// calculates the total of all grades
		    System.out.print("If you want to exit enter -1 else press 1 to continue adding grades. ");//asks the user if they want to exit or if they wish to continue
            option = Integer.parseInt(input.nextLine());//stores the option chosen
		}
		avg = total/count; //calculates the average of all grades entered
		System.out.print("Average is : " + avg);// prints the average to console screen
		
		input.close();// close scanner
	}

}
