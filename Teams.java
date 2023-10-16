/*
 *Teams.java
 *@author Victor Dior & Ata Turkoglu
 *31/1/23
 */

 import java.util.Scanner;//import statement to allow us to use Scanner class
 public class Teams{
	 public static void main(String args[]){
		 //declare variables
		 int numStudents, numTeams;

		 //declare objects
		 Scanner keyboard;

		 //create objects
		 keyboard = new Scanner(System.in);

		 //input
		 System.out.print("Please enter a number of students: ");
		 numStudents = keyboard.nextInt();

		 //process
		 numTeams = numStudents/5;

		 //output
		 System.out.println("The number of groups of 5 you could make is "+numTeams);
	 }
 }