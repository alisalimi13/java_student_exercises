// In The Name Of Allah
// Porpuse : Product Of Three Integer
// Programmer : Ali Salimi
// Date : 1395/8/26

import java.util.Scanner;

public class ProductOfThreeInt
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int x, y, z, result;
		
		System.out.println( "\n\nIn The Name Of Allah\n" );
		System.out.println( "Product Of Three Integer Program\n\n" );
		
		System.out.print( "Please Enter first integer : " );
		x = input.nextInt();
		System.out.print( "Please Enter second integer : " );
		y = input.nextInt();
		System.out.print( "Please Enter third integer : " );
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf( "\nResult is %d .\n\n", result );
	} // end of main method
} // end of ProductOfThreeInt