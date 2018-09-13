
// Aaron Wu

import java.util.Scanner;

public class FancyISBNProgram {

	public static void main(String[] args) {

		// GET INPUT

		Scanner in = new Scanner(System.in);
		String ISBNorig = "";

		try {
			System.out.println("Enter ISBN Number");
			ISBNorig = in.nextLine();
			if (ISBNorig.length() != 13) {
				System.out.println("Try again, program will now terminate");
				System.exit(1);
			}
		} catch (Exception e) {
			System.out.println("Try again, program will now terminate");
			System.exit(1);
		}

		in.close();

		// REMOVE DASHES

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

		// MULTIPLY VALUES
		int check = 0, value;

		for (int i = 0; i < 9; i++) {
			value = (int) (ISBN.charAt(0 + i) - '0') * (10 - i);
			check += value;
		}

		check = 10 - ((check - 1) % 11);
		char givencheck = ISBNorig.charAt(12);

		// PRINT STUFF
		System.out.println("ISBN Number: " + ISBNorig);

		if (givencheck == 'X') {
			System.out.println("Check digit from number: " + givencheck + " (10)");
			System.out.println("Check digit from calculations: X (" + check + ")");
		} else {
			System.out.println("Check digit from number: " + givencheck);
			System.out.println("Check digit from calculations: " + check);
		}

		if (check == (ISBNorig.charAt(12) - '0')) {
			System.out.println("Check digit is correct, proceed");
		} else {
			System.out.println("Check digit is incorrect, try again");
		}

	}

}
