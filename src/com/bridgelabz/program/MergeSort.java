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
		int size = utility.inputInteger();
		int array[] = new int[size];
		System.out.println("Enter the array element: ");
		for(int i=0; i<array.length;i++)
		{
			array[i] = utility.inputInteger();
		}
		Utility.mergeSort(array, 0, size);
		System.out.println("Array after merge sort");
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k] +" ");
		}
		
	}
}
