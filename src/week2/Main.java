/*
 *
 * Project: Week2
 * Author:  Osbardo Rodriguez
 * Date:    2/13/18
 */
package week2;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Week1_exercise.
 */
public class Main {

	/**
	 * @param args command line arguments
	 */
	public static void main( String[] args ) {

		/*
		 * Instantiate the Scanner.
		 */
		Scanner input = new Scanner( System.in );

		/*
		 * Declare the all of the variables used in the class.
		 */
		int userVar1;
		int remainder;

		/*
		 * Get the first user variable.
		 */
		System.out.print( "Please enter the first number: " );
		userVar1 = input.nextInt();

		/*
		 * Check the remainder of the number
		 */
		remainder = userVar1 % 2;

		/*
		 * In general, an expreesion that follows the "if" when coded properly will only result in a value of true
		 * or false.
		 * This is called a "conditional expression".
		 */
		if ( 0 == remainder ) { // When comparing two values, use '=='
			System.out.print( "The number is even." );
		} else {
			System.out.print( "The number is odd." );
		}
    }
}
