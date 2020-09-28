package chapter4;

import java.util.Scanner;

//Prime numbers. Write a program that prompts the user for an integer and then prints
//out all prime numbers up to that integer. For example, when the user enters 20, the
//program should print
//	2
//	3
//	5
//	7
//	11
//	13
//	17
//	19
//Recall that a number is a prime number if it is not divisible by any number except 1
//and itself.


public class P4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);		
		System.out.print("Enter a number above 2: ");
		String num = a.next();
		int count = 0;
		
		int number = Integer.parseInt(num);
		boolean prime = false;
		int k = 3;
		while(k <= number) {
			for(int i = 2; i < k; i++) {
				if (k % i == 0) {
					count = count + 1;
				}
			}
			if(k < 4) {
				System.out.println(2);
			}
			
			if (count == 0) {
				System.out.println(k);
			}
			count = 0;
			k = k + 1;
		}
		
		
	}

}
