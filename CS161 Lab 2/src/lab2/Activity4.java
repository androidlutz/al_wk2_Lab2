
//HEADER
//Program Name: Pass Fail
//Author: Andrew Lutz
//Class: CS161 winter 2020
//Date: 1/18/2020
//Description: A program which prints a message if the number intered in the console meets the given parameters.

package lab2;
import java.util.Scanner;


public class Activity4 {

	public static void main(String[] args) {

	
				//new scanner	
				Scanner number = new Scanner(System.in);
				
				//prompt to receive input from the user
				System.out.println("Please enter a number between 0 and 100");
				
				
				int i = (int) number.nextDouble();
				
				//if the number is out of bounds
				if(i > 100 || i < 0) {
					System.out.println("Please enter a number between 0 and 100");
					number.hasNextDouble();
				}					
					//If the number between 50 and 100 print Pass
				else if(i >= 50 && i <= 100) {
					System.out.println("Pass");
				}
			
				//If the number is less than 50 print fail
				else if(i >=0 && i<=49) {
					System.out.println("Fail");
			}
				
		}
				
	}


/*
 * Footer
 * 
 * Please enter a number between 0 and 100
   55
   Pass
   
   Please enter a number between 0 and 100
   30
   Fail

*/
