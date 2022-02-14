package labs.lab5;

public class Flight extends Trip {
private boolean meals;

public Flight() {
 super();
 meals = true;
}
public Flight(double duration,String origin,String destination,boolean meals) {
	super(duration,origin, destination);
	this.meals=meals;
}
public boolean hasMeals() {
	return meals;
}
public void setMeals(boolean meals) {
	this.meals=meals;
}
public String toString() {
	return super.toString() + " Meals: " + meals;
}
public boolean equals(Flight f) {
	if(!super.equals(f)) {
		return false;
	}else if (meals!=f.hasMeals()) {
		return false;
	}
	return  true;
}

public String travel() {
	return "Flight from '" + origin + "' to ' " + destination + "' - "+ super.getDuration() + " hours.";
}


}