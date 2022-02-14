package labs.lab6;



public abstract class Trip {
private double duration;
protected String origin;
protected String destination;

public Trip() {
	duration = 0;
	origin = "";
	destination ="";
}
public Trip(double duration,String origin,String destination) {
	this();
	setDuration(duration);
	setOrigin(origin);
	setDestination(destination);
}
public String getOrigin() {
	return origin;
}
public String getDestination() {
	return destination;
}
public double getDuration() {
	return duration;
}
public void setOrigin(String origin) {
    this.origin=origin;
}
public void setDestination(String destination) {
	this.destination=destination;
}
public void setDuration(double duration) {
	if (duration >0) {
		this.duration=duration;
	}
}
public boolean equals(Trip t) {
	if(duration != t.getDuration()) {
		return false;
	} else if(origin != t.getOrigin()) {
		return false;
	}else if (destination != t.getDestination()) {
		return false;
	} 
	return true;
}
public String toString() {
	return "Origin: " + origin + " Destination: "+ destination + " Duration: " + duration;
}
public abstract String travel();
}