package com.bridgelabz.program;

/******************************************************************************  
 *  Purpose: Calculate the number of returns from vending machine as change
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the amount=");
		int amount = utility.inputInteger();
		Utility.calculateNumberOfNotes(amount);
		
		
	}
			 
}
	


