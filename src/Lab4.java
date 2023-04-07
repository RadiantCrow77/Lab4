import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
public class Lab4 {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
// You would use a StringBuilder instead of String if you wanted to at some point change a String, where the 
// String data type is immutable.
//		1. a.
		StringBuilder str = new StringBuilder();
		
//		1. b. 
//		str.append('0'+"-"+'1'+"-"+'2'+"-"+'3'+"-"+'4'+"-"+'5'+"-"+'6'+"-"+'7'+"-"+'8'+"-"+'9');
//		System.out.println(str);
		
		// instructor's way:
		for (int i = 0; i<=9;i++) {
			str.append(i);
			if(i!=9) {
			str.append(i+"-"); // takes off the dash if = 9
			}
		}
		
		System.out.println(str.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
//		2. a.
		List<String> lengthStr = new ArrayList<String>();
		lengthStr.add("Peepo");
		lengthStr.add("Bingus");
		lengthStr.add("BingusBingus");
		lengthStr.add("Crysanthemum");
		lengthStr.add("Uranium-235");

		// a better way: List <String> strings = Arrays.asList();
		System.out.println(lengthStr);

		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(findshortestString(lengthStr));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		System.out.println(firstLastSwitch(lengthStr));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(concatComma(lengthStr));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		String searchWord = "Bing";
		List<String> searchResults = search(lengthStr, searchWord);
		for (String result: searchResults) {
			System.out.println("Search Result "+result);
			}
		
	
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
//	List <Integer> intList = new ArrayList<Integer>();
	// ADD MULTI ENTRIES TO A LIST AT SAME TIME
	 List <Integer> unsortedList = Arrays.asList(1,2, 3,5, 6,7,7,15,20,30, 32);
	 
	 
	 // call the method, passing in our unsorted list, assigning it to the return type
	 List<List<Integer>> sortedList = divListSort(unsortedList);
	 
	 // nested loop to iterate over outer list and inner list
	 for (List<Integer> list: sortedList){ // for each list in sorted #s
		 for(Integer number: list) {
			 System.out.println(number);
		 }
		 System.out.println("Next list: ");
		 // prints: the #s divisible by 2 in a list: 2, 6, 20, 30, 32
		 // #s div by 3: 3, 6, 15, 30
		 // #s div by 5: 5, 15, 20, 30
		 // #s indiv by any: 1, 7, 7 
		 
	 }
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println("Length of lengthStr strings: ");
		List<Integer> stringsLengths = lengthsofStrings(lengthStr);
		for (int i: stringsLengths) {
			System.out.println(i);
		}

		
		// 9. Create a set of strings and add 5 values
		Set<String> stringSet = new HashSet<String>();
		String a = "Gas ";
		String b = "Station ";
		String c = "Hotdog ";
		String d = "Smothered ";
		String e = "in Cheese";
		stringSet.add(a+' ');
		stringSet.add(b+' ');
		stringSet.add(c+' ');
		stringSet.add(d+' ');
		stringSet.add(e+' ');
		System.out.println("Hotdog hashSet: "+stringSet);		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		Set<String> startsWithS=startsWithChar(stringSet, 'S');
		System.out.println("Starts with 'S': ");
		for(String word: startsWithS){
			System.out.println(word);
			}

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println("Converting a set of strings to a list: ");
		List<String> resultingList =setToList(stringSet);
		for (String listString: resultingList) {
			System.out.println(listString);
		}

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> intSet = new HashSet<Integer>();
		for(int i = 0; i<=10;i++) {
			intSet.add(i); // adds 1-10 to the intSet
		}
		System.out.println("Set to be converted to only evens: "+intSet);
		System.out.println("Evens in the set: "+returnsEvens(intSet));
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		HashMap<String, String> dictionary = new HashMap<>(); // key/hash
		dictionary.put("U-235", "A radioactive isotope (same # of protons but different # neutrons) of Uranium.");
		dictionary.put("Nuclear Binding Energy", "Smallest amt of energy required to split a nucleus.");
		dictionary.put("Nuclear Cross Section", "Probably that a nucleus or subatomic particle will absorb/scatter/fission.");
		System.out.println(dictionary);
		

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		String keyWord ="Nuclear Cross Section";
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println("The definition of "+keyWord+" is: ");
		String value = findValue(dictionary, keyWord);
		System.out.println(value);
		
		Map<Character, Integer> counts = charAppearsCt(resultingList);
		for (Character character: counts.keySet()) { // for each key in that keyset
			System.out.println(character + " - " +counts.get(character));
		}
		
	} // Main Method Ends
//METHODS 
	
	// Method 3: method that takes a list of strings 
	//			and returns the shortest string
	public static String findshortestString(List<String> lengthStr) {
		String shortest = lengthStr.get(0); // initially first element in list
	for(String i: lengthStr) { // for each string in our long string
		// check the length of each 
		if (i.length() <shortest.length()) // if current length < shortest length, 
			shortest = i; // shortest is now that shortest length
		
	}
	return shortest;
	}
	
	
	// Method 4. Write and test a method that takes a list of strings 
	//			and returns the list with the first and last element switched
	public static List<String> firstLastSwitch(List<String> lengthStr){
		String tempFirst = lengthStr.get(0); // store the first el so it doesnt get overwritten
		lengthStr.set(0, lengthStr.get(lengthStr.size() -1)); // set 0th el to last el
		lengthStr.set(lengthStr.size()-1,tempFirst); // set last el to the temp var aka first el
		return lengthStr;
	}
	
	// Method 5. Write and test a method that takes a list of strings 
			//			and returns a string with all the list elements concatenated to each other,
			// 			separated by a comma
	public static String concatComma(List<String> lengthStr) {
		StringBuilder str = new StringBuilder();
		
		for (String i: lengthStr) {
		
			str.append(i+" , "); // takes off the dash if = 9
			
		}
		return str.toString();
		
	}
	
	// Method 6. Write and test a method that takes a list of strings and a string 
	//			and returns a new list with all strings from the original list
	// 			containing the second string parameter (i.e. like a search method)
	public static List<String> search(List<String> lengthStr, String searchWord){
		List<String> results = new ArrayList<String>();
		for(String i: lengthStr) {
		if (i.contains(searchWord)) {
			results.add(i);
		}
	
	}
		return results;
	}
	
	// 7. Write and test a method that takes a list of integers 
	//			and returns a List<List<Integer>> with the following conditions specified
	//			for the return value:
	//		a. The first List in the returned value contains any number from the input list 
	//			that is divisible by 2
	//		b. The second List contains values from the input list that are divisible by 3
	//		c. The third containing values divisible by 5, and 
	//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	
	public static List<List<Integer>> divListSort(List<Integer> unsortedList){ // returns a list of lists of integers
		List<List<Integer>> results = new ArrayList<List<Integer>>(); // list of lists
		
		
		// 4 non-nested lists
	
		results.add(new ArrayList<Integer>());

		results.add(new ArrayList<Integer>());

		results.add(new ArrayList<Integer>());
		
		results.add(new ArrayList<Integer>());
		
		
		for (int i: unsortedList) {
			// %2==0
			if(i%2 == 0) { 
				results.get(0).add(i); // add to 0th list
			}
			// %3==0
			if(i%3 == 0) { 
				results.get(1).add(i); // add to 1st list
			}
			// %5==0
			if(i%5 == 0) {
				results.get(2).add(i); // add to 2nd list
			}
			// not divisible by any??
			if(i%2!=0 && i%3!=0 && i%5!=0)
			{
				results.get(3).add(i); // add to final list
			}
			
		}
		// return the list of lists of integers
		return results;
	}
	
	// 8. Write and test a method that takes a list of strings 
			//			and returns a list of integers that contains the length of each string
	
	public static List<Integer> lengthsofStrings(List<String> lengthStr){
		List<Integer> stringLengths = new ArrayList<Integer>();
		for(String string: lengthStr) {
			stringLengths.add(string.length());
			
		}
		return stringLengths;
	}
	
	// 10. Write and test a method that takes a set of strings and a character 
			//			and returns a set of strings consisting of all the strings in the
			// 			input set that start with the character parameter.
	
	public static Set<String> startsWithChar(Set<String> stringSet, char c1){
		Set<String> stringsStartWith = new HashSet<String>();
		
		// iterate over input set
		for (String string: stringSet) {
			if(string.charAt(0)==c1) { // if at 0th index, the value = our char
				stringsStartWith.add(string); // add that string to our set
			}
		}
		return stringsStartWith;
		
	
		
	}
	
	// 11. Write and test a method that takes a set of strings 
	//			and returns a list of the same strings
	public static List<String> setToList(Set<String> stringSet){ // takes in a set of strings
		List<String> result = new ArrayList<String>(); // list that we will convert the set to
		for(String string: stringSet ) {
			// place the set in the list
			result.add(string);
		}
		return result; // return that list
	}
	
	// 12. Write and test a method that takes a set of integers 
	//			and returns a new set of integers containing only even numbers 
	//			from the original set
	public static Set<Integer> returnsEvens(Set<Integer> intSet){
		Set<Integer> onlyEvens = new HashSet<Integer>();
		for(int i: intSet) {
			if (i%2==0) {
				// add to our empty set
				onlyEvens.add(i);
			}
		}
		// return set
		return onlyEvens;
	}
	
	// 14. Write and test a method that takes a Map<String, String> and a string 
	// 			and returns the value for a key in the map that matches the
	// 			string parameter (i.e. like a language dictionary lookup)
	public static String findValue(HashMap<String, String> map, String string) {
	for (String key: map.keySet()) {
		if(key.equals(string)) {
			return map.get(key);
		}
	}
		
		return ""; // returns blank string if no keys match
	}

	// 15. Write and test a method that takes a List<String> 
			//			and returns a Map<Character, Integer> containing a count of 
			//			all the strings that start with a given character
	public static Map<Character, Integer> charAppearsCt(List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
		
		
		for(String string: list) {
			char c= string.charAt(0); // grab the character at the first position
			if(results.get(c) == null ) { // doesn't already exist, new entry..
				results.put(c, 1); // add it, starting at 1
			}else {
				results.put(c, results.get(c)+1); // increment character by 1 if exists
			}
		}
		return results;
	}

	

	} // end this program


