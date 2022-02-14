package labs.lab6;

import java.util.ArrayList;



public class TravelMethods {
	private ArrayList<Trip> trip;

    public TravelMethods() {
        trip = new ArrayList<Trip>();
    }

    public TravelMethods(Trip[] trips) {
        trip = new ArrayList<Trip>(trips.length);
        for (Trip t : trips) {
            trip.add(t);
        }
    }
    
    public String getData() {
    	String instance;
    	int count = 2;
         if (trip.get(0) instanceof Flight) {
        	 instance="Flight";
            } else if(trip.get(0) instanceof Drive) {
            	instance="Drive";
            }else instance = "Train";
       	 String outdata = "1: "  +" Origin: " + trip.get(0).getOrigin()+", Destination: "+ trip.get(0).getDestination()+", Type: "+ instance;
         for (int i=1; i<trip.size(); i++) {
        	 if (trip.get(i) instanceof Flight) {
            	 instance="Flight";
                } else if(trip.get(i) instanceof Drive) {
                	instance="Drive";
                }else instance = "Train";
       		 outdata += "\n" + (count) + ": " +" Origin: " + trip.get(i).getOrigin()+", Destination: "+ trip.get(i).getDestination()+", Type: "+ instance;
             count++;
         }
         return outdata;
    }
    public void addData(Trip t) {
        trip.add(t);
        
    }
  public String toString() {
    	int count = 2;
        
    	if (trip.size() == 0) {
            return "There are no trips";
        }
        String outdata = "1: " + trip.get(0).travel();

        for (int i=1; i<trip.size(); i++) {
            outdata += "\n" + (count) + ": " + trip.get(i).travel();
            count++;
        }

        return outdata;
    }
    public void removeData(int index) {
        trip.remove(index);
    }

    public String get(int index) {
        return trip.get(index).travel();
    }
   public int getSize() {
        return trip.size();
    }
    public void clearData() {
        trip.clear();
    }
}
