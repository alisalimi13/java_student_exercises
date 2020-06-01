// In The Name Of Allah
// Porpuse : Calculating Diameter, Environment, Space Of A Circle From Radius With Integer Numbers
// Programmer : Ali Salimi
// Date : 1395/8/28

import java.util.Scanner;

public class CalculationOfCircle
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int r, d, e, s;
		int p = 3; // Pi number ( 3.1415... )

		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculating Diameter, Environment, Space Of A Circle From Radius With Integer Numbers\n\n" );

		System.out.print( "Please enter radius : " );
		r = input.nextInt();

		d = 2 * r;
		e = 2 * p * r;
		s = p * r * r;

		System.out.printf( "\nDiameter :\t%d\nEnvironment :\t%d\nSpace :\t\t%d\n", d, e, s );

		System.out.println( "\n\nGood Luck\n\n" );
	}
}