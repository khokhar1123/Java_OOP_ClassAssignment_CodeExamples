package labs.lab3;
//the following program is used to extract grades from a file and then calculates the average for those grades. 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GradesReading {

	public static void main(String[] args)throws IOException {
		String[] data = new String[6];// an array of data type String is created 
		//line 12-15 deals with initialization of variables
		int count = 0;
		double total =0;
		double sepdata;
		double avg = 0;
		File  filereader = new File("src/labs/lab3/grades.csv");//file object is created
		Scanner input = new Scanner(filereader);// scanner is created which reads data from the file
//below is a while loop which runs until the end of file is reached
           while (input.hasNextLine()) {
        	String lines = input.nextLine();//data is read and stored in lines variable
        	// below is the condition used to check if the array is full. It then copies data into temporary array of greater seize	
        	if (count == data.length) {
        		String temp_array[] = new String[data.length + 5];//creates temporary array of greater size
        		for(int i = 0; i<data.length;i++) {
        			temp_array[i] = data[i];//copies contents of previous array to temporary array
        		}
        		
        		data = temp_array;
        		temp_array = null;//nullifies the temporary array
        	}
        	data[count] = lines;//stores data from variable lines to original array
        		count = count +1;//increments the counter
         }
		 double marks[] = new double[count];//an array of data type double is created
		 for (int i = 0; i <count;i++) {
			 String[] seprate = data[i].split(",");//string parsing is done to separate data
			 sepdata= Double.parseDouble(seprate[1].substring(0, 2));// it copies extracts the grade from the line and converts it to double
			 marks[i]=sepdata;// stores the grades into marks array
			 total = total + marks[i];//calculates the total of all grades
		 }
				 avg=total/count;//calculates the class average
		System.out.print("The average grade is : " + avg);//outputs the average with a message on console screen
        
        
        
		input.close();//scanner is closed
	}

}
