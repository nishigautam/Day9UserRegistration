package userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userMain {
	public static boolean isFirstName(String firstname) {
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern patt = Pattern.compile(regex);
		if(firstname == null) {
			return false;
		}
		Matcher match = patt.matcher(firstname);
		return match.matches();
	}
	public static boolean isLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern patt = Pattern.compile(regex);
		if(lastname == null) {
			return false;
		}
		Matcher match = patt.matcher(lastname);
		return match.matches();
	}
	public static boolean isEmailValid(String emailid) {
		String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
		Pattern patt = Pattern.compile(regex);
		if(emailid == null) {
			return false;
		}
		Matcher match = patt.matcher(emailid);
		return match.matches();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter firstname:");
		String firstname = input.nextLine();
		System.out.println("Enter lastname:");
		String lastname = input.nextLine();
		System.out.println("Enter Email-ID :");
		String emailid = input.nextLine();
		if(isFirstName(firstname) == true) {
			System.out.println("Firstname is Correct");
		}else {
			System.out.println("Firstname is Incorrect");
		}
		if(isLastName(lastname) == true) {
			System.out.println("Lastname is Correct");
		}else {
			System.out.println("Lastname is Incorrect");
		}
		if(isEmailValid(emailid) == true) {
			System.out.println("Email-ID is Correct");
		}else {
			System.out.println("Email-ID is Incorrect");
		}
	}
}
