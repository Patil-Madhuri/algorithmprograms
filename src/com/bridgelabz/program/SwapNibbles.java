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
		int decimalnumber;
		System.out.println("Enter the decimal no: ");
		decimalnumber = utility.inputInteger();
		//Utility.binarynumber(decimalnumber);
		String binaryString = Utility.toBinary(decimalnumber);
		String swappedNibbles=Utility.swappedNibbles(binaryString);
		System.out.println(binaryString);
		System.out.println("After swapping nibbles");
		System.out.println(swappedNibbles);
		int decimalnum = Utility.binaryToDecimal(swappedNibbles);
		System.out.println("Decimal number: " +decimalnum);
		
	}
}
