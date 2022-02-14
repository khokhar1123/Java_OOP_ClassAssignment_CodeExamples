package labs.lab6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TravelApplication {

	public static void main(String[] args) throws IOException {
		TravelMethods trips = new TravelMethods();
		boolean flag = true;
        trips=readExistingFile(trips);  
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Please enter what you want to do. ");
			System.out.println("1-Create Trip ");
			System.out.println("2-Remove Trip ");
			System.out.println("3-View a single trip: ");
			System.out.println("4-Take all trips: ");
			System.out.println("5-Exit");
			int choice = Integer.parseInt(input.nextLine());
			switch (choice) {
			case 1 : trips=addTrip(trips,input);
			         break;
			case 2 : trips = eraseTrip(trips,input);
			         break;
			case 3 : displayTrip(trips,input);
			         break;
			case 4 : takeAllTrips(trips);
			         break;
			case 5 : System.out.println("Bye.");
			         flag=false;
			         break;
			}
		}while(flag);		
	}
	public static TravelMethods readExistingFile(TravelMethods trips) throws IOException {
		File datafile = new File("src/labs/lab5/travel.csv");
		Scanner filereader = new Scanner(datafile);
		String line;
		while(filereader.hasNextLine()) {
			line=filereader.nextLine();
		     String[] seprate =line.split(",");
		     if(seprate[0].equals("Drive")) {
		    	 Drive d = new Drive((Double.parseDouble(seprate[3])),seprate[1],seprate[2],Double.parseDouble((seprate[4])));
		    	 trips.addData(d);
		     }else if(seprate[0].equals("Flight")) {
		    	 Flight f = new Flight((Double.parseDouble(seprate[3])),seprate[1],seprate[2],Boolean.parseBoolean(seprate[4]));
		    	 trips.addData(f);
		     }else if(seprate[0].equals("Train")) {
		    	 String[] stops = new String[seprate.length-4];
		    	 int c=0;
		    	 for(int i=4;i<seprate.length;i++) {
		    		 stops[c]=seprate[i];
		    	 }
		    	  Train t = new Train((Double.parseDouble(seprate[3])),seprate[1],seprate[2],stops);
		    	  trips.addData(t);
		     }
		}
		filereader.close();
		return trips;
	}
	public static TravelMethods takeAllTrips(TravelMethods trips) {
		System.out.println("Trips: ");
		System.out.println(trips.toString());
		trips.clearData();
		return trips;
	}
	public static TravelMethods addTrip(TravelMethods trips,Scanner input) {
		    double duration;
		    String origin;
		    String destination;
            boolean flag=false;
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
			         trips.addData(d1);
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
			       trips.addData(f1);
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
			        trips.addData(t1);
			        flag=true;
			        break;
			}
		}while(!flag);
		   return trips;  
	}	
	public static TravelMethods eraseTrip(TravelMethods trips, Scanner input) {
		boolean flag = false;
		int choice;
		if(trips.getSize()>0) {
			while(!flag) {
				System.out.println(trips.toString());
				System.out.println("Enter the number of the trip you want to remove : ");
				choice =Integer.parseInt(input.nextLine());
				choice=choice - 1;
				if(choice<trips.getSize() && choice >= 0) {
					trips.removeData(choice);
					flag = true;
				}
				else {
					System.out.println("Invalid entry, enter a valid index");
				}
			}
		}else {
			System.out.println("There is nothing in the List");
		}
		return trips;
	}
  public static void displayTrip(TravelMethods trips, Scanner input) {
	boolean flag = true;
		if(trips.getSize()>0) {
			while(flag) {
				System.out.println(trips.getData());
				System.out.println("Choose the trip you want to view: ");
				int selection = Integer.parseInt(input.nextLine());
				selection--;
				if(selection<trips.getSize() && selection >= 0) {
					System.out.println(trips.get(selection));
					flag = false;
				}
				else {
					System.out.println("The value is not a valid index");
				}
			}
		}else {
			System.out.println("No data");
		}
	}
  }
	



