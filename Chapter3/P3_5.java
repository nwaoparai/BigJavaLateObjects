package chapter3;

import java.util.Scanner;

//Write a program that reads three numbers and prints “increasing” if they are in
//increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise.
//Here, “increasing” means “strictly increasing”, with each value larger than its
//predecessor.
//The sequence 3 4 4 would not be considered increasing.

public class P3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);		
		System.out.print("Enter first number: ");
		String first = a.next();
		
		Scanner b = new Scanner(System.in);		
		System.out.print("Enter second number: ");
		String second = b.next();
		
		Scanner c = new Scanner(System.in);		
		System.out.print("Enter third number: ");
		String third = c.next();

		
		if(Integer.parseInt(first) > Integer.parseInt(second) && Integer.parseInt(second) > Integer.parseInt(third)) {
			System.out.print("DECREASING");
		} else if(Integer.parseInt(first) < Integer.parseInt(second) && Integer.parseInt(second) < Integer.parseInt(third)) {
			System.out.print("INCREASING");
		}
	}

}
