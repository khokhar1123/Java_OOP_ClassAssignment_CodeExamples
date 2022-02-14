package labs.lab2;
//This program ask user to chose an option from the menu and keep prompting them until they wish to exit
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// scanner named as input is used to scan input from console screen
		int option = 0;// initializes the variable
		
		//following is a do-while loop which will continue asking the user for an input from the menu until the user presses 4 to exit
		do {
			System.out.println("Please select an option. 1. Say Hello 2. Addition 3. Multiplication 4. Exit ");
			option = Integer.parseInt(input.nextLine());
		//following is a switch structure used to deal with the selections from the menu
			switch (option) {
			case 1 : System.out.println("Hello");//outputs hello to console screen if user chose option 1
			break;
			case 2 : System.out.println("Enter two numbers");//prompts the user to enter two numbers if user chose option 2 from menu
			 int x = Integer.parseInt(input.nextLine());//stores first number in variable x
			 int y = Integer.parseInt(input.nextLine());// stores second number in variable y
			 System.out.println("The sum is : " + (x+y));// outputs the sum to the console screen
			 break;
			case 3 :  System.out.println("Enter two numbers");//prompts the user to enter two numbers if user chose option 3 from menu
			 int a = Integer.parseInt(input.nextLine());//stores first number in variable a
			 int b = Integer.parseInt(input.nextLine());//stores first number in variable s
			 System.out.println("The product is : " + (a*b));// outputs the product to the console screen
			 break;
			case 4 :  System.out.println("Program exits now");// outputs an exit message
			break;
			} 
			
			
			
		} while (option != 4);// if option 4 is chosen the loop will exit. It is the condition statement for the do loop
		
		input.close();
	}

}
