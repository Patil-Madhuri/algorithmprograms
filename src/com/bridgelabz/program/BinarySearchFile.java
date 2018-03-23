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
		String wordsArray[]={},lSearchWord;
		wordsArray =Utility.readFile("/home/bridgeit/Documents/MADHURI/binarySearch");
		for(int i=0;i<wordsArray.length;i++)
		{
			System.out.print(wordsArray[i] + " ");
		}
		System.out.println("\nEnter word to search");
		lSearchWord=utility.inputString();
		Utility.bubbleSort(wordsArray);
		Utility.binarySearch(wordsArray, lSearchWord, 0, wordsArray.length-1 );
		
		   
	}
}
