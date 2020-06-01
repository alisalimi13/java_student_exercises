// In The Name Of Allah
// Porpuse : Seprating Digits Of A Five-Digit Number
// Programmer : Ali Salimi
// Date : 1395/8/28

import java.util.Scanner;

public class Seprating5DigitNum
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int n;

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Seprating Digits Of A Five-Digit Number\n\n" );

		System.out.print( "Please enter a five-digit number : " );
		n = input.nextInt();

		System.out.printf( "\n%d   %d   %d   %d   %d\n", ( n / 10000 % 10 ), 
					( n / 1000 % 10 ), ( n / 100 % 10 ),
					 ( n / 10 % 10  ), ( n % 10 ) );

		System.out.println( "\n\nGood Luck\n\n" );
	}
}