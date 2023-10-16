/*
 *Shop.java
 *@author Victor Dior & Ata Turkoglu
 *31/1/23
 */

import java.util.Scanner;
public class Shop{
	public static void main(String args[]){

	//declare variables to hold integers
	double sweets, drink, crisps, sum, sweetcost, drinkcost;

	//declare objects
	Scanner keyboard;
		
    //create objects
	keyboard = new Scanner(System.in);
			
    //input
    System.out.print("how many sweets: ");
	sweets = keyboard.nextInt();
	System.out.print("how many drinks: ");
	drink = keyboard.nextInt();
	System.out.print("how many crisps: ");
	crisps = keyboard.nextInt();

	sweetcost = sweets*0.50;
	drinkcost = drink*2;

	//process
	sum = drinkcost + crisps +sweetcost;

	//output
	 System.out.println("The cost would be "+sum+" euro ");
	}
}