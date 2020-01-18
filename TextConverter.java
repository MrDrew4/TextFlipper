import java.util.Scanner;
public class TextConverter {

	/**
	 * 1337 - convert the string to leet-speak: Replace each L or l with a 1
	 * (numeral one) Replace each E or e with a 3 (numeral three) Replace each T or
	 * t with a 7 (numeral seven) Replace each O or o with a 0 (numeral zero)
	 * Replace each S or s with a $ (dollar sign)
	 * 
	 * @param current Original string
	 * @return string converted to leet-speak.
	 */
	public static String action1337(String current) {
		
		
		for (int i = 0; i < current.length(); i++) {
			if(current.charAt(i) == 'T') {
				current = current.replace("T", "7");
			}
			if(current.charAt(i) == 't') {
				current = current.replace("t", "7");
			}
			if(current.charAt(i)== 'e' ) {
				current = current.replace("e","3");
			}
			if(current.charAt(i) == 'E') {
				current = current.replace("E", "3");
			}
			if(current.charAt(i) == 'L') {
				current = current.replace("L", "1");
			}
			if(current.charAt(i) == 'l') {
				current = current.replace("l", "1");
			}
			if(current.charAt(i) == 'O') {
				current = current.replace("O", "0");
			}
			if(current.charAt(i) == 'o') {
				current = current.replace("o", "0");
			}
			if(current.charAt(i) == 'S') {
				current = current.replace("S", "$");
			}
			if(current.charAt(i) == 's') {
				current = current.replace("s", "$");
			}
		}
		
		
		return current; 
	}

	/**
	 * tests action1337 method with various cases to ensure it is working correctly.
	 */
	public static void testAction1337() {
		boolean error = false;

		String input1 = "LEeTs";
		String expected1 = "1337$";
		String result1 = action1337(input1);
		if (!result1.equals(expected1)) {
			error = true;
			System.out.println(
					"1) testAction1337 with input " + input1 + ", expected: " + expected1 + " but result:" + result1);
		}

		String input2 = "yeet";
		String expected2 = "y337";
		String result2 = action1337(input2);
		if (!result2.equals(expected2)) {
			error = true;
			System.out.println(
					"2) testAction1337 with input " + input2 + ", expected: " + expected2 + " but result:" + result2);
		}
		String input3 = "world";
		String expected3 = "w0r1d";
		String result3 = action1337(input3);
		if (!result3.equals(expected3)) {
			error = true;
			System.out.println(
					"3) testAction1337 with input " + input3 + ", expected: " + expected3 + " but result:" + result3);
		}

		if (error) {
			System.out.println("testAction1337 failed");
		} else {
			System.out.println("testAction1337 passed");
		}
	}

	public static String actionReverse(String current) {
		String theReverse = "";
		for(int i = current.length()-1; i >=0; i--) {
			theReverse += current.charAt(i);
		}	
		return theReverse; 
	}

	/**
	 * tests actionReverse method with various cases to ensure it is working
	 * correctly.
	 */
	public static void testActionReverse() {
		boolean error = false;

		String input1 = "Abc";
		String expected1 = "cbA";
		String result1 = actionReverse(input1);
		if (!result1.equals(expected1)) {
			error = true;
			System.out.println("1) testActionReverse with input " + input1 + ", expected: " + expected1 + " but result:"
					+ result1);
		}

		String input2 = "world";
		String expected2 = "dlrow";
		String result2 = actionReverse(input2);
		if (!result2.equals(expected2)) {
			error = true;
			System.out.println("2) testActionReverse with input " + input2 + ", expected: " + expected2 + " but result:"
					+ result2);
		}
		String input3 = "droo";
		String expected3 = "oord";
		String result3 = actionReverse(input3);
		if (!result3.equals(expected3)) {
			error = true;
			System.out.println("3) testActionReverse with input " + input3 + ", expected: " + expected3 + " but result:"
					+ result3);
		}
		if (error) {
			System.out.println("testActionReverse failed");
		} else {
			System.out.println("testActionReverse passed");
		}
	}

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//testAction1337(); //uncomment to run the tests
		//testActionReverse(); //uncomment to run the tests
		System.out.println("Welcome to the Text Converter.");
		System.out.println("Available Actions:");
		System.out.println("  1337) convert to 1337-speak");
		System.out.println("  rev) reverse the string");
		System.out.println("  quit) exit the program");
		System.out.println();
		
		System.out.print("Please enter a string: ");
		
		String theInput = scan.nextLine();
		System.out.print("Action (1337, rev, quit): ");
		
		String userInput = scan.nextLine();
		String theVar;
		
		while(!userInput.contains("quit")) {
			
			
			if(userInput.equals("rev")) {
				theVar = actionReverse(theInput);
				System.out.println(theVar);
				theInput = theVar;
			}
			else if (userInput.equals("1337")) {
				theVar =action1337(theInput);
				System.out.println(theVar);
				theInput = theVar;
			}
			else {
				
				System.out.println("Unrecognized action.");
				System.out.println(theInput);
			}
			
			System.out.print("Action (1337, rev, quit): ");
			userInput = scan.nextLine();
		}
		System.out.println("See you next time!");
	}
}
