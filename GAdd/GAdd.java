// In The Name OF Allah
// Title: GAdd
// Purpose: Addition With Graphic User Interface
// Programer: Ali Salimi
// Date: 1393/12/14

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GAdd
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		int n1, n2; // two number for addition
		int sum; // result

		n1 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter frist integer for addition." ) );
		n2 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter second integer for addition." ) );
		sum = n1 + n2;

		String s = String.format( "The sum of two integer is (( %d )) .", sum );

		JOptionPane.showMessageDialog( null, s );
	}
}