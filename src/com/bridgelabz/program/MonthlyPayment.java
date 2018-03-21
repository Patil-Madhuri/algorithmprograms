package com.bridgelabz.program;
/******************************************************************************  
 *  Purpose: calculate monthly payment
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class MonthlyPayment
{
	public static void main(String[] args) {
		Utility utility = new Utility();
		double principle,rate;
		int year;
		System.out.println("Enter the principal amount: ");
		principle =utility.inputDouble();;
		System.out.println("Enter the year: ");
		year = utility.inputInteger();
		System.out.println("Enter the rate of interest: ");
		rate = utility.inputDouble();
		Utility.monthlyPayment(principle, year, rate);
		
	}
}
