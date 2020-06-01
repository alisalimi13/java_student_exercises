// In The Name Of Allah
// Title: StudentTest
// Purpose: To Use Student Class
// Programer: Ali Salimi
// Date: 1393/12/21

import java.util.Scanner;

public class StudentTest
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		String n;
		int y;
		double a;

		System.out.print( "\nName: " );
		n = input.nextLine();

		System.out.print( "Introduction Year (1380-1393): " );
		y = input.nextInt();

		System.out.print( "Average (0-20): " );
		a = input.nextDouble();

		Student s = null;

		try
		{
			s = new Student( n, y );
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
		}

		try
		{
			s.setAverage( a );
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
		}

		System.out.printf( "\nName: %s\nIntroduction Year: %d\nAverage: %.2f\n", s.getName(), s.getYear(), s.getAverage() );
	}
}