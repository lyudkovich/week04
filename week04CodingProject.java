package week04;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//
//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//
//i. Make sure that there are 9 elements of type int in this new array.  
//
//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
//
//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//
//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//
//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//
//3. How do you access the last element of any array?
//
//4. How do you access the first element of any array?
//
//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
//
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

public class week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(Arrays.toString(ages));
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
		ages[ages.length -1] = ages[ages.length -1]  - ages[0] ;
		System.out.println(Arrays.toString(ages));
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		//
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		ages2[ages2.length -1] = ages2[ages2.length -1]  - ages2[0] ;
		System.out.println(Arrays.toString(ages2));
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sumAge = 0;
		for (int i = 0; i < ages.length; i++) {
			sumAge = sumAge + ages[i];
		}
		
		System.out.println("The average age in ages = " + sumAge/ages.length);
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int sumLetters = 0;
		for(int i = 0; i < names.length; i++) {
			sumLetters = sumLetters + names[i].length() ;
		}
		System.out.println("The average letters per name = " + sumLetters/names.length);
		
		String concNames = "";
		for(int i = 0; i < names.length; i++) {
			concNames = concNames + names[i] + " " ;
		}
		System.out.println("Concatenated Names : " + concNames + ";");
		concNames = concNames.substring(0, concNames.length() - 1);
		System.out.println("Concatenated Names : " + concNames + ";");
		
		//3. How do you access the last element of any array?
		//4. How do you access the first element of any array?		
		System.out.println("Last element of Names : " + names[names.length - 1]);
		System.out.println("First element of Names : " + names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.		
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumNameLength = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			sumNameLength = sumNameLength + nameLengths[i];
		}		
		System.out.println("Sum of all the name length : " + sumNameLength);
		
		//7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("method 7 : " + concatenatedString("hello", 5) );
		
		//9 is sum > 100
		int [] intArr = {1,2,3,4,100};
		System.out.println("method 9 : " + isSumGreater100(intArr ));
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers = { 1.2, 3.4, 5.6, 7.8, 3.12 };
		System.out.println("method 10 : " + aveArrayDouble(numbers) );
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] numbers1 = { 31.2, 33.4, 35.6, 37.8, 33.12 };	
		double[] numbers2 = { 21.2, 23.4, 25.6, 27.8, 23.12 };
		System.out.println("method 11 : " + compAveArray(numbers1, numbers2) );
		
		//13 Method to return greeting based on current local time
		System.out.println(returnGreeting("Leo"));
	}
	
	////7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
	
	public static String concatenatedString( String word, int n ) {
		String concatenatedString = "";
		for (int i = 1; i <= n; i++) {
			concatenatedString += word;
		}
		//concatenatedString = concatenatedString.substring(0, concatenatedString.length() - 1);
		return concatenatedString;
	}	
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).	
	public static String fullName( String firstName, String lastName ) {

		return firstName + " " + lastName;
	}	
	
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean  isSumGreater100( int[] integers) {
		int sum = Arrays.stream(integers).sum(); 
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
		
	}		
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double aveArrayDouble( double[] doubles) {
		double sum = 0.00; 
		for (double num : doubles) {
			sum +=  num;
		}
		return sum;
	}
	
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean compAveArray( double[] doubles1,double[] doubles2 ) {
		if ( aveArrayDouble(doubles1) > aveArrayDouble(doubles2) ) {
			return true;
		}else {
			return false;
		}
	}	
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink( boolean isHotOutside,double moneyInPocket ) {
		if ( isHotOutside && moneyInPocket > 10.50)  {
			return true;
		}else {
			return false;
		}
	}	
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static String returnGreeting(String name) {
        // Get the current date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
		LocalDateTime now = LocalDateTime.now();

		String dateTimeString = now.format(formatter);
		int hh = Integer.parseInt(dateTimeString);
		
		if(hh > 8 && hh < 12) {
			return "Good morning, " + name;
		}else if (hh > 12 && hh < 18 ) {
			return "Good afternoon, " + name;
		}else if ( hh > 18 && hh < 24 ){
			return "Good night, " + name;
		} else {
			return "Sleep well, " + name;
		}
		
	}		



	
	
	
}
