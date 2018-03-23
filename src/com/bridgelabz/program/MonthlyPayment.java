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
		double lPrincipleAmount,lRateOfInterest;
		int lYear;
		System.out.println("Enter the principal amount: ");
		lPrincipleAmount =utility.inputDouble();;
		System.out.println("Enter the year: ");
		lYear = utility.inputInteger();
		System.out.println("Enter the rate of interest: ");
		lRateOfInterest = utility.inputDouble();
		Utility.calculateMonthlyPayment(lPrincipleAmount, lYear, lRateOfInterest);
		
	}
}
