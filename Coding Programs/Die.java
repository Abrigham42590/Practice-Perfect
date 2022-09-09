import java.util.Random;
public class Die {
	
	private int userdie;
	private int computerdie;
	private int sides;

	public Die(int numSides ) {
		sides = numSides;
		userroll();
		computerroll();
		
	}
	
	public int getrandomuservalue() {
		return userdie;
	}
	
	public int getrandomcomputervalue2() {;
		return computerdie;
	}
	
	public int getSides() {
		return sides;
	}
	
	public void  userroll() {
		Random roll = new Random();
		userdie = roll.nextInt(sides) + 1;
	}
	
	public void computerroll() {
		Random roll = new Random();
		computerdie = roll.nextInt(sides) + 1;
	}
	

}
