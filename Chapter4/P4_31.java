package chapter4;

import java.util.Scanner;

public class P4_31 {

//	You need to control the number of people who can be in an oyster bar at the same
//	time. Groups of people can always leave the bar, but a group cannot enter the bar
//	if they would make the number of people in the bar exceed the maximum of 100
//	occupants. Write a program that reads the sizes of the groups that arrive or depart.
//	Use negative numbers for departures. After each input, display the current number
//	of occupants. As soon as the bar holds the maximum number of people, report that
//	the bar is full and exit the program.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		int remaining = 100;
		
		while(remaining > 0) {
			Scanner a = new Scanner(System.in);		
			System.out.print("Enter number of people: ");
			String num = a.next();
			
			remaining = remaining - Integer.parseInt(num);
			if(remaining < 0) {
				System.out.println();
				System.out.println("You have exceeded the number of remaining seats");
				remaining = remaining + Integer.parseInt(num);
			}
			System.out.print("Number of occupants is: " + (100 - remaining));
			System.out.println();
		}
	}

}
