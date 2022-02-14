package labs.lab4;
//This is the Date class which include declaration of instance variables and coding of mutators accessor and methods
public class Date {
//line 5-7 deals with declaration of the instance variable as private access modifier
	private int date;
    private int year;
    private int month;
    // Line 9 to 13 is the default constructor which sets a default value for all instance variables
    public Date() {
    	date = 0;
    	year = 0;
    	month = 0;
    }
  //Line 135-19 is the non-default constructor. It sets the values of variables equal to the parameters passed and uses the mutators.
    public Date(int date, int month, int year) {
    	setDate(date);
    	setMonth(month);
    	setYear(year);
    }
    // below is a accessor method used to return the year
    public int getYear() {
    	return year;
    }
    //below is an accessor method used to return the date
    public int getDate() {
    	return date;
    }
    //below is an accessor method used to return the month
    public int getMonth() {
    	return month;
    }
 // below is the toString method which return the string ouyput in the specified manner
    public String toString() {
    	return date + "/" + month + "/" + year;
    }
    // below is valDate method which checks if the passed value of date is in range
    public boolean valDate(int date) {
    	if (date >= 1 && date<= 31) {//checks the range
    		return true;//return true if in range
    	}
    	return false;// return false if out of range.
    }
 // below is valMont method which checks if the passed value of month is in range
    public boolean valMonth(int month) {
    	if (month >= 1 && month<= 31) {// checks the range
    		return true;//return true for in range
    	}
    	return false;// return false for out of range
    }
 // below is setYear mutator method which sets the passed value of year to this.year if year>0
    public void setYear(int year) {
    	if (year >0) {
    		this.year=year;
    	}
    }
    // below is a setDate mutator method used to set the value of date to the passed value of date if valDate() is true
    public void setDate(int date) {
    	if(valDate(date)) {//  checks if the valDate for the passed value is true
    		this.date=date;
    	}
    }
 // below is a setMonth mutator method used to set the value of month to the passed value of month if valMonth() is true
    public void setMonth(int month) {
    	if(valMonth(month)) {// checks if  valMonth for passed value is true
    		this.month=month;
    	}
    }
}
