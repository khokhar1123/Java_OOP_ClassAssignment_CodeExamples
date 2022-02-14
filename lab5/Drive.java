package labs.lab5;

public class Drive extends Trip {

	private double gallonsOfGas;
	public Drive() {
		super();
		 gallonsOfGas = 0;
	}
	public Drive(double duration,String origin,String destination,double gallonsOfGas) {
		super(duration,origin,destination);
		setGallonsOfGas(gallonsOfGas);
		}
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}
	public void setGallonsOfGas(double gallons) {
		if(gallons>0) {
			this.gallonsOfGas=gallons;
		}
	}
	public boolean equals(Drive d) {
		if(!super.equals(d)) {
			return false;
		}else if (gallonsOfGas!=d.getGallonsOfGas()) {
			return false;
		}
		return  true;
	}
	public String toString() {
		return super.toString() + " Gallons: " + gallonsOfGas;
	}
	public String travel() {
		return "Drive from '" + origin + "' to ' " + destination + "' - "+ super.getDuration() + " hours.";
	}
	
	
	
	

}
