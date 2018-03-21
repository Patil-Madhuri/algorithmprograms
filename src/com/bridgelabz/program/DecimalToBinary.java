package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Convert the decimal number to binary
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 *
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int decimalnumber;
		System.out.println("Enter the decimal no: ");
		decimalnumber = utility.inputInteger();
		//Utility.binarynumber(decimalnumber);
		String binary = Utility.toBinary(decimalnumber);
		System.out.println("Binary number: " +binary);
		
	}
}

