// In The Name Of Allah
// Porpuse : Finding Maximum And Minimum In Five Integer
// Programmer : Ali Salimi
// Date : 1395/8/27

import java.util.Scanner;

public class MaxMin5Int
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x, max, min;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Finding Maximum And Minimum In Five Integer\n\n" );

		System.out.print( "1st :\t" );
		x = input.nextInt();
		max = x;
		min = x;

		System.out.print( "2nd :\t" );
		x = input.nextInt();
		if ( x > max )
			max = x;
		if ( x < min )
			min = x;

		System.out.print( "3rd :\t" );
		x = input.nextInt();
		if ( x > max )
			max = x;
		if ( x < min )
			min = x;

		System.out.print( "4th :\t" );
		x = input.nextInt();
		if ( x > max )
			max = x;
		if ( x < min )
			min = x;

		System.out.print( "5th :\t" );
		x = input.nextInt();
		if ( x > max )
			max = x;
		if ( x < min )
			min = x;

		System.out.printf( "\nMaximum :\t%d\nMinimum :\t%d\n", max, min );

		System.out.println( "\n\nGood Luck\n\n" );
	}
}