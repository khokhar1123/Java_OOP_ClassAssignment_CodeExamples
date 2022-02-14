package labs.lab4;

public class GeoClient {

	public static void main(String[] args) {
	  GeoLocation g1 = new GeoLocation();// instantiates an instance of GeoLocation class named as g1 using default constructor
	  GeoLocation g2 = new GeoLocation(40,80);// instantiates an instance of GeoLocation class named as g2 using non-default constructor and passes two values
	  System.out.println("Longitude value of g1 is " + g1.getLng());// outputs the longitude part of g1 using the accessor method
	  System.out.println("Latitude value of g1 is " + g1.getLat());// outputs the latitude part of g1 using the accessor method
	  System.out.println("Longitude value of g2 is " + g2.getLng());// outputs the longitude part of g2 using the accessor method
	  System.out.println("Latitude value of g2 is " + g2.getLat());// outputs the latitude part of g2 using the accessor method
	}

}
