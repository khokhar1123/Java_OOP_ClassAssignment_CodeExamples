package labs.lab5;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class TravelApp {

	public static void main(String[] args) throws IOException {
		
		boolean flag = true;
		Trip[] trips = new Trip[0];
        trips=readExistingFile(trips);  
		Scanner input = new Scanner(System.in);
        
		do {
			System.out.println("Please enter what you want to do. 1:Take Trips  2:Add Trips  3.Exit");
			int choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case 1 : trips=takeTrips(trips);
			         break;
			case 2 : if(trips.length >=5) {
				     System.out.println("Too many trips");
			         }else trips=addTrip(trips,input);
			
			         break;
			case 3 : System.out.println("GoodBye");
			         flag=false;
			         break;
			}
		}while(flag);		
		input.close();
	}
	public static Trip[] readExistingFile(Trip[] trips) throws IOException {
		int count=0;
		File datafile = new File("src/labs/lab5/travel.csv");
		Scanner filereader = new Scanner(datafile);
		String line;
		while(filereader.hasNextLine() && count<5) {
		    trips=altersize(trips); 
			line=filereader.nextLine();
		     
		     String[] seprate =line.split(",");
		     if(seprate[0].equals("Drive")) {
		    	 Drive d = new Drive((Double.parseDouble(seprate[3])),seprate[1],seprate[2],Double.parseDouble((seprate[4])));
		    	 trips[count]=d;
		     }else if(seprate[0].equals("Flight")) {
		    	 Flight f = new Flight((Double.parseDouble(seprate[3])),seprate[1],seprate[2],Boolean.parseBoolean(seprate[4]));
		    	 trips[count]=f;
		     }else if(seprate[0].equals("Train")) {
		    	 String[] stops = new String[seprate.length-4];
		    	 int c=0;
		    	 for(int i=4;i<seprate.length;i++) {
		    		 stops[c]=seprate[i];
		    	 }
		    	  Train t = new Train((Double.parseDouble(seprate[3])),seprate[1],seprate[2],stops);
		    	 trips[count]=t;
		     }
		     count++;
		}
		filereader.close();
		return trips;
	}
	public static Trip[] takeTrips(Trip[] trips) {
		for(int i=0;i<trips.length;i++) {
			System.out.println(trips[i].travel());
		}
		trips = new Trip[0];
		return trips;
	}
	public static Trip[] addTrip(Trip[] trips,Scanner input) {
		    trips=altersize(trips);
		  
		    double duration;
		    String origin;
		    String destination;
            boolean flag;
            flag=false;
			
			System.out.println("Enter Duration in hours: "); 
			 duration=Double.parseDouble(input.nextLine());
			 while(duration<0) {
			 System.out.println("Incorrect value. Please Enter a positive value for duration:");
			 duration=Double.parseDouble(input.nextLine());
			 }
			System.out.println("Enter Origin: ");
			 origin = input.nextLine();
			System.out.println("Enter Destination: ");
			 destination = input.nextLine();
			
			System.out.println("Please select the mode of trip: 1.Drive   2.Flight   3.Train");
			do {
			int option = Integer.parseInt(input.nextLine());
			switch (option) {
			case 1 : double gog;
				     System.out.println("Enter the gallons of gas: ");
			         gog=Double.parseDouble(input.nextLine());
			         while(gog<0) {
						 System.out.println("Incorrect value. Please Enter a positive value for gallons: ");
						 gog=Double.parseDouble(input.nextLine());
						 }
			         Drive d1 = new  Drive(duration,origin,destination,gog);
			         trips[trips.length-1]=d1;
			         flag=true;
			         break;
			case 2 : System.out.println("Does it has meals ? Please enter yes or no ");
			       String choice = input.nextLine();
			       boolean meals;
			       if (choice.equalsIgnoreCase("yes")) {
			    	   meals=true;
			       }else {
			    	   meals=false;
			       }
			       Flight f1 = new Flight(duration,origin,destination,meals);
			       trips[trips.length-1]=f1;
			         flag=true;
			       break;
			case 3 :System.out.println("Please enter the number of stops:");
			        String[] stops = new String[Integer.parseInt(input.nextLine())];
			        for(int i=0;i<stops.length;i++) {
			        	System.out.println("Please enter the name of the stop:");
			        	String stop=input.nextLine();
			        	stops[i]= stop;
			        }
			        Train t1 = new Train(duration,origin,destination,stops);
			        trips[trips.length-1]=t1;
			        flag=true;
			        break;
			}
			
		}while(!flag);
			
			
		   return trips;
		  
	}
public static Trip[] altersize(Trip[] trips) {
	Trip temp_array[] =new Trip[trips.length + 1];
		for(int i = 0; i<trips.length;i++) {
			temp_array[i] = trips[i];
		}
		
		trips = temp_array;
		temp_array=null; 
		return trips;
	}

	
	
	
	
	
	
	
	
	
	
	
}
