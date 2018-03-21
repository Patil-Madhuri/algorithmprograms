package com.bridgelabz.program;

/******************************************************************************  
 *  Purpose: Convert the temperature from fahrenhit to celsius
 *  		& convert the temperature from celsiud to fahrenhit
 *  @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   03-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class Temperature 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the temperature in  Fahrenheit to convert into Celsius : ");
		double fahrenhit = utility.inputDouble();
		Utility.temperatureConversion(fahrenhit);
		
		System.out.println("Enter the temperature in celsius to convert into fahrenheit: ");
		double celsius = utility.inputDouble();
		Utility.temperatureConversion1(celsius);
		
	}
}
