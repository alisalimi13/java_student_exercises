// In The Name of Allah
// Porpuse : Calculating Cost Of Used Personal Car In A Day ( With Integer Numbers )
// Programmer : Ali Salimi
// Date : 1395/8/29

import java.util.Scanner;

public class CostOfCar
{
	public static void main( String[] args )
	{
		// Declration Of Variables
		Scanner input = new Scanner( System.in );
		int dt; // distance traveled in a day
		int clg; // cost of per liter of gasoline
		int dl; // average distance traveled by a liter of gasoline
		int cp; // cost of parking in a day
		int cc; // cost of complications in a day
		int cost; // the cost of personal car in a day ( total cost )

		// Head
		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculating Cost Of Used Personal Car In A Day ( With Integer Numbers )\n\n" );

		// Recieving Inputs
		System.out.println( "Please enter requested values :\n" );
		System.out.print( "Distance traveled in a day : " );
		dt = input.nextInt();
		System.out.print( "Cost of per liter of gasoline : " );
		clg = input.nextInt();
		System.out.print( "Average distance traveled by a liter of gasoline : " );
		dl = input.nextInt();
		System.out.print( "Cost of parking in a day : " );
		cp = input.nextInt();
		System.out.print( "Cost of complications in a day : " );
		cc = input.nextInt();
		System.out.println();

		// Calculating Total Cost
		cost = ( ( dt / dl ) * clg ) + cp + cc;

		// Displaying Total Cost
		System.out.printf( "The cost of personal car in a day : %d\n", cost );

		// End
		System.out.println( "\n\nGood Luck\n\n" );
	}
}