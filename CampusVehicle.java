package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private Color color;
	private final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private final Color DEFAULT_COLOR = Color.UNKNOWN;
	private final boolean DEFAULT_AVAILABLE=true;
	private final int UPPER_ID_LIMIT = 18;
	private final int LOWER_ID_LIMIT = 6;
	
	public CampusVehicle() {
		setId(DEFAULT_ID);
		setLocation(DEFAULT_LOCATION);
		setAvailable(DEFAULT_AVAILABLE);
		setColor(DEFAULT_COLOR);
	
	}
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(DEFAULT_COLOR);
	}
	
	// Using delegation by calling the three parameter constructor and then setting the color
	public CampusVehicle(String id, String location, boolean available, Color color) {
		this(id, location, available);
		setColor(color);
	}
	public String getId() {
		return id;
	}
	// Updated setId method based on what is said in point 2
	public void setId(String id) {
		if ((id != null) && (id.equals("") == false) && (id.length()>= LOWER_ID_LIMIT)
				&& (id.length() <= UPPER_ID_LIMIT) && (id.substring(0,2).equalsIgnoreCase("mu"))) {
		this.id = id.toLowerCase();
		}
		else {
			this.id = "UNKNOWN"; // Point number 3
		}
	}
	public String getLocation() {
		return location;
	}
	// Updated setLocation based on what is said in point 4 and point 7
	public void setLocation(String location) {
		if ((location != null) && (location.equals("") == false) && ((location.toLowerCase().equals( "library"))
				|| (location.toLowerCase().equals( "university bluffs")) ||
				(location.toLowerCase().equals( "parking lot")) || (location.toLowerCase().equals("spruce hall"))
				|| (location.toLowerCase().equals( "laurel hall")))){
			this.location = location.toLowerCase();
				}
		else {
			this.location = "UNKNOWN"; // point 5
		}
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	// Updated method based on point 6
	public void checkOut() {
		if (this.available == true){
		available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}
	
	// The mutator method for the color variable
	public void setColor(Color color) {
		this.color = color;
	}
	
	// The accessor method for the color variable
	public Color getColor() {
		return color;
	}

}
