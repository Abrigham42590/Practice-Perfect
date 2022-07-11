public class TheParkedCar {
	
	private String make;
	private String model;
	private String color;
	private String licensenumber;
	private String numberofminutes;
	
	
	public TheParkedCar(String cmake, String cmodel, String ccolor, String cln, String nom) {
		make = cmake;
		model = cmodel;
		color = ccolor;
		licensenumber = cln;
		numberofminutes = nom;
	}
	
	public TheParkedCar(TheParkedCar object2) {
		make = object2.make;
		model = object2.model;
		color = object2.color;
		licensenumber = object2.licensenumber;
		numberofminutes = object2.numberofminutes;
	}
	
	public void set(String cmake, String cmodel, String ccolor, String cln, String nom) {
	    make = cmake;
		model = cmodel;
		color = ccolor;
		licensenumber = cln;
		numberofminutes = nom;
	}
	
	public String toString() {
		
		String str = "\n" + "Make: " + make +"\n" +
		"\nModel: " + model + "\n" +
		"\nColor: " + color + "\n" +
		"\nLiscense Number: " + licensenumber + "\n";
		
		return str;
	}

}
