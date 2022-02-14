package labs.lab1;
//the following program is used to convert the temperature from farenheit to celcius and vice versa. 
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//scanner named input is used to define scanner
		System.out.print("Please enter temperature in Fahrenheit : ");// prompts user to enter fahrenheit temperature
		double convert_celcius = 0; // initializes the variable convert_celcius to 0
		double ftemp =input.nextDouble(); // stores the input from user to ftemp
		convert_celcius = ((ftemp - 32)*5)/9; // performs the conversion
		System.out.println("Temperature in Celcius is : " + convert_celcius  ); // outputs the temperature in celcius to the console screen
		
		System.out.print("Please enter temperature in Celcius : ");// prompts user to enter celcius temperature
		double convert_farenheit = 0;// initializes the variable convert_fahrenheit to 0
		double ctemp =input.nextDouble(); // stores the input from user to ctemp
		convert_farenheit = (((ctemp/5)*9) + 32);// performs the conversion
		System.out.println("Temperature in Celcius is : " + convert_farenheit ); // outputs the temperature in fehrenheit to the console screen
		
		
		input.close();//closes the scanner

	}

}
/* TEST PLAN
 * 
 * The formula to convert celcius temperature to fahrenheit is : fahrenheit temperature = ((celcius temperature x 9)/5) + 32
 *
 *   Celcius Temperature(C)           Fahrenheit Temperature(F)
 *    0                                32.0
 *   -10                               14.0
 *    100                              212.0
 *    1000                             1832.0
 *    zero                             error will occur
 *    
 *    
 * The formula to convert fahrenheit temperature to celcius is : celcius temperature = ((fahrenheit temperature - 32) x 5)/9
 * 
 *   
 *   Farenheit Temperature(F)         Celcius Temperature(C)           
 *    32                                0.0
 *   -45                               -42.77777777777778
 *    100                               37.77777777777778
 *    2000                              1093.3333333333333
 *    zero                              error will occur
 * 
 * The results match with the output produced by the program.
 */
 