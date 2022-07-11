public class TheParkingTicket {
	
	private TheParkedCar illegal;
	private ThePoliceOfficer illegal2;
	private double fine;

	public TheParkingTicket(TheParkedCar illegal1, ThePoliceOfficer illegal3, double fine1) {
		illegal = new TheParkedCar(illegal1);
		fine = fine1;
		illegal2 = new ThePoliceOfficer(illegal3);
	}
	
	public double getfine() {
		return fine;
	}
	
	public TheParkedCar getTheParkedCar() {
		return new TheParkedCar(illegal);
	}
	
	public ThePoliceOfficer getThePoliceOfficer() {
		return new ThePoliceOfficer(illegal2);
	}
	
	public String toString() {
		
		String str = "\n" + "Ticket data: " + "\n" + illegal + "\n" +
		illegal2 + "\nFine: " + fine + "\n";
		
		
		return str;
	}

}