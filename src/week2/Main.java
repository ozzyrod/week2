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
		if ( remainder == 1 ) {

			System.out.println( "The number is odd." );
			System.out.println( "Thanks!" );

		} else {

			System.out.println( "The number is even." );
			System.out.println( "Cool!" );

		}

		System.out.println( "That's all folks!" );

		/*
		 * Write a program that now gets a floating point number from the user that
		 * represents a grade and then prints out if the grade is an A, B, C, D, or F
		 *
		 * A = 100 - 85.0
		 * B = 84.9 - 70
		 * C = 69.9 - 60
		 * D = 59.9 - 50
		 * F is less than 50
		 */
		double grade;

		/*
		 * Get the first user variable.
		 */
		System.out.print( "Enter a number grade: " );
		grade = input.nextDouble();

		if ( grade >= 85 ) {

			System.out.println( "You got an A" );

		} else if ( grade >= 70 ) {

			System.out.println( "You got a B" );

		} else if ( grade >= 60 ) {

			System.out.print( "You got a C" );

		} else if ( grade >= 50 ) {

			System.out.print( "You got a D" );

		} else {

			System.out.print( "You got an F" );

		}
    }
}
