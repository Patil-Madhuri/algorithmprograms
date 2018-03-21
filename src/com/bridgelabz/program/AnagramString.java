package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Check whether the string is anagram or not
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class AnagramString 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter string to check anagram");
		String str,str1;
		System.out.println("Enter first String");
		str = utility.inputString();
		System.out.println("Enter second string");
		str1 = utility.inputString();
		boolean flag = Utility.isAnagram(str, str1);
		if(flag)
		{
			System.out.println("Strings are palindrome");
		}
		else
		{
			System.out.println("Strings are not palindrome");
		}
		
	}
}
