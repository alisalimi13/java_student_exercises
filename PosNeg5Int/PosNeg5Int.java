// In The Name Of Allah
// Porpuse : Finding Posetive, Negetive And Zero Numbers In Five Integer
// Programmer : Ali Salimi
// Date : 1395/8/29

import java.util.Scanner;

public class PosNeg5Int
{
	public static void main( String[] args )
	{
		// Declaration Of Variables
		Scanner input = new Scanner( System.in );
		int a, b, c, d, e;

		// Head
		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Finding Posetive, Negetive And Zero Numbers In Five Integer\n\n" );

		// Recieving Inputs
		System.out.println( "Please enter numbers :\n" );
		System.out.print( "1st :\t" );
		a = input.nextInt();
		System.out.print( "2nd :\t" );
		b = input.nextInt();
		System.out.print( "3rd :\t" );
		c = input.nextInt();
		System.out.print( "4th :\t" );
		d = input.nextInt();
		System.out.print( "5th :\t" );
		e = input.nextInt();
		System.out.println();

		// Printing Posetive Numbers
		System.out.print( "Posetive Numbers : " );
		if ( a > 0 )
			System.out.printf( "%d ", a );
		if ( b > 0 )
			System.out.printf( "%d ", b );
		if ( c > 0 )
			System.out.printf( "%d ", c );
		if ( d > 0 )
			System.out.printf( "%d ", d );
		if ( e > 0 )
			System.out.printf( "%d ", e );
		System.out.println( "\n" );

		// Printing Zero Numbers
		System.out.print( "Zero Numbers : " );
		if ( a == 0 )
			System.out.printf( "%d ", a );
		if ( b == 0 )
			System.out.printf( "%d ", b );
		if ( c == 0 )
			System.out.printf( "%d ", c );
		if ( d == 0 )
			System.out.printf( "%d ", d );
		if ( e == 0 )
			System.out.printf( "%d ", e );
		System.out.println( "\n" );

		// Printing Negetive Numbers
		System.out.print( "Negetive Numbers : " );
		if ( a < 0 )
			System.out.printf( "%d ", a );
		if ( b < 0 )
			System.out.printf( "%d ", b );
		if ( c < 0 )
			System.out.printf( "%d ", c );
		if ( d < 0 )
			System.out.printf( "%d ", d );
		if ( e < 0 )
			System.out.printf( "%d ", e );
		System.out.println();

		// End
		System.out.println( "\n\nGood Luck\n\n" );
	}
}