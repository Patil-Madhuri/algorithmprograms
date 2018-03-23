package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Swap the nibbles
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class SwapNibbles 
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int lDecimalNumber;
		System.out.println("Enter the decimal no: ");
		lDecimalNumber = utility.inputInteger();
		//Utility.binarynumber(decimalnumber);
		String lBinaryString = Utility.toBinary(lDecimalNumber);
		String swappedNibbles=Utility.swappedNibbles(lBinaryString);
		System.out.println(lBinaryString);
		System.out.println("After swapping nibbles");
		System.out.println(swappedNibbles);
		int lDecimalNumber1 = Utility.binaryToDecimal(swappedNibbles);
		System.out.println("Decimal number: " +lDecimalNumber1);
		
	}
}
