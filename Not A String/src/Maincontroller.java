import java.util.Scanner;

/*Bijon Mathew
 * 14 May 2017
 */

public class Maincontroller {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		in.close();
		String checking = NotAString.notAString(str);
		System.out.println(checking);
	}
}
