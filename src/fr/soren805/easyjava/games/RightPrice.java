package fr.soren805.easyjava.games;

import java.util.Random;
import java.util.Scanner;

public class RightPrice {
	
	@SuppressWarnings("resource")
	public void startDefaultGame() {
		Random r = new Random();
		
		int rightprice = r.nextInt(200);
		int price = 0;
		int trys = 0;
		
		while(rightprice != price) {
			System.out.println("Enter a number between 0 and 200 :");
			Scanner scan = new Scanner(System.in);
			
			if(rightprice > price) {
				System.out.println("Its more!");
			}else {
				System.out.println("Its less!");
			}
			
			price = scan.nextInt();
			trys++;
		}
		
		System.out.println("Congratulations! The right price was : " + rightprice + "\nYou've did " + trys + " trys.");
	}
	
	@SuppressWarnings("resource")
	public void startGame(Integer number) {
		Random r = new Random();
		
		int rightprice = r.nextInt(number);
		int price = 0;
		int trys = 0;
		
		while(rightprice != price) {
			System.out.println("Enter a number between 0 and " + number + " :");
			Scanner scan = new Scanner(System.in);
			
			if(rightprice > price) {
				System.out.println("Its more!");
			}else {
				System.out.println("Its less!");
			}
			
			price = scan.nextInt();
			trys++;
		}
		
		System.out.println("Congratulations! The right price was : " + rightprice + "\nYou've did " + trys + " trys.");
	}

}
