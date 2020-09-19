package chapter3;

//Write a program that reads an integer and prints whether it is negative, zero, or
//positive.

import java.util.Scanner;

public class P3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
				
		if(in.hasNextInt()){
			int number = in.nextInt();
			if (number < 0) {
				System.out.print("Number is negative");
			} else if(number == 0) {
				System.out.print("Number is zero");
			} else {
				System.out.print("Number is positive");
			}
		} else {
			System.out.print("Number is not an integer");
		}
	}

}
