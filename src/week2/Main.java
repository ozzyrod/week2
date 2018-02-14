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
		 * In general, an expression that follows the "if" when coded properly will only result in a value of true
		 * or false.
		 * This is called a "conditional expression".
		 *
		 * Relational operators ">", ">=", "<", "<=", "!=", and "==" for a total of 6 relational operators.
		 */
		if ( 1 == remainder ) {
			System.out.println( "The number is odd." );
			System.out.println( "Thanks!" );
		} else {
			System.out.println( "The number is even." );
			System.out.println( "Cool!" );
		}

		System.out.print( "That's all folks!" );
    }
}
