package edu.monmouth.problemSet3;
import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.Color;

public class ProblemSet3 {

	public static void main(String[] args) {
		
		//Creating a CampusVehicle object using the default construtor
		CampusVehicle vehicle1 = new CampusVehicle();
		
		// Retrieving and printing all the attributes of the object
		System.out.println("Vehicle 1:");
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Vehicle is available: " + vehicle1.isAvailable());
		System.out.println("Color: " + vehicle1.getColor());
		System.out.println();

		// Setting the objects attributes to valid values using the mutators
		vehicle1.setAvailable(false);
		vehicle1.setId("MU1390433");
		vehicle1.setLocation("Library");
		vehicle1.setColor(Color.BLUE);
		
		// Retrieving and printing all the updated values of the vehicle1 object
		System.out.println("Updated Vehicle 1:");
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Vehicle is available: " + vehicle1.isAvailable());
		System.out.println("Color: " + vehicle1.getColor());
		System.out.println();
		
		
		// Creating another object using the constructor that takes valid parameters for all attributes
		CampusVehicle vehicle2 = new CampusVehicle("MU12345678910", "University Bluffs", true, Color.WHITE);
		
		// Retrieving and printing all the attributes of the vehicle2 object
		System.out.println("Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println("Color: " + vehicle2.getColor());
		System.out.println();
	
		// Changing vehicle2's color to red
		vehicle2.setColor(Color.RED);
		
		// Retrieving and printing all the updated attributes of the vehicle2 object
		System.out.println("Updated Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println("Color: " + vehicle2.getColor());
		System.out.println();
		
		// Creating a vehicle with the second constructor, color should be UNKNOWN
		// also testing what happens if id is lower case.
		CampusVehicle vehicle3 = new CampusVehicle("mu131415161719", "UNIVERSITY BLUFFS", true);
		
		// Retrieving and printing all the values of vehicle 3
		System.out.println("Vehicle 3:");
		System.out.println("ID: " + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Vehicle is available: " + vehicle3.isAvailable());
		System.out.println("Color: " + vehicle3.getColor());
		System.out.println();
		
		// Creating a vehicle with a vehicle with illegal values for id and location
		CampusVehicle vehicle4 = new CampusVehicle("helloMU121231314", "libraRy2", false, Color.YELLOW);
		
		System.out.println("Vehicle 4:");
		System.out.println("ID: " + vehicle4.getId());
		System.out.println("Location: " + vehicle4.getLocation());
		System.out.println("Vehicle is available: " + vehicle4.isAvailable());
		System.out.println("Color: " + vehicle4.getColor());
		System.out.println();
		
	
	
	}
	

}
