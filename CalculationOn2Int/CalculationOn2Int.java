// In The Name Of Allah
// Porpuse : Calculation On Two Integer
// Programmer : Ali Salimi
// Date : 1395/8/26

import java.util.Scanner;

public class CalculationOn2Int
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x, y;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculation On Two Integer\n\n" );

		System.out.print( "Please enter first integer : " );
		x = input.nextInt();
		System.out.print( "Please enter second integer : " );
		y = input.nextInt();

		System.out.println();

		System.out.printf( "%d + %d = %d\n\n", x, y, ( x + y ) );
		System.out.printf( "%d - %d = %d\n\n", x, y, ( x - y ) );
		System.out.printf( "%d * %d = %d\n\n", x, y, ( x * y ) );
		System.out.printf( "%d / %d = %d\n\n", x, y, ( x / y ) );

		System.out.println( "\nThe End\n\n" );		
	}
}