package chapter4;

import java.util.Scanner;

public class P4_30 {

//	Write an application to pre-sell a limited number of cinema tickets. Each buyer can
//	buy as many as 4 tickets. No more than 100 tickets can be sold. Implement a program
//	called TicketSeller that prompts the user for the desired number of tickets and
//	then displays the number of remaining tickets. Repeat until all tickets have been
//	sold, and then display the total number of buyers.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		int remaining = 100;
		
		while(remaining > 0) {
			Scanner a = new Scanner(System.in);		
			System.out.print("Enter number of tickets to buy (not more than 4): ");
			String num = a.next();
			
			if(Integer.parseInt(num) > 4) {
				System.out.println("Not more than 4 tickets please");
			} else {
			
				remaining = remaining - Integer.parseInt(num);
				count = count + 1;
				System.out.println("Tickets remaining is: " + remaining);
			}
		}
	}

}
