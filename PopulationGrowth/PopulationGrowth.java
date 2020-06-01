// In The Name Of Allah
// Porpuse : Calculating Papulation Growth For Five Years With Integer Numbers
// Programmer : Ali Salimi
// Date : 1395/8/29

import java.util.Scanner;

public class PopulationGrowth
{
	public static void main( String[] args )
	{
		// Declaration Variables
		Scanner input = new Scanner( System.in ); // for recieving inputs
		int p; // population
		int ppg; // percentage of population growth
		int y1, y2, y3, y4, y5; // population in next five years

		// Head
		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculating Papulation Growth For Five Years With Integer Numbers\n\n" );

		// Recieving Inputs
		System.out.print( "Please enter the population : " );
		p = input.nextInt();
		System.out.print( "Please enter the percentage of population growth : " );
		ppg = input.nextInt();
		System.out.println();

		// Calculating Papulation Growth For Five Years
		y1 = p + ( ( p * ppg ) / ( 100 ) );
		y2 = y1 + ( ( y1 * ppg ) / ( 100 ) );
		y3 = y2 + ( ( y2 * ppg ) / ( 100 ) );
		y4 = y3 + ( ( y3 * ppg ) / ( 100 ) );
		y5 = y4 + ( ( y4 * ppg ) / ( 100 ) );

		// Displaying Population Growth For Next Five Years
		System.out.println( "Population Growth For Next Five Years :\n" );
		System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n", 
					y1, y2, y3, y4, y5 );

		// End
		System.out.println( "\n\nGood Luck\n\n" );
	}
}