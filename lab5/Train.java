package labs.lab5;

public class Train extends Trip {

	private String stops[] = null;
	public Train() {
		super();
		 stops = new String[5];
	}
	public Train(double duration,String origin,String destination,String stops[]) {
		super(duration,origin,destination);
		this.stops=stops;
		}
   public String[] getStops() {
	   return stops;
   }
   public void setStops(String stops[]) {
	   this.stops=stops;
   }
   public boolean equals(Train t) {
		if(!super.equals(t)) {
			return false;
		}else if (stops!=t.getStops()) {
			return false;
		}
		return  true;
	}
   public String travel() {
		return "Train from '" + origin + "' to ' " + destination + "' - "+ super.getDuration() + " hours.";
	}
	public String toString() {
		String data = "";
		for(int i =0;i<stops.length;i++) {
			data = (stops[i] + ",");
		}
		return super.toString() + " Stops: " + data;
	}
}
