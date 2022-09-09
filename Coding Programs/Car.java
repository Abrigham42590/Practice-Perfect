public class Car {
	
	private int yearModel;
	private String make;
	private int speed;
	
	

	public Car(int year, String manufacturer, int milesperhour) {
		setYear(year);
		setMake(manufacturer);
		setSpeed(milesperhour);
		
	}
	
	public int getAccelerate() {
		return speed + 5; 
	}
	
	public int getBrake() {
		return speed - 5;
	}
	
	public String getmake() {
		return make; 
	}
	
	public int getyearModel() {
		return yearModel;
	}
	
	public void setMake(String Make) {
		make = Make; 
	}
	
	public void setYear(int Year) {
		yearModel = Year;
	}
	
	public void setSpeed(int MPH) {
		speed = MPH;
	}

}
