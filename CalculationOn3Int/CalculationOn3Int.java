// In The Name Of Allah
// Porpuse : Calculation On Three Integer
// Programmer : Ali Salimi
// Date : 1395/8/27

import java.util.Scanner;

public class CalculationOn3Int
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x, y, z, sum, pro, avg, max, min;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculation On Three Integer\n\n" );

		System.out.print( "Please enter first integer :\t" );
		x = input.nextInt();
		max = x;
		min = x;

		System.out.print( "Please enter second integer :\t" );
		y = input.nextInt();
		if ( y > max )
			max = y;
		if ( y < min )
			min = y;

		System.out.print( "Please enter third integer :\t" );
		z = input.nextInt();
		if ( z > max )
			max = z;
		if ( z < min )
			min = z;

		sum = x + y + z;
		pro = x * y * z;
		avg = ( x + y + z ) / 3;

		System.out.println();

		System.out.printf( "Maximum :\t%d\n", max );
		System.out.printf( "Minimum :\t%d\n", min );
		System.out.printf( "Sum :\t\t%d\n", sum );
		System.out.printf( "Product :\t%d\n", pro );
		System.out.printf( "Average :\t%d\n", avg );

		System.out.println( "\n\nThe End\n\n" );
	}
}