package labs.lab4;
//This is the Geo location class which include declaration of instance variables and coding of mutators accessor and methods
public class GeoLocation {

	private double lng; // declares an instance variable for longitude using private access modifier
	private double lat;// declares an instance variable for latitude using private access modifier
	 // Line 8 to 10 is the default constructor which sets a default value for both instance variables
	public GeoLocation() {
		lng=0;
		lat=0;
	}
	//Line 13-15 is the non-default constructor. It sets the values of variables equal to the parameters passed using the mutators.
	public GeoLocation(double lat, double lng) {
		setLat(lat);//calls the mutator to set lat
		setLng(lng);//calls the mutator to set lng
	}
	//line 18-19 is a mutator method which sets the passed parameter value if verifyLng is true 
	public void setLng(double lng) {
		if(verifyLng(lng)) { //checks if value is in range
			this.lng=lng; // sets the value to the passed parameter value
		}		
	}
	//line 24-26 is a mutator method which sets the passed parameter value if verifyLat is true
	public void setLat(double lat) {
		if(verifyLat(lat)) { //checks if value is in range
			this.lat=lat; // sets the value to the passed parameter value
		}		
	}
	//below is an accessor method which returns the value of lat
	public double getLat() {
		return lat;
	}
	//below is an accessor method which returns the value of lng
	public double getLng() {
		return lng;
	}
	// below is the toString method which return the string output in the specified manner
	public String toString() {
		return "(" + lat + "," + lng +")";
	}
	// below is the verifyLat method which checks if the passed lat value is in range
	public boolean verifyLat(double lat) {
		if (lat>= -90 && lat <= 90.8) {// checks for range
			return true;// returns true if value is in the range
		}
		return false;// returns false if value is out of range
	}
	// below is the verifyLng method which checks if the passed lng value is in range
	public boolean verifyLng(double lng) {
		if (lng>= -180 && lng <=180.9) {// checks for range
			return true;// returns true if value is in the range
		}
		return false;// returns false if value is out of range
	}

}
