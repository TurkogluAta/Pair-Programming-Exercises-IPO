/*
 *TimesTables.java
 *@author Victor Dior & Ata Turkoglu
 *31/1/23
 */

 import java.util.Scanner;//import statement to allow us to use Scanner class
 public class TimesTables{
    public static void main(String args[]){
        //declare variables
        int num;

         //declare objects
         Scanner keyboard;

        //create objects
        keyboard = new Scanner(System.in);

        //input
        System.out.print("Write a number: ");
        num = keyboard.nextInt();

        //Process and output
        System.out.println("0 times "+num+" is "+(0*num));
        System.out.println("1 times "+num+" is "+(1*num));
        System.out.println("2 times "+num+" is "+(2*num));
        System.out.println("3 times "+num+" is "+(3*num));
        System.out.println("4 times "+num+" is "+(4*num));
        System.out.println("5 times "+num+" is "+(5*num));
        System.out.println("6 times "+num+" is "+(6*num));
        System.out.println("7 times "+num+" is "+(7*num));
        System.out.println("8 times "+num+" is "+(8*num));
        System.out.println("9 times "+num+" is "+(9*num));
        System.out.println("10 times "+num+" is "+(10*num));
        System.out.println("11 times "+num+" is "+(11*num));
        System.out.println("12 times "+num+" is "+(12*num));
    }
 }