package com.bridgelabz.program;

/******************************************************************************  
 *  Purpose: Find the square root using Newton's method
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class NewtonsMethod 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the number: ");
		double number = utility.inputDouble();
		Utility.sqrtNewtonsMethod(number);
		
	}
}
