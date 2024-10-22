//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
			StringBuilder sb = new StringBuilder();
			for( int i = 0; i < 10; i++){
				sb = sb.append(i );
				if (i < 9) {
					sb.append("-");
				}
			}
			System.out.println(sb.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			List<String>myListStrings = new ArrayList<String>();
			myListStrings.add("First String");
			myListStrings.add("Second String");
			myListStrings.add("Third String");
			myListStrings.add("Fourth String");
			myListStrings.add("F String");
			
			System.out.println(myListStrings.toString());
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			
			System.out.println("Shortest string so far : " + getShortestString(myListStrings) );

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			
			System.out.println("Switshed list of strings : " + switchFirstAndLast(myListStrings).toString() );

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			
			System.out.println("Concatenated string : " + concatenatedStringElements(myListStrings) );
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
			
			String searchString = "F";
			System.out.println("Strings contains " + searchString + " : " + containsStringElements(myListStrings, searchString) );

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
			
			
			List<Integer> myListIntegers = List.of(1, 2, 3, 4, 5);
			System.out.println("List of lists of Integres " + myListIntegers );
			System.out.println("List of lists of Integers " + listOfListOfIntegers(myListIntegers) );
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
			System.out.println("method8. Strings : " + myListStrings.toString());
			System.out.println("method8. Lengths : " + method8List(myListStrings).toString());
			
		// 9. Create a set of strings and add 5 values
			Set<String> mySetString = new HashSet<String>() {{
			    add("1 element of set");
			    add("2 element of set");
			    add("3 element of set");
			    add("4 element of set");
			    add("5 element of set");
			}};
			System.out.println("method9. Sets : " + mySetString.toString());

		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
			char myChar = '1';
			System.out.println("method10. Sets : " + method10(mySetString, myChar));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
			List<String> setList = new ArrayList<String>();
			setList.addAll(mySetString);
			
			System.out.println("method11. Set to List : " + setList.toString());
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
			Set<Integer> mySetInteger = new HashSet<Integer>() {{
			    add(1);
			    add(2);
			    add(3);
			    add(4);
			    add(4);
			}};
			System.out.println("method12. Even Numbers : " + method12(mySetInteger));

		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
			Map<String, String> mapOfDrinks = Map.of(
				    "cofee", "a hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub.",
				    "tea", "a hot drink made by infusing the dried crushed leaves of the tea plant in boiling water.",
				    "coke", "is a cola soft drink manufactured by the Coca-Cola Company."
				    
				);
			
			System.out.println("method13. Drinks map : " + mapOfDrinks.toString());
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
			
			System.out.println("method14. Definition of cofee : "  + method14(mapOfDrinks, "cofee"));

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
			
			System.out.println("method15. myListStrings : "  + myListStrings.toString());
			System.out.println("method15. Map counts : "  + method15(myListStrings, 'F'));

	}
	
	
	// Method 15:
	public static Map<Character, Integer> method15(List<String> listIn, char charIn) {

		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		for(String listElement : listIn) {
			if (listElement.charAt(0) == charIn) {
				results.put(charIn, 1);
			}
			
		}
		
		return results;
	}		
	
	
	// Method 14:
	public static String method14(Map<String, String> mapIn, String mapKey) {
		String mapValue = mapIn.get(mapKey);
		return mapValue;
	}	

	
	// Method 12:
	public static Set<Integer> method12(Set<Integer> setOfIntegers) {
		Set<Integer> resultSet = new HashSet<Integer>();

		for (int i : setOfIntegers) {
			if (i % 2 == 0 ) {
				resultSet.add(i);
			}
		}

		return resultSet;
	}

	
	// Method 11:
	


	// Method 10:
	// 10. Write and test a method that takes a set of strings and a character 
	//			and returns a set of strings consisting of all the strings in the
	// 			input set that start with the character parameter.
	

	public static Set<String> method10(Set<String> setOfStrings, char c) {
		Set<String> resultSet = new HashSet<String>();

		for (String string : setOfStrings) {
			if (string.charAt(0) == c) {
				resultSet.add(string);
			}
		}

		return resultSet;
	}
	
	// Method 8:
	// 8. Write and test a method that takes a list of strings 
	//			and returns a list of integers that contains the length of each string
	public static List<Integer> method8List( List<String> listOfStrings){
		List<Integer> resultList = new ArrayList<Integer>();
		for( String s : listOfStrings) {
			resultList.add(s.length());
		}
		return resultList;
	}
		
	
	// Method 7:
	// 7. Write and test a method that takes a list of integers 
	//			and returns a List<List<Integer>> with the following conditions specified
	//			for the return value:
	//		a. The first List in the returned value contains any number from the input list 
	//			that is divisible by 2
	//		b. The second List contains values from the input list that are divisible by 3
	//		c. The third containing values divisible by 5, and 
	//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	public static List<List<Integer>> listOfListOfIntegers( List<Integer> listOfIntegers) {
		
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		
		for (int i : listOfIntegers) {
			if (i % 2 == 0) {
				list1.add(i);
			}else if (i % 3 == 0) {
				list2.add(i);
			}else if (i % 5 == 0) {
				list3.add(i);
			}else {
				list4.add(i);
			}
		}
		
		 resultList.add(list1);
		 resultList.add(list2);
		 resultList.add(list3);
		 resultList.add(list4);
		 return resultList;
		 
	}	
	
	// Method 6:
	// 6. Write and test a method that takes a list of strings and a string 
	//			and returns a new list with all strings from the original list
	// 			containing the second string parameter (i.e. like a search method)
	public static List<String> containsStringElements( List<String> listOfStrings, String str ) {
		List<String> results = new ArrayList<String>();
		for (String s : listOfStrings) {
			if (s.contains(str)) {
				results.add(s);
			};
		}
		
		return results;
	}	
	
	// Method 5:
	// 5. Write and test a method that takes a list of strings 
	//			and returns a string with all the list elements concatenated to each other,
	// 			separated by a comma	
	public static String concatenatedStringElements( List<String> listOfStrings ) {
		String concatenatedString = "";
		for (String stringElement : listOfStrings) {
			concatenatedString += stringElement + ",";
		}
		concatenatedString = concatenatedString.substring(0, concatenatedString.length() - 1);
		return concatenatedString;
	}
	
	
	// Method 4:
	// 4. Write and test a method that takes a list of strings 
	//			and returns the list with the first and last element switched
	public static List<String > switchFirstAndLast( List<String> listOfStrings ) {
		
		String firstString = listOfStrings.getFirst();
		String lastString = listOfStrings.getLast();
		
		listOfStrings.set(0, lastString);
		listOfStrings.set(listOfStrings.size() - 1, firstString);
		
		return listOfStrings;
	}	
	
	
	// Method 3:
	// 3. Write and test a method that takes a list of strings 
	//			and returns the shortest string	
	public static String getShortestString(List<String> listOfStrings ) {
		String shortestString = listOfStrings.getFirst();
		for(String stringItem : listOfStrings) {
			if(stringItem.length() < shortestString.length() ) {
				shortestString = stringItem;
			}
		}
		System.out.println(shortestString);
		return shortestString;
	}
	
	

}

