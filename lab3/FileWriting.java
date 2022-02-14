package labs.lab3;
//The following program takes in input from user until they are done. Data is temporarily stored on array. A file is created and data is copied from array to the file.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);// scanner named as input is used to scan input from console screen
		String option = "";// initializes the variable
		String values[] =new String[2];//creates an array of data type string 
		String num;//declares the variable
		String name;//declares the variable
		int count=0;//initializes count to 0
		//below is a do while loop
		do {
			System.out.println("Please Enter a number");//prompts the user for a number
			num =input.nextLine();//stores the input in the variable num
			// below is the condition used to check if the array is full. It then copies data into temporary array of greater seize
			if (count==values.length) {
				String temp_array[] =new String[values.length + 5];//creates temporary array of greater size
				for(int i = 0; i<values.length;i++) {
        			temp_array[i] = values[i];//copies contents of previous array to temporary array
        		}
        		
        		values = temp_array;
        		temp_array=null; //nullifies the temporary array
			}
			values[count] = num;//stores data from variable num to original array
    		count = count +1;//increments the count
    		System.out.println("If you don't want to continue adding numbers enter Done else press any key.");//asks the user if they want to continue or not
    		option=input.nextLine();
		}while(!(option.equals("Done")));//the do loop will keep running until option is not equal to done 
		System.out.println("Enter the name of file where data is to be written");//prompts the user for file name
		name = input.nextLine();//stores the file name in a variable
		FileWriter writer = new FileWriter("src/labs/lab3/"+name);//creates the file writer to write data in file
		//for loop used to copy the contents of array to the file
		for(int i=0; i<count;i++) {
			
				writer.write(values[i] + "\n");//writes data in array to the file 
			
		}
		writer.close();//closes file writer
        input.close();//closes scanner
	}

}
