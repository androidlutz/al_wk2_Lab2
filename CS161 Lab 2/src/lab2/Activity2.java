/*
 * Header
 * Program name: NAND
 * Author: Andrew Lutz
 * Class: CS 161 winter 2020
 * Date:1/16/2020
 * Description: A program which creates a boolean table expressing the nand gate
 */



package lab2;

public class Activity2 {

	public static void main(String[] args) {

	boolean[] nand = {false, true};
		for(boolean a : nand) {
			for(boolean b : nand) {
				boolean c = a ^ b;
				System.out.println(a+ " " + b + " " + c);
			}
		}

		
	}

}

/*
Footer
false false false
false true true
true false true
true true false

*/