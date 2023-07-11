// Java program to illustrate the
// skip() method of Scanner class in Java

import java.util.Scanner;
import java.util.regex.Pattern;

public class aVer {
	public static void main(String[] argv)
		throws Exception
	{

		String s = "GeeksForGeeks - "
				+ "A Computer Science Portal for Geeks";

		System.out.println("String trying to get input:\n"
						+ s);

		// create a new scanner with
		// the specified String Object
		Scanner scanner = new Scanner(s);

		// skip the word that
		// matches with the pattern ..eks
		System.out.println("Skipping 5 letter words"
						+ " that ends with 'eks'\n");

		scanner.skip(Pattern.compile("..eks"));

		// print a line of the scanner
		System.out.println("Input Scanner String: \n"
						+ scanner.nextLine());

		// close the scanner
		scanner.close();
	}
}
