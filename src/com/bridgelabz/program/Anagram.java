package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Check whether the string is anagram ot not
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class Anagram 
{
	public static void main(String[] args) 
	{
	Utility utility = new Utility();
    String str,str1;
	System.out.println("Enter first String");
	str = utility.inputString();
	System.out.println("Enter second string");
	str1 = utility.inputString();
   //Utility.anagramstring(str, str1);
	boolean flag = Utility.isAnagram(str, str1);
	if(flag)
	{
		System.out.println("Strings are anagram");
	}
	else
	{
		System.out.println("Strings are not anagram");
	}
   
}
}
