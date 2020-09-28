package chapter3;

import java.util.Scanner;

//Write a program that reads in the name and salary of an employee. Here the salary
//will denote an hourly wage, such as $9.25. Then ask how many hours the employee
//worked in the past week. Be sure to accept fractional hours. Compute the pay. Any
//overtime work (over 40 hours per week) is paid at 150 percent of the regular wage.
//Print a paycheck for the employee.


public class P3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter total number of hours worked : ");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		
		Double hours = Double.parseDouble(b);		
		
		if (hours <= 40) {
			Double totalPay = hours * 9.25;
			System.out.println("Total pay is : $" + totalPay);
		} else{
			Double extraHours = hours - 40;
			Double totalPay = (hours * 9.25) + (extraHours * 9.25 * 1.5);
			System.out.println("Total pay is : $" + totalPay);
		}
	}

}
