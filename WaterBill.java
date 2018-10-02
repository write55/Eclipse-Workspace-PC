
public class WaterBill {

	// DECLARE CONSTANTS
	// Doubles used for all money values and ints for gallons for convenience
	public final static double HOME_SET_FEE = 5.00;
	public final static double HOME_PER_GALLON = .0005;
	public final static double COMMERCIAL_SET_FEE = 1000.00;
	public final static double COMMERCIAL_PER_GALLON = .00025;
	public final static double INDUSTRY_FEE1 = 1000.00;
	public final static double INDUSTRY_FEE2 = 2000.00;
	public final static double INDUSTRY_FEE3 = 3000.00;
	public final static int GALLONS_LIM1 = 4000000;
	public final static int GALLONS_LIM2 = 10000000;

	// PRIVATE DATA
	private int account = 0;
	private char code = ' ';
	private int gallons = 0;

	/*
	 * Constructor for a new "WaterBill" object, assigns arguments to private
	 * data, account ID then code then gallons for each new object
	 */
	public WaterBill(int a, char c, int g) {
		account = a;
		code = Character.toLowerCase(c);
		// Makes sure character code is always lowercase
		gallons = g;
	}

	// GETTERS

	// Getter for account ID
	public int getAccount() {
		return account;
	}

	// Getter for code
	public char getCode() {
		return code;
	}

	// Getter for number of gallons
	public int getGallons() {
		return gallons;
	}

	// SETTERS

	// Setter for account ID
	public void setAccount(int a) {
		account = a;
	}

	// Setter for code
	public void setCode(char c) {
		code = c;
	}

	// Setter for number of gallons
	public void setGallons(int g) {
		gallons = g;
	}

	/*
	 * Converts a "WaterBill" object to a string, printing out all three private
	 * data values, takes care of converting the code to a complete word as well
	 */
	public String toString() {
		return "Your account number is " + account + ", your usage type is " + code + "\n"
				+ "The amount of gallons used is " + gallons;
	}

	/*
	 * Takes a "WaterBill" object and calculates the tax, returns as double
	 */
	public double applyTax() {
		double tax = 0;
		if (getCode() == 'h') {
			tax += HOME_SET_FEE + HOME_PER_GALLON * getGallons();
		} else if (getCode() == 'c') {
			if (getGallons() > GALLONS_LIM1) {
				tax += COMMERCIAL_SET_FEE + (getGallons() - COMMERCIAL_SET_FEE) * COMMERCIAL_PER_GALLON;
			} else {
				tax += COMMERCIAL_SET_FEE;
			}
		} else {
			if (getGallons() < GALLONS_LIM1) {
				tax += INDUSTRY_FEE1;
			} else if (getGallons() > GALLONS_LIM1 && getGallons() < GALLONS_LIM2) {
				tax += INDUSTRY_FEE2;
			} else {
				tax += INDUSTRY_FEE3;
			}
		}
		return tax;
	}

	public static void main(String[] args) {

	}
}
