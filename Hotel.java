/*
 *Hotel.java
 *@author Victor Dior & Ata Turkoglu
 *31/1/23
 */

import java.util.Scanner;//import statement to allow us to use Scanner class
public class Hotel{
    public static void main(String args[]){
        //declare variables
        int numNights, numPeople, price;

        //declare objects
        Scanner keyboard;

        //create objects
        keyboard = new Scanner(System.in);

        //input
        System.out.print("Write the number of nights you want to stay: ");
        numNights = keyboard.nextInt();

        System.out.print("write how many people will stay: ");
        numPeople = keyboard.nextInt();
         
        //process
		price = numPeople*60*numNights;

        //output
		System.out.println("The price is "+price+" euro ");
	 }
 }