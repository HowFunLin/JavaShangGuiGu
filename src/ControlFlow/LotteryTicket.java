package ControlFlow;

import java.util.Scanner;

public class LotteryTicket
{
	public static void main(String[] args)
	{
		int ticket = (int)(Math.random() * 90 + 10);
		
		System.out.print("Please enter your ticket: ");
		Scanner scan = new Scanner(System.in);
		int buy = scan.nextInt();
		
		if(buy < 10 || buy >99) 
		{
			System.out.println("Wrong Ticket number!");
			System.exit(0);
		}
		
		String ticketStr = String.valueOf(ticket);
		String buyStr = String.valueOf(buy);
		
		System.out.println("The lottery ticket is " + ticket);
		
		if(ticket == buy) System.out.println("You have won $10000!");
		else if(ticketStr.charAt(0) == buyStr.charAt(1) && ticketStr.charAt(1) == buyStr.charAt(0)) System.out.println("You have won $3000!");
		else if(ticketStr.charAt(0) == buyStr.charAt(0) || ticketStr.charAt(1) == buyStr.charAt(1)) System.out.println("You have won $1000!");
		else if(ticketStr.charAt(0) == buyStr.charAt(0) || ticketStr.charAt(0) == buyStr.charAt(1) || ticketStr.charAt(1) == buyStr.charAt(0) || ticketStr.charAt(1) == buyStr.charAt(1)) System.out.println("You have won $500!");
		else System.out.println("Your ticket is invalid.");
		
		scan.close();
	}
}
