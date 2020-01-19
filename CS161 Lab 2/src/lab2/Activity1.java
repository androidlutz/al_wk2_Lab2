/*
 //HEADER
//Program Name: Activity1
//Author: Andrew Lutz
//Class: CS161 
//Date: 1/16/2020
//Description: A 

 */

package lab2;
import java.lang.Math; 

public class Activity1 {

	public static void main(String[] args) {
		
		value(.01f);
		
	}
	
		public static void value(float f1) {
			
		//compare to see if f2 is zero
		if(f1== 0) {
			System.out.println("zero");
			
		}
		//compare to see if f2 is less than zero
		if(Math.abs(f1) < 0) {
			System.out.println("small negative");
			
		}
		//compare to see if f2 is greater than zero
		if(Math.abs(f1) > 0 && Math.abs(f1) < 1000000) {
			System.out.println("positive");
			
		}
		if(Math.abs(f1) > 1000000) {
			System.out.println("large positive");
		}
		
		}
   }

/*
 * Footer
 * 
 * value(10);
 * positive
 * 
 * value(-5)
 * negative
 * 
 * value(1000001)
 * large positive
 * */

 

