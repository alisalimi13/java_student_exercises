// In The Name Of Allah
// Porpuse : Comprision Of Two Integer
// Programmer : Ali Salimi
// Date : 1395/8/26

import java.util.Scanner;

public class ComprisionOf2Int
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x, y;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Comprision Of Two Integer\n\n" );

		System.out.print( "Please enter first integer :\t" );
		x = input.nextInt();
		System.out.print( "Please enter second integer :\t" );
		y = input.nextInt();

		if ( x > y )
			System.out.printf( "\n%d is larger.\n", x );
		if ( y > x )
			System.out.printf( "\n%d is larger.\n", y );
		if ( x == y )
			System.out.println( "\nTwo numbers are equal." );

		System.out.println( "\n\nThe End\n\n" );
	}
}