// In The Name Of Allah
// Title: GFactor
// Purpose: Using Factor Through GUI
// Programer: Ali Salimi
// Date: 1393/12/14

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GFactor
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		Factor f = new Factor();

		f.setName( JOptionPane.showInputDialog( "Please enter name of product:" ) );
		f.setNumber( Integer.parseInt( JOptionPane.showInputDialog( "Please enter number of product:" ) ) );
		f.setCost( Integer.parseInt( JOptionPane.showInputDialog( "Please enter cost of product:" ) ) );
		f.setExp( JOptionPane.showInputDialog( "Please enter explain:" ) );

		String factorDetails = 
			String.format( "Factor\n\nName: %s\nNumber: %d\nCost: %d\nExplain: %s\n\nTotal Cost: %d\n\n", 
				f.getName(), f.getNumber(), f.getCost(), f.getExp(), f.totalCost() );

		JOptionPane.showMessageDialog( null, factorDetails );
	}
}