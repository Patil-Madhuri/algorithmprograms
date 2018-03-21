package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Print the prime numbers that are anagram and palindrome between 0 to 1000
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class PrimeAnagramPalindrome
{
	public static void main(String[] args) 
	{
		Utility.printPrimeNumbers();
		System.out.println("==============");
		Utility.printPrimePalindrome();
		System.out.println("==============");
		Utility.primeAnagram();
	}
}
