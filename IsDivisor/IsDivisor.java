// In The Name Of Allah
// Porpuse : Recognizing That First Integer Be Or Not Be A Multiplaction Of Second Integer
// Programmer : Ali Salimi
// Date : 1395/8/27

import java.util.Scanner;

public class IsDivisor
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int first, second;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Recognizing That First Integer Be Or Not Be A Multiplaction Of Second Integer\n\n" );

		System.out.print( "1st :\t" );
		first = input.nextInt();
		System.out.print( "2nd :\t" );
		second = input.nextInt();

		if ( first / second * second == first )
			System.out.printf( "\n%d is a divisor for %d .\n", second, first );
		if ( first / second * second != first )
			System.out.printf( "\n%d is not a divisor for %d .\n", second, first );

		System.out.println( "\n\nGood Luck\n\n" );
	}
}