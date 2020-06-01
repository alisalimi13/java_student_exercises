// In The Name Of Allah
// Porpuse : Calculating Body Mass Index (BMI) And Dispalying Body Condition
// Programmer : Ali Salimi
// Date : 1395/8/29

import java.util.Scanner;

public class BMI
{
	public static void main( String[] args )
	{
		// Declaration Of Variables
		Scanner input = new Scanner( System.in );
		int weight, height, bmi;

		// Head
		System.out.println( "\n\nIn The Name Of Allah\n\n" );
		System.out.println( "Calculating Body Mass Index (BMI) And Dispalying Body Condition\n\n" );
		System.out.println( "In this program, weight is in pounds, height is in inches and numbers are integer.\n\n" );

		// Recieving Inputs
		System.out.print( "Please enter weight (pounds) : " );
		weight = input.nextInt();
		System.out.print( "Please enter height (inches) : " );
		height = input.nextInt();
		System.out.println();

		// Calculating And Displaying BMI
		bmi = ( weight * 703 ) / ( height * height );
		System.out.printf( "BMI : %d\n", bmi );

		// Displaying Body Condition
		System.out.print( "Body Conditin : " );
		if ( bmi < 19 )
			System.out.println( "Lightweight" );
		if ( bmi >= 19 )
			if ( bmi < 25 )
				System.out.println( "Normal" );
		if ( bmi >= 25 )
			if ( bmi < 30 )
				System.out.println( "Overweight" );
		if ( bmi >= 30 )
			System.out.println( "Fat" );

		// End
		System.out.println( "\n\nGood Luck\n\n" );
	}
}