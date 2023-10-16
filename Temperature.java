/*
 *Temperature.java
 *@author Victor Dior & Ata Turkoglu
 *31/1/23
 */

 import java.util.Scanner;//import statement to allow us to use Scanner class
 public class Temperature{
    public static void main(String args[]){
        //declare variables
        double celsius, fahrenheit;

        //declare objects
        Scanner keyboard;

        //create objects
        keyboard = new Scanner(System.in);

        //input
        System.out.print("Write a number for celsius: ");
        celsius = keyboard.nextDouble();

        //Process
        fahrenheit = celsius*1.8+32;

        //Output
        System.out.println("In fahrenheit "+fahrenheit);
    }
 }