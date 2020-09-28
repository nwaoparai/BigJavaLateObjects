package chapter4;

import java.util.Scanner;

//Write a program that reads a word and prints each character of the word on a separate
//line. For example, if the user provides the input "Harry", the program prints
//H
//a
//r
//r
//y

public class P4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);		
		System.out.print("Enter a word: ");
		String word = a.next();
		
		int number = 0;
		while (number < word.length()) {
			System.out.println(word.charAt(number));
			number = number + 1;
		}
	}

}
