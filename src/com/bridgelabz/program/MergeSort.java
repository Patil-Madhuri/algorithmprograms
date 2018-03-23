package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Sort the integer array using merge sort
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class MergeSort
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter size of array: ");
		int lArraySize = utility.inputInteger();
		int intArray[] = new int[lArraySize];
		System.out.println("Enter the array element: ");
		for(int i=0; i<intArray.length;i++)
		{
			intArray[i] = utility.inputInteger();
		}
		Utility.mergeSort(intArray, 0, lArraySize);
		System.out.println("Array after merge sort");
		for(int k=0;k<intArray.length;k++)
		{
			System.out.print(intArray[k] +" ");
		}
		
	}
}
