// In The Name Of Allah
// Porpuse : Calculator On Two Integer
// Programmer : Ali Salimi
// Date : 1395/8/30

import java.util.Scanner;

public class CalculatorOn2Int
{
	public static void main( String[] args )
	{
		// Declaration Of Variables
		Scanner input = new Scanner( System.in ); // for recieving inputs
		int c; // choice of user
		int x, y; // operands
		int result; // result of calculation

		// Head
		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculator On Two Integer\n\n" );

		// Menu
		System.out.printf( "__________%s__________\n\n", "MENU" );
		System.out.printf( "%s\n%s\n\n",
					" O   O",
					"\\_____/" );
		System.out.printf( "%s\n%s\n%s\n%s\n%s\n%s\n\n",
					"1. Addition",
					"2. Subtraction",
					"3. Multipliction",
					"4. Division",
					"5. Remainder",
					"6. Comparision" );
		System.out.print( "Please enter your choice : " );
		c = input.nextInt();
		System.out.println();

		// Calculations

		// Addition
		if ( c == 1 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "ADDITION" );
			System.out.printf( "%s\n%s\n%s\n%s\n%s\n\n",
						"    +",
						"    +",
						"+ + + + +",
						"    +",
						"    +" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "+ " );
			y = input.nextInt();

			// calculating result
			result = x + y;

			// displaying result
			System.out.printf( "  ___________\n  %d\n", result );
		}

		// Subtraction
		if ( c == 2 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "SUBTRACTION" );
			System.out.printf( "%s\n\n", "- - - - -" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "- " );
			y = input.nextInt();

			// calculating result
			result = x - y;

			// displaying result
			System.out.printf( "  ___________\n  %d\n", result );
		}

		// Multipliction
		if ( c == 3 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "MULTIPLICTION" );
			System.out.printf( "%s\n%s\n%s\n%s\n%s\n\n",
						"*       *",
						"  *   *",
						"    *",
						"  *   *",
						"*       *" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "* " );
			y = input.nextInt();

			// calculating result
			result = x * y;

			// displaying result
			System.out.printf( "  ___________\n  %d\n", result );
		}

		// Division
		if ( c == 4 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "DIVISION" );
			System.out.printf( "%s\n%s\n%s\n%s\n%s\n\n",
						"    O",
						"",
						"- - - - -",
						"",
						"    O" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "/ " );
			y = input.nextInt();

			// calculating result
			result = x / y;

			// displaying result
			System.out.printf( "  ___________\n  %d\n", result );
		}

		// Remainder
		if ( c == 5 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "REMAINDER" );
			System.out.printf( "%s\n%s\n%s\n%s\n%s\n\n",
						"O       %",
						"      %",
						"    %",
						"  %    ",
						"%       O" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "% " );
			y = input.nextInt();

			// calculating result
			result = x % y;

			// displaying result
			System.out.printf( "  ___________\n  %d\n", result );
		}

		// Comparision
		if ( c == 6 )
		{
			// head
			System.out.printf( "__________%s__________\n\n", "COMPARISION" );
			System.out.printf( "%s\n%s\n%s\n%s\n%s\n\n",
						">                      <",
						"  >     = = = =      <",
						"    >              <",
						"  >     = = = =      <",
						">                      <" );

			// recieving inputs
			System.out.println( "Please enter two integer in order :\n" );
			System.out.print( "  " );
			x = input.nextInt();
			System.out.print( "? " );
			y = input.nextInt();

			// displaying result
			System.out.println( "  __________________________" );
			if ( x > y )
				System.out.printf( "  %d > %d\n", x, y );
			if ( y > x )
				System.out.printf( "  %d < %d\n", x, y );
			if ( y == x )
				System.out.printf( "  %d = %d\n", x, y );
		}

		// Incorrect Choice
		if ( c < 1 )
		{
			System.out.printf( "__________%s__________\n\n", "INCORRECT CHOICE" );
			System.out.printf( "%s\n%s\n\n",
						" O   O",
						"_______" );
			System.out.println(  "Sorry, your choice is incorrect.\n" );
		}
		if ( c > 6 )
		{
			System.out.printf( "__________%s__________\n\n", "INCORRECT CHOICE" );
			System.out.printf( "%s\n%s\n\n",
						" O   O",
						"_______" );
			System.out.println(  "Sorry, your choice is incorrect.\n" );
		}

		// End
		System.out.println( "\n\nGood Luck\n\n" );
	}
}