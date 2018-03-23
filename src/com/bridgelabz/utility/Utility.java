package com.bridgelabz.utility;
/*************************************************************************
 * @purpose  Utility class for algorithm programs
 * @author  Madhuri Chaudhari
 * @version 1.0
 * @since 05/03/2018
 *************************************************************************/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility 
{
	static Scanner scanner=new Scanner(System.in);
	public static int middleIndex=0;
	public static long START_TIMER=0;
	public static long STOP_TIMER=0;
	public static long ELAPSED;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	
	/**
	 * @input string
	 */
	public String inputString()
	{
		try
		{
		return scanner.next();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
	
	/**
	 * @input integer
	 */
	public int inputInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	/**
	 * input double
	 */
	public double inputDouble()
	{
		try
		{
			return scanner.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0.0;
	}
	
	public long inputLong()
	{
		try
		{
			scanner.nextLong();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	/**
	 * @param accept two string from user and check that string are anagram or not
	 * One string is an anagram of another if the second is simply a
		rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
		using java API
	 */
	public static boolean isAnagram(String lString1, String lString2) 
	{
		boolean isAnagram = true;
		char charArray1[] = lString1.toLowerCase().toCharArray();
		char charArray2[] = lString2.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (charArray1.length != charArray2.length) 
		{
			return false;
		} 
		else 
		{
			for (int i = 0; i < charArray1.length; i++) {
				if (charArray1[i] == charArray2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

			}
		}
		return isAnagram;
	}
	
	/**
	 * @param accept the filePath and read the file
	 * @return
	 */
	@SuppressWarnings("unused")
	public static String[] readFile(String filePath) {
		String words[] = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[] = {};
		BufferedReader bufferedReader;
		FileReader file;
		int index = 0;
		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) 
			{
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++)
				{
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
			bufferedReader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return words;
	}
	/**
	 * @param buublesortinteger() accept the integer array from user and arrange it in ascending
	  order 
	 */
		public static <T extends Comparable<T>> void bubbleSort(T[] array) 
		{
			for(int i=0;i<array.length;i++) {
				for(int j=1;j<array.length;j++) {
					if(array[j-1].compareTo(array[j])>0) {
						T temporary=array[j-1];
						array[j-1]=array[j];
						array[j]=temporary;
					}
				}	
			}
		}
		
		public static <T extends Comparable<T>>void insertionSort(T[] array) 
		{
			for(int i=0;i<array.length;i++) 
			{
				T insertingElement=array[i];
				for(int j=0;j<=i;j++) 
				{
					if(array[j].compareTo(array[i])>0) 
					{
						for(int k=i;k>j;k--)
							array[k]=array[k-1];
						array[j]=insertingElement;
					}
				}
			
		}
		}	
		
		/**
		 * sort the number in ascending order using merge sort
		 */
		public static void mergeSort(int intArray[],int lLower,int lHigher)
		{
			int n = lHigher - lLower;		//high means size of array
			if(n<=1)
				return;
			int mid = lLower + n/2;
			mergeSort(intArray,lLower,mid);
			mergeSort(intArray, mid, lHigher);
			int temp[] = new int[n];
			int i=lLower,j=mid;	
			for(int k=0;k<n;k++)
			{
				if(i==mid)
				{
					temp[k] = intArray[j++];
				}
				else if(j == lHigher)
				{
					temp[k] = intArray[i++];
				}
				else if(intArray[j] < intArray[i])
				{
					temp[k] = intArray[j++];
				}
				else
				{
					temp[k] = intArray[i++];
				}
			}
			for (int k = 0; k < n; k++) 
				intArray[lLower + k] = temp[k];   
			
	    }

		 /**
		 * @param array,first,last,key means element to search in array
		 * binary search of integer
		 */
		
	public static <T extends Comparable<T>> void binarySearch(T[] array,T intElement,int lStartingIndex,int lLastIndex) 
	{
				middleIndex=(lStartingIndex+lLastIndex)/2;
				
				if(intElement.equals(array[middleIndex]))
				{
					System.out.println("Found the Word");
				}
				else if(lStartingIndex==lLastIndex)
				{
					System.out.println("There is no such element");
				}
				else 
				{
					if(array[middleIndex].compareTo((T) intElement)>0)
					{
						binarySearch(array,intElement,lStartingIndex,middleIndex);
					}
					else
					{
						binarySearch(array,intElement,middleIndex+1,lLastIndex);	
					}
				}
		}
	
	/**
	 * @param accept the decimalnumber from the user and convert it into respective binary number
	 */
	public static String toBinary(int lDecimalNumber)
	{
		int rem;
		String binaryArray[] = { "0", "1" };
		String binary = "";
		int padding = 0;
		while (lDecimalNumber > 0 || padding % 8 != 0) 
		{
			rem = lDecimalNumber % 2;
			binary = binaryArray[rem] + binary;
			lDecimalNumber = lDecimalNumber / 2;
			padding++;
			if (padding % 4 == 0 && lDecimalNumber != 0) 
			{
				binary = "  " + binary;

			}
		}
		return binary;
	} 
	/**
	 * @param swap nibbles
	 * @return
	 */
	public static String swappedNibbles(String binary) 
	{
		binary = binary.replaceAll(" ", "");
		String lowerNibble = binary.substring(0, 4);
		String upperNibble = binary.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
		return swappedBinary;
	}
	
	/**
	 * @param binary to decimal number conversion
	 * @return
	 */
	public static int binaryToDecimal(String binary) 
	{
		  double j=0;
		   for(int i=0;i<binary.length();i++)
		    {
		       if(binary.charAt(i)== '1')
		       {
		    	   j=j+ Math.pow(2,binary.length()-1-i);
		       }

		    }
		    return (int) j;

	}
	
	/**
	 * @param accept the principle,year,rate of interest and calculate the monthly payment
	 */
	
	public static void calculateMonthlyPayment(double lPrincipleAmount,int lYear,double lRateOfInterest)
	{
		double ln = 12 * lYear;
		double r = lRateOfInterest /(12 *100);
		double lPayment;
		lPayment = lPrincipleAmount* r / (1- Math.pow(1+r, -ln));
		System.out.println("Monthly Payment is: "+lPayment);
	}
	
	/**
	 * @param accept the number from user and calculate the square root using newton method
	 * use formula:
	 * Math.abs(t ­ c/t) > epsilon*t
		where epsilon = 1e­15;
	 */
	public static void sqrtNewtonsMethod(double lNumber)
	{
		 double lEpsilon = 1e-15;    
	        double lT = lNumber;          
	        while (Math.abs(lT - lNumber/lT) > lEpsilon * lT)
	        {
	        	lT = (lNumber/lT + lT) / 2.0;
	        }
	       
	        System.out.println(lT);
	}

	/**
	 * check the number is prime or not
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) 
	{
		// condition to check if no less than two
		if (number < 2) {
			return false;
		}
		// for loop to for checking prime no
		for (int i = 2; i * i <= number; i++) 
		{
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % i == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}
	/**
	 * @param accept the string from the user and check is that is palindrome
	 * A palindrome is a string that reads the same forward and backward, for
		example, radar,madam.
	 */
	public static boolean isPalindrome(String str) 
	{
		char arr[] = str.toLowerCase().toCharArray();
		boolean isPalindrome = true;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) 
		{
			if (arr[i] == arr[j]) 
			{
				isPalindrome = true;
			} else 
			{
				isPalindrome = false;
				return isPalindrome;
			}
		}
		return isPalindrome;

	}
	/**
	 * prime() is used to print the prime number from 0 to 1000
	 * @return the number if the number is prime
	 */
	public static int printPrimeNumbers()
	{
		int i,j;
		System.out.println("Prime numbers between 0 to 1000 are: ");
		for(i = 0; i <= 1000; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                   
                    break;
                }
                
            }
            if(j == i)
            {
                System.out.println(i);
            }
        }
		return i;
	}
	/** check the prime number is palindrome or not
	 * 
	 */
	public static void printPrimePalindrome()
	{
		System.out.println("Palindrome Prime number:==>>");
		for (int lNumber = 2; lNumber < 1000; lNumber++)
		{
			if (isPrime(lNumber))
			{
				if (isPalindrome(Integer.toString(lNumber))) 
				{
					System.out.println(lNumber);
				}
			}
		}
	}
	/**
	 * check the prime number is anagram or not
	 */
	public static void primeAnagram() 
	{
		ArrayList<String> primes = new ArrayList<>();
		System.out.println("Prime numbers that are anagram");
		for (int i = 0; i < 1000; i++) 
		{
			if (isPrime(i)) 
			{
				primes.add(String.valueOf(i));
			}
		}
		for (int i = 0; i < primes.size(); i++) 
		{
			for (int j = i + 1; j < primes.size(); j++) 
			{
				if (isAnagram(primes.get(i), primes.get(j)))
				{
					System.out.println(primes.get(i) + "    " + primes.get(j));
				}
			}
		}
	}
	
	/**
	 * @param lower
	 * @param higher
	 * @return
	 * find the question number
	 */
	public static int findQuestionNumber1(int lLowerRange,int lHigherRange)
	{
		if(lLowerRange > lHigherRange)
		{
			return -1;
		}
		else if(lHigherRange == lLowerRange)
		{
			return  lLowerRange;
		}
		int middle = (lLowerRange + lHigherRange)/2;
		System.out.println("Your number between "+lLowerRange + " to "+middle);
		boolean flag = true;
		if(flag != scanner.nextBoolean())
		{
			lLowerRange = middle+1;
		}
		else
		{
			lHigherRange = middle;
		}
		return findQuestionNumber1(lLowerRange, lHigherRange);
	}
	
	/**
	 * @param array
	 * @param choice
	 */
	public static <T> void casses(T[] array,int choice) 
	{
		if(array instanceof Integer[]&&(choice==1||choice==2))
			integerType((Integer[]) array,choice);
		else
			stringType((String[])array,choice);
	}
	public static long[] elapsedTime=new long[2];
	
	/**
	 * @param array
	 * @param choice
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void insertingElement(T[] array) {
		if(array instanceof String[] ) {
			System.out.println("Insert String element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) scanner.next();
		}
		else if(array instanceof Float[]) {
			System.out.println("Insert Float element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Float.valueOf(scanner.nextFloat());
		}
		else if(array instanceof Double[]) {
			System.out.println("Insert Double element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Double.valueOf(scanner.nextDouble());
		}
		else if(array instanceof Boolean[]) {
			System.out.println("Insert Float element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Boolean.valueOf(scanner.nextBoolean());
		}
		else {
			System.out.println("Insert Integer element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Integer.valueOf(scanner.nextInt());
		}	
		
	}
	
	public static void integerType(Integer[] array,int choice) {
		START_TIMER=System.currentTimeMillis();
		insertingElement(array);
		if(choice==1)
			bubbleSort(array);
		else
			insertionSort(array);
		STOP_TIMER=System.currentTimeMillis();
		elapsedTime[0]=STOP_TIMER-START_TIMER;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		START_TIMER=System.currentTimeMillis();
		System.out.println("Enter the integer elment you want to search:");
		Integer intElement=Integer.valueOf(scanner.next());
		System.out.println(intElement);
		binarySearch(array,intElement, 0, array.length-1);
		STOP_TIMER=System.currentTimeMillis();
		elapsedTime[1]=STOP_TIMER-START_TIMER;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);

	}
	

	public static void sortingElapsedTime(long[] array)
	{
		for(int i=0;i<array.length;i++) 
		{
			for(int j=1;j<array.length;j++)
				if(array[j-1]<array[j]) 
				{
					long temporary=array[j-1];
					array[j-1]=array[j];
					array[j]=temporary;
				}
		}
		System.out.println("elapsed times performance(millisecond):"+Arrays.toString(array));
	}

	/**
	 * @param array
	 * @param choice
	 */
	public static void stringType(String[] array,int choice) 
	{
		START_TIMER=System.currentTimeMillis();
		insertingElement(array);
		if(choice==3)
			bubbleSort(array);
		else
			insertionSort(array);
		STOP_TIMER=System.currentTimeMillis();
		elapsedTime[0]=STOP_TIMER-START_TIMER;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		START_TIMER=System.currentTimeMillis();
		System.out.println("Enter the String elment you want to search:");
		String stringElement=scanner.next();
		binarySearch(array,stringElement, 0,array.length-1);
		STOP_TIMER=System.currentTimeMillis();
		elapsedTime[1]=STOP_TIMER-START_TIMER;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);
	}
	public static <generic> void arrayDisplay(int row, int coloumn, 
			ArrayList<ArrayList<generic>> array) 
	{
			for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
			System.out.format("%2d ", array.get(i).get(j));
			System.out.println();
			}
		}	
	@SuppressWarnings("unchecked")
	public static <T> T genericTwoDArray(int row, int coloumn, int choice) 
	{
		ArrayList<ArrayList<T>> twoDArray = new ArrayList<ArrayList<T>>();
		for (int i = 0; i < row; i++)
			twoDArray.add(new ArrayList<T>());
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				if (choice == 1)
					twoDArray.get(i).add((T) Integer.valueOf(scanner.nextInt()));
				else if (choice == 2)
					twoDArray.get(i).add((T) Double.valueOf(scanner.nextDouble()));
				else if(choice==3)
					twoDArray.get(i).add((T) Boolean.valueOf(scanner.nextBoolean()));
		}
		return (T) twoDArray;
	}
	
	/**
	 * @param accept the temperature in fahrenheit and convert it into celsius
	 * using formula
	 * Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
	 */
	public static void temperatureConversion(double lFahrenhiTemperature)
	{
		 double lCelsiusTemperature;
		 lCelsiusTemperature = (lFahrenhiTemperature-32)*(0.5556);
		 System.out.println("Temperature in celsius: " +lCelsiusTemperature);
	}
	
	/**
	 * @param accept the temprature in celsius and convert it into fahrenhit
	 * using formula
	 * Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
	 */
	public static void temperatureConversion1(double lCelsiusTemperature)
	{
		double lFahrenhiTemperature;
		lFahrenhiTemperature = (lCelsiusTemperature *1.8)+32;
		System.out.println("Temperature in fahrenhit: " +lFahrenhiTemperature);
		
	}
	/**
	 * @param accept the amount from user and calculate
	 * how many number of 1000,500,100,50,10,5,2,1 will be returned as change
	 */
	public static void calculateNumberOfNotes(int lAmount)
	{
		int lNumberOfNotes;
			if(lAmount >= 1000)
			{
				lNumberOfNotes = lAmount / 1000;
			    lAmount = lAmount % 1000;
				System.out.println("No of 1000 notes= "  +lNumberOfNotes);
			}
			if(lAmount >= 500)
			{
				lNumberOfNotes = lAmount / 500;
				lAmount = lAmount % 500;
				System.out.println("No of 500 notes= "  +lNumberOfNotes);
			}
			if(lAmount >= 100)
			{
				lNumberOfNotes = lAmount / 100;
				lAmount = lAmount % 100;
				System.out.println("No of 100 notes= "  +lNumberOfNotes);
			}
			if(lAmount >= 50)
			{
				lNumberOfNotes = lAmount /50;
				lAmount = lAmount % 50;
				System.out.println("No of 50 notes= " +lNumberOfNotes);
			}
			if(lAmount >=10)
			{
				lNumberOfNotes = lAmount /10;
				lAmount = lAmount % 10;
				System.out.println("No of 10 notes= " +lNumberOfNotes);
			}
			if(lAmount >=5)
			{
				lNumberOfNotes = lAmount /5;
				lAmount = lAmount %5;
				System.out.println("No of 5 Rs coins= "+lNumberOfNotes);
			}
			if(lAmount >=2)
			{
				lNumberOfNotes = lAmount/2;
				lAmount = lAmount%2;
				System.out.println("No of 2 Rs coins= " +lNumberOfNotes);
			}
			if(lAmount >=1)
			{
				lNumberOfNotes = lAmount /1;
				lAmount = lAmount%1;
				System.out.println("No of 1 Rs coins= " +lNumberOfNotes);
			}
			 
	}
	
	
}
