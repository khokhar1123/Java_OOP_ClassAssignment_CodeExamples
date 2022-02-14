package labs.lab1;
//the following program takes an inches input from user and converts it to cm and vice versa
import java.util.Scanner;

public class InchesCm {


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);// scanner is named and initialized to take read input from console
			System.out.print("Please enter length in inches : "); // prompts user for an inches value
			double inch =input.nextDouble(); // stores it as double in a variable input
			double convert_cm = 0;// initializes convert_cm to 0
			convert_cm = (inch*2.54);// performs the calculation
			System.out.println("Length in centimeter is : " + convert_cm + " cm"); // outputs the value as centimeters to the screen
			
			System.out.print("Please enter length in centimeter : ");// prompts user for a cm value
			double cm =input.nextDouble();  // stores it as double in a variable cm
			double convert_inch = 0;// initializes convert_inch to 0
			convert_inch = (cm/2.54);// performs the calculation
			System.out.print("Length in iches is : " + convert_inch + " inches");// outputs the value as inches to the screen
			
			
			input.close();//closes the scanner
			
		}

	}
	/* TEST PLAN
	 * 
	 * The formula to convert inches to centimeters is : centimeters = inches x 2.54
	 *   Inches                           Centimeter
	 *    0                                0.0
	 *    25                               63.5
	 *    256.5                            651.51
	 *    1000                             2540.0
	 *    zero                             error will occur
	 *    
	 *    The formula to convert centimeters to inches is : inches = centimeters / 2.54
	 *    Centimeters                Inches
	 *    0                          0.0
	 *    100                        39.37007874015748
	 *    2.54                       1.0
	 *    2540                       1000.0
	 *    4058                       1597.6377952755906
	 *    
	 *    The results match with the output of program.
	 *    
	 */    
