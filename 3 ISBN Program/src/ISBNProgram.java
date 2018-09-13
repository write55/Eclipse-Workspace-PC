
// Aaron Wu

public class ISBNProgram {
	public static void main(String[] args) {

		// Remove Dashes
		String ISBNorig = "0-393-96945-2";

		int loc1 = ISBNorig.indexOf("-");
		int loc2 = ISBNorig.indexOf("-", loc1 + 1);
		int loc3 = ISBNorig.indexOf("-", loc2 + 1);
		// System.out.println(loc1);
		// System.out.println(loc2);
		// System.out.println(loc3);

		String ISBNtemp1 = ISBNorig.substring(0, loc1);
		String ISBNtemp2 = ISBNorig.substring(loc1 + 1, loc2);
		String ISBNtemp3 = ISBNorig.substring(loc2 + 1, loc3);
		String ISBNtemp4 = ISBNorig.substring(loc3 + 1);
		// System.out.println(ISBNtemp1);
		// System.out.println(ISBNtemp2);
		// System.out.println(ISBNtemp3);
		// System.out.println(ISBNtemp4);

		String ISBN = ISBNtemp1 + ISBNtemp2 + ISBNtemp3 + ISBNtemp4;
		// System.out.println(ISBN);

		// Multiply values

		int zero, one, two, three, four, five, six, seven, eight, check;

		zero = (int) (ISBN.charAt(0) - '0') * 10;
		one = (int) (ISBN.charAt(1) - '0') * 9;
		two = (int) (ISBN.charAt(2) - '0') * 8;
		three = (int) (ISBN.charAt(3) - '0') * 7;
		four = (int) (ISBN.charAt(4) - '0') * 6;
		five = (int) (ISBN.charAt(5) - '0') * 5;
		six = (int) (ISBN.charAt(6) - '0') * 4;
		seven = (int) (ISBN.charAt(7) - '0') * 3;
		eight = (int) (ISBN.charAt(8) - '0') * 2;

		check = zero + one + two + three + four + five + six + seven + eight;
		// System.out.println("Initial check value = " + check);

		check = 10 - ((check - 1) % 11);
		char givencheck = ISBNorig.charAt(12);

		System.out.println("ISBN Number: " + ISBNorig);

		if (givencheck == 'X') {
			System.out.println("Check digit from number: " + givencheck + " (10)");
			System.out.println("Check digit from calculations: X (" + check + ")");
		} else {
			System.out.println("Check digit from number: " + givencheck);
			System.out.println("Check digit from calculations: " + check);
		}

	}

}
