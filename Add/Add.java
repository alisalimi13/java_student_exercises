// In The Name Of Allah
// Title Of Program: Add Two Integer
// Programer: Ali Salimi
// Date: 1394\12\12

import java.util.Scanner;

public class Add
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int n1;
		int n2;

		System.out.print( "\nPlease enter frist integer: " );
		n1 = input.nextInt() ;

		System.out.print( "\nPlease enter second integer: " );
		n2 = input.nextInt() ;

		System.out.printf( "\nSum is: %d\n\n", (n1 + n2) );
	}
}