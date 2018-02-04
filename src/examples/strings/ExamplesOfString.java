package examples.strings;

import java.util.Scanner;

public class ExamplesOfString implements StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamplesOfString ex = new ExamplesOfString();
		String str = sc.nextLine();
		System.out.println("Actual string is ::>" + str);
		String manipulatedString= ex.manipulate(str);
		System.out.println("Reverse of string without temporary string ::>" + manipulatedString);
	}

	@Override
	public String manipulate(String str) {
		for(int index = 0; index < str.length(); index++) {
			str = str.substring(1, str.length() - index) + str.charAt(0) + str.substring(str.length() - index);
		}
		return str;
	}

}
