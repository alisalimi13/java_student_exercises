// In The Name of Allah
// Porpuse : Recognizing Be Even Or Odd Of An Integer
// Programmer : Ali Salimi
// Date : 1395/8/27

import java.util.Scanner;

public class EvenOddInt
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Recognizing Be Even Or Odd Of An Integer\n\n" );

		System.out.print( "Please enter intended integer : " );
		x = input.nextInt();

		if ( x / 2 * 2 == x )
			System.out.printf( "\n%d is even.\n", x );
		if ( x / 2 * 2 != x )
			System.out.printf( "\n%d is odd.\n", x );

		System.out.println( "\n\nGood Luck\n\n" );
	}
}