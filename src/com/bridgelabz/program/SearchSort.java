 package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: Search and sort methods
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class SearchSort 
{
	public static int mNumberOfElement;
	
	public static String[] mStringArray;
	
	public static Integer[] mIntArray;

	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Choose the operation:");
		System.out.println("1.Bubble Sort (Integer)");
		System.out.println("2.Insertion Sort(Integer)");
		System.out.println("3.Bubble Sort (String)");
		System.out.println("4.Insertion Sort (String)");
		System.out.println("5.Binary Search (Integer)");
		System.out.println("6.Binary Search (String)");
		int choice = utility.inputInteger();
		switch(choice) {
		case 1: System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mIntArray= new Integer[mNumberOfElement];
				Utility.casses(mIntArray,1);
				break;

		case 2:	System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mIntArray= new Integer[mNumberOfElement];
				Utility.casses(mIntArray,2);
				break;
				
		case 5:	System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mIntArray= new Integer[mNumberOfElement];
				Utility.casses(mIntArray,2);
				break;
		case 3:	System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mStringArray= new String[mNumberOfElement];
				Utility.casses(mStringArray,4);
				break;
		case 4:	System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mStringArray= new String[mNumberOfElement];
				Utility.casses(mStringArray,3);
				break;
				
		case 6:	System.out.println("Enter the number of element you want:");;
				mNumberOfElement=utility.inputInteger();
				mStringArray= new String[mNumberOfElement];
				Utility.casses(mStringArray,4);
				break;
		}
	}
}
