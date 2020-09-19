package chapter3;

import java.util.Scanner;

//Write a program that reads a floating-point number and prints “zero” if the number
//is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
//of the number is less than 1, or “large” if it exceeds 1,000,000.

public class P3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a floating-point number: ");
				
		if(in.hasNextFloat()){
			float number = in.nextFloat();
			if (number < 0) {				
				System.out.print("Number is negative");
				int f = (int)number;
				if(Math.abs(f) < 1) {
					System.out.print(" and the number is small");
				} else if(Math.abs(f) > 1000000){
					System.out.print(" and the number is large");
				}
			} else if(number == 0) {
				System.out.print("Number is zero");
			} else {
				System.out.print("Number is positive");
				int f = (int)number;
				if(Math.abs(f) < 1) {
					System.out.print(" and the number is small");
				} else if(Math.abs(f) > 1000000){
					System.out.print(" and the number is large");
				}
			}
		} else {
			System.out.print("Number is not an floating-point number");
		}
	}

}
