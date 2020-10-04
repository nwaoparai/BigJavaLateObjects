package chapter4;

import java.util.Scanner;

public class P4_32 {

//	Credit Card Number Check. The last digit of a credit card number is the check
//	digit, which protects against transcription errors such as an error in a single digit or
//	switching two digits. The following method is used to verify actual credit card numbers
//	but, for simplicity, we will describe it for numbers with 8 digits instead of 16:
//	• Starting from the rightmost digit, form the sum of every other digit. For
//	example, if the credit card number is 4358 9795, then you form the sum
//	5 + 7 + 8 + 3 = 23.
//	• Double each of the digits that were not included in the preceding step. Add all
//	digits of the resulting numbers. For example, with the number given above,
//	doubling the digits, starting with the next-to-last one, yields 18 18 10 8. Adding
//	all digits in these values yields 1 + 8 + 1 + 8 + 1 + 0 + 8 = 27.
//	• Add the sums of the two preceding steps. If the last digit of the result is 0, the
//	number is valid. In our case, 23 + 27 = 50, so the number is valid.
//	Write a program that implements this algorithm. The user should supply an 8-digit
//	number, and you should print out whether the number is valid or not. If it is not
//	valid, you should print the value of the check digit that would make it valid.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);		
		System.out.print("Enter an 8 digit number: ");
		String num = a.next();
		
		int total = 0;
		int position = 1;
		int position2 = 0;
		int position3 = 0;
		String d = "";
		int total2 = 0;
		
		while(position < num.length()) {
			String b = Character.toString(num.charAt(position));
			total = total + Integer.parseInt(b);
			position = position + 2;
		}
		
		while(position2 < num.length()) {
			String b = Character.toString(num.charAt(position2));
			int c = Integer.parseInt(b) * 2;
			d = d + Integer.toString(c);
			position2 = position2 + 2;
		}
		
		while(position3 < d.length()) {
			String b = Character.toString(d.charAt(position3));
			total2 = total2 + Integer.parseInt(b);
			position3 = position3 + 1;
		}
		
		int finalTotal = total + total2;
		int mod = finalTotal % 10;
		int check = Integer.parseInt(Character.toString(num.charAt(7)));
		
		if(mod == 0) {
			System.out.println("The number is valid");
		} else {
			System.out.println("The number is not valid");
			int newCheck = check + (10 - mod);
			newCheck = newCheck % 10;
			System.out.println("Change the last digit to " + newCheck);
		}
		
	}

}
