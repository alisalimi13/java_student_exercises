// In The Name Of Allah
// Title: Student
// Purpose: To Save Student's details
// Programer: Ali Salimi
// Date: 1393/12/21

public class Student
{
	private String name;
	private int year;
	private double average;


	public Student( String n, int y )
	{
		name = n;

		if ( 1380 <= y && y <= 1393 )
			year = y;
		else
			throw new IllegalArgumentException( "\nIntroduction year is not correct!!!" );
	}

	public void setAverage( double a )
	{
		if ( 0 <= a && a <= 20 )
			average = a;
		else
			throw new IllegalArgumentException( "\nAverage is not correct!!!" );
	}

	public double getAverage()
	{
		return average;
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}
}