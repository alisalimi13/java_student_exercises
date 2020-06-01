// In The Name Of Allah
// Title: Factor Class
// Purpose: Preparing A Factor
// Programer: Ali Salimi
// Date: 1393/12/14

public class Factor
{
	private String name;
	private int number;
	private int cost;
	private String exp;



	public void setName( String n )
	{
		name = n;
	}

	public void setNumber( int n )
	{
		number = n;
	}

	public void setCost( int c )
	{
		cost = c;
	}

	public void setExp( String e )
	{
		exp = e;
	}


	public String getName()
	{
		return name;
	}

	public int getNumber()
	{
		return number;
	}

	public int getCost()
	{
		return cost;
	}

	public String getExp()
	{
		return exp;
	}


	public int totalCost()
	{
		return ( number * cost );
	}


	public Factor()
	{
		setName( "Nothing" );
		setNumber( 0 );
		setCost( 0 );
		setExp( "Noexp" );
	}
}