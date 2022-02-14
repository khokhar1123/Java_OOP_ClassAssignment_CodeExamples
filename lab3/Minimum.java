package labs.lab3;
//The following program outputs the minimum value in the array.
public class Minimum {

	public static void main(String[] args) {
				//Below an array is created and contents of array are told.
		        int values [] = {72, 101, 108, 108, 111, 32, 101, 118, 101, 114, 121, 111, 110, 101, 33, 32, 76, 111, 111, 107, 32, 97, 116, 32, 116, 104, 101, 115, 101, 32, 99, 111, 111, 108, 32, 115, 121, 109, 98, 111, 108, 115, 58, 32, 63264, 32, 945, 32, 8747, 32, 8899, 32, 62421};
                int minval = 0;//initializes minival to 0
                minval = values[0];//set minval to first value in the array
                // Below a for loop is used. The for loops run till end of array and checks for minimum value
		for (int i = 0; i < values.length; i++) {
			if (values[i] < minval) {//it checks if the values[i] which is the content at 'i'th location is less than minval
				minval = values[i];//if minval is values[i] is less than minval then minval is set to values[i[
			}
			
		}
		System.out.println("The minimum value from the array is : " + minval);//it outputs the minimum value to the console screen.
	}

}
