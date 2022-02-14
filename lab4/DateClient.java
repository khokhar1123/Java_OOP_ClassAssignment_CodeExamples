package labs.lab4;

public class DateClient {

	public static void main(String[] args) {
     Date d1 = new Date();// instantiates an instance of Date class named as d1 using default constructor
     Date d2 = new Date (12,2,2001);// instantiates an instance of Date class named as d1 using non-default constructor and it sets the value to the passed values
     System.out.println("date d1 is: " + d1.toString());// outputs the date d1 as whole string using to.String method
     System.out.println("date d2 is: " +d2.toString());// outputs the date d2 as whole string using to.String method

	}

}
