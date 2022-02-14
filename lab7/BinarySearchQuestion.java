package labs.lab7;

import java.util.Scanner;
    
public class BinarySearchQuestion {

	public static void main(String[] args) {
		int index;
		String value;
		Scanner input=new Scanner(System.in);
		String data[]={"c", "html", "java", "python", "ruby", "scala"};
		System.out.println("Please enter the value you want to search: ");
		value=input.nextLine();
		index= recBinarySearch(data,0,data.length -1,value);
		if(index<0) {
			System.out.println("Sorry the value you entered was not found.");
		}else {
				System.out.println("The value was found at the index: "+ index);
			}
		input.close();
		}

public static int recBinarySearch(String darray[],int start,int end,String searchval) {
    	int mid;
    	mid=(end+start)/2;
    	if (end<start) {
    		return -1;
    	}
    	if (darray[mid].equalsIgnoreCase(searchval)) {
    		return mid;
    	}else if(darray[mid].compareToIgnoreCase(searchval)<0) {
    		return recBinarySearch(darray,mid+1,end,searchval);
    	}
    	return recBinarySearch(darray,start,mid-1,searchval);
        }
}