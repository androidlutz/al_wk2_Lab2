
//HEADER
//Program Name: Positive or Negative
//Author: Andrew Lutz
//Class: CS161 Winter 2020
//Date: 1/18/2020
//Description: A program which receives input from the user and prints if it is positive or negative. 

package lab2;
import java.util.Scanner;


public class Activity3 {

	public static void main(String[] args) {
		
		
		//new scanner	
		Scanner number = new Scanner(System.in);
		
		//prompt to receive input from the user
		System.out.println("Please enter a number");
		
		//receive input from the user
		int i = (int) number.nextDouble();
		
		//is the number greater than zero?
		if(i > 0) {
			System.out.println("Positive");
			
		}
		//is the number less than zero?
		else {
			System.out.println("Negative");
			
		}
		
	}

}

/*
 * Footer
Please enter a number
2.3
Positive

Please enter a number
-2
Negative

 * 
 */

