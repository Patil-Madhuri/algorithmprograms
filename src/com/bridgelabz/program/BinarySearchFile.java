package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose:Search a word from file using binary search
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class BinarySearchFile
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		String words[]={},search;
		words =Utility.readFile("/home/bridgeit/Documents/MADHURI/demo");
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println("\nEnter word to search");
		search=utility.inputString();
		Utility.bubbleSort(words);
		Utility.binarySearch(words, search, 0, words.length-1 );
		
		   
	}
}
