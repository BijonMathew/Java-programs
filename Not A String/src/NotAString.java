/*Bijon Mathew
 * 14 May 2017
 * 
 */
public class NotAString {

	final static String NOT = "not";

	public static String notAString(String str) {
		if (str.length() > 3) {
			String sub = str.substring(0, 3);
			if (sub.equals(NOT)) {
				return str;

			} else {
				String output = NOT + " " + str;
				return output;

			}

		} else {
			String output = NOT + " " + str;
			return output;
		}
	}

	public static void main(String[] args) {

		{

			// Test 1

			String str = "going to happen";
			String checking = notAString(str);
			if (checking.substring(0, 3).equals(NOT)) {
				System.out.println("Test passed! output is : " + checking);

			} else {
				System.out.println("Test Failed!");
			}

		}
		{
			// Test 2

			String str = "a";
			String checking = notAString(str);
			if (checking.substring(0, 3).equals(NOT)) {
				System.out.println("Test passed! output is : " + checking);

			} else {
				System.out.println("Test Failed!");
			}
		}
		{
			// Test 3
			String str = "not interested";
			String checking = notAString(str);
			if (checking.substring(0, 3).equals(NOT)) {
				System.out.println("Test passed! output is : " + checking);

			} else {
				System.out.println("Test Failed!");
			}

		}

	}

}
