package com.bridgelabz.program;

/******************************************************************************  
 *  Purpose: Find the imaginary number using binary serach
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class QuestionNumber
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter any number: ");
		int number = utility.inputInteger();
		int range = (int) Math.pow(2, number-1);
		int result=Utility.findQuestionNumber1(0,range);
		if(result != -1)
		{
			System.out.println("Your number is: " +number);
		}
		else
		{
			System.out.println("Invalid ");
		}
	}
	}
