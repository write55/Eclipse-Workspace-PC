// Aaron Wu
// 9/28/18

public class Javaland {

	// DECLARE CONSTANTS
	public final static double PERCENT1 = .01;
	public final static double PERCENT2 = .05;
	public final static double PERCENT3 = .1;
	public final static int LIVINGFEE = 500;
	public final static int LIVINGLIMIT = 1000;
	public final static int LIM1 = 10000;
	public final static int LIM2 = 30000;

	// PRIVATE DATA
	private int income = 0;

	// Constructor for a new "Javaland" object, assigns argument to object
	public Javaland(int i) {
		income = i;
	}

	// Getter for Javaland current value
	public int getIncome() {
		return income;
	}

	// Setter for changing value of existing "Javaland" object
	public void setIncome(int i) {
		income = i;
	}
	
	// Changes Javaland object to string for output
	public String toString() {
		return "Income is " + getIncome();
	}
	
	public static void main (String[] args) {
		
	}
}
