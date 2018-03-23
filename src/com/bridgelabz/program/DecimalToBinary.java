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
		int lDecimalNumber;
		System.out.println("Enter the decimal no: ");
		lDecimalNumber = utility.inputInteger();
		//Utility.binarynumber(decimalnumber);
		String binaryNumber = Utility.toBinary(lDecimalNumber);
		System.out.println("Binary number: " +binaryNumber);
		
	}
}

