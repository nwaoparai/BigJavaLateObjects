package chapter3;

import java.util.Scanner;

//Write a program that asks the user to enter a month (1 for January, 2 for February,
//and so on) and then prints the number of days in the month. For February, print “28
//or 29 days”.
//	Enter a month: 5
//	30 days
//Do not use a separate if/else branch for each month. Use Boolean operators.

public class P3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);		
		System.out.print("Enter a month: ");
		String month = a.next();
		
		if(Integer.parseInt(month) == 1 || Integer.parseInt(month) == 3 || Integer.parseInt(month) == 5 || Integer.parseInt(month) == 7 
				|| Integer.parseInt(month) == 8 || Integer.parseInt(month) == 10) {
			System.out.print("31 days");
		} else if (Integer.parseInt(month) == 4 || Integer.parseInt(month) == 6 || Integer.parseInt(month) == 9 || Integer.parseInt(month) == 11){
			System.out.print("30 days");
		} else if (Integer.parseInt(month) == 2){
			System.out.print("29 days");
		} else {
			System.out.print("Invalid month");
		}
		
	}

}
