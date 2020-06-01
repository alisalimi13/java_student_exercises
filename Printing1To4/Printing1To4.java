// In The Name Of Allah
// Porpuse : Printing 1 To 4
// Programmer : Ali Salimi
// Date : 1395/8/26

public class Printing1To4
{
	public static void main( String[] args )
	{
		System.out.println( "\n\nIn The Name Of Allah\n" );
		System.out.println( "Printing 1 To 4\n\n" );

		// with one println method
		System.out.println( "1 2 3 4" );

		System.out.println();

		// with four print method
		System.out.print( "1 " );
		System.out.print( "2 " );
		System.out.print( "3 " );
		System.out.print( "4\n" );

		System.out.println();

		// with one printf method
		System.out.printf( "%d %d %d %d\n", 1, 2, 3, 4 );

		System.out.println( "\n\nThe End.\n\n" );
	}
}