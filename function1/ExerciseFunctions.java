/*
Brendan Lauterborn
726004578
CSCE 111 504
*/


// Imports are not allowed in this exercise.

/**
	This exercise involves implementing several methods. Stubs for each method
	with documentation are given here. It is your task to fill out the code in
	each method body so that it runs correctly according to the documentation.

	You can run this file by compiling TestFunctions1.java
	It will call this program and run it, validating the test you choose.

	Example inputs with output are provided in the comments before each method.
	At a minimum, your solutions must pass these tests.
	Adapted by Robert Lightfoot
	from an exercise by Bruce Gooch.

	@author Your Name
	also ad your UIN.
	@version put the date here
**/
public class ExerciseFunctions{


	/**
		Boolean function returns true if the given string begins with "win",
		except the 'w' can be anything, so "win", "fin", "pin", "8in" .. all count.

		winCondition("win prizes") returns true<br>
		winCondition("pin the tail") returns true<br>
		winCondition("wit fries?") returns false<br>
		winCondition("pit viper") returns false<br>
		@param original String,
		@return true if xin is contained, were x is any charater. False otherwise.
	*/
	public static boolean winCondition(String original)
	{
		//your code here
		boolean test = false;
		if (original.length() > 2) {
			String tester = original.substring(1,3);
			if (tester.equals("in")) {
				test = true;
			}
		}
		return test;
	}//end winCondition

	/**
		Int function that returns the largest of 3 integers sent.

		maxInt(1, 2, 3) returns 3<br>
		maxInt(3, 2, 3) returns 3<br>
		maxInt(2, 5, 3) returns 5<br>
		maxInt(7, 5, 4) returns 7<br>
		@param first int number,
		@param second int number,
		@param third int number,
		@return the largest of three given int values.
	*/
   public static int maxInt(int first, int second, int third)
   {
		 int max;
		 if (first > second && first > third) {
		 	max = first;
		 }
		 else if (second > third) {
		 	max = second;
		 }
		 else {
		 	max = third;
		 }
		 return max;
   }// end maxInt

	/**
		Deciding is Water is Wet is a challenge. This code only determines if
		both values are wet.

		isWet("wet", "wet") returns true<br>
		isWet("wet", "water") returns false<br>
		isWet("water", "wet") returns false<br>
		isWet("any-string", "any-string") returns false<br>
		@param firstString String
		@param secondString String
		@return true only if both input strings are "wet".
	*/
   public static boolean isWet(String firstString, String secondString)
   {
		 boolean test = false;
		 firstString = firstString.toLowerCase();
		 secondString = secondString.toLowerCase();
		 if (firstString.equals("wet") && secondString.equals("wet")){
		 	test = true;
		 }
      return test;
   }// isWet

	/**
		If either string is nice, we return true.

		isNice("nice", "any-string") returns true<br>
		isNice("any-string", "nice") returns true<br>
		isNice("any-string", "any-string") returns false<br>
		@param firstString String
		@param secondString String
		@return true if either input string is "nice".
	*/
   public static boolean isNice(String firstString, String secondString)
   {
		 boolean test = false;
		 firstString = firstString.toLowerCase();
		 secondString = secondString.toLowerCase();
      if (firstString.equals("nice") || secondString.equals("nice")){
      	test = true;
      }
      return test;
   }//end isNice

	/**
		Given two inttegers, return whichever is closer to tem.

		In the event of a tie return 0.<br>
		Note that Math.abs(n) returns the absolute value of a number.<br>

		nearest10(8, 13) returns 8<br>
		nearest10(13, 8) returns 8<br>
		nearest10(13, 7) returns 0<br>
		@param firstNumber int number,
		@param secondNumber int number,
		@return of two int values, whichever is closer to ten.
	*/
   public static int nearest10(int firstNumber, int secondNumber)
   {
		 int closest = firstNumber;
		 int a = Math.abs(10 - firstNumber);
		 int b = Math.abs(10 - secondNumber);
		 if (a > b) {
		 	closest = secondNumber;
		 }
		 if (a - b == 0) {
		 	closest = 0;
		 }
     return closest;
   }//end nearest10

	/**
		Boolean function takes two non-negative int values as input
		and returns true if both argunents have the same last digit.

		Like numbers such as 27 and 57.<br>
		Note that the % "mod" operator computes remainders.<br>

		sameLastDigit(3, 3) returns true<br>
		sameLastDigit(7, 17) returns true<br>
		sameLastDigit(6, 17) returns false<br>
		sameLastDigit(3, 113) returns true<br>
		@param firstNumber int number,
		@param secondNumber int number,
		@return true if both argunents have the same last digit.
	*/
   public static boolean sameLastDigit(int firstNumber, int secondNumber)
   {
     boolean test = false;
		 if (firstNumber % 10 == secondNumber % 10) {
		 	test = true;
		 }
      return test;
   }// end sameLastDigit

	/**
		Fred Rogers thought 143 was a special number.

		This method returns "x loves you" if it is sent a string "I love x"
		where x can be "anything" <br>
		if the input is not of the form "I love any-thing" the function
		returns the string "Fred Rogers 143" <br>

		lovesYou("I love TAMU") returns "TAMU loves you" <br>
		lovesYou("I love Basketball") returns "Basketball loves you" <br>
		lovesYou("") returns "Fred Rogers 143" <br>
		lovesYou("any thing else") returns "Fred Rogers 143" <br>
		@param original String,
		@return given a string of the form I love any-thing" returns "any-thing loves you"
	*/
	public static String lovesYou(String original)
	{
		String returnValue = "Fred Rogers 143";
		if (original.contains("I love ")) {
	  	String tester = original.substring(0,7);
	 		if (tester.equals("I love ")) {
				returnValue = original.substring(7,original.length()) + " loves you";
			}
		}
	  return returnValue;
	}//end lovesYou

	/**
		If 22 occurs at the end or beginning of the input String remove any whitespace
		that occurs at the beginning or end of the String.

		catch22("Catch 22") returns "Catch"<br>
		catch22("22 Rifle") returns "Rifle"<br>
		catch22("I have 22 dogs and no cats.") returns "I have  dogs and no cats."<br>

		** Note this function does not need to remove whitespace inside the string<br>
		**the dog example output contains 2 spaces resulting when 22 was removed **<br>
		@param original String,
		@return Given a String, removes the characters 22 if they occur.
	*/
	public static String catch22(String original)
	{
	   String returnValue = original;
		 if (original.contains("22 ")) {
		 returnValue =	original.replace("22 ", "");
	 	 }
		 else if ( original.contains(" 22")) {
		 returnValue =original.replace(" 22", "");
		 }
		 else if (original.contains("22")) {
		 returnValue =	original.replace("22", "");
		 }
		 else {
 		 	returnValue = original;
		 }

	   return returnValue;
	}//end catch22

	/**
		formalWords will return a string with each first charater of a word capitalized.

		formalWords("hi") returns "Hi" <br>
		formalWords("This is our finest hour") returns "This Is Our Finest Hour" <br>
		@param original String
		@return given a String, that String with the first character of each input word capitalized.
	*/
	public static String formalWords(String original)
	{
		String returnValue = original;
		String[] brokenSentence = original.split(" ");

		for (int i = 0; i < brokenSentence.length; i++ ) {
			brokenSentence[i] = brokenSentence[i].substring(0,1).toUpperCase() + brokenSentence[i].substring(1).toLowerCase();
		}
		returnValue = String.join(" ",brokenSentence);
	   return returnValue;
	}// end formalWords

	/**
		deleteArticles will remove all articles in a phrase.

		deleteArticles("cat") returns "cat" <br>
		deleteArticles("a cat") returns "cat" <br>
		deleteArticles("The cat in a hat") returns "cat in hat" <br>

		** Note more strict whitespace removal required in this function ** <br>
		You can assume that replacing double-spaces with single-spaces is always OK. <br>
		@param original String,
		@return given an input String, that String with all English articles (the, an, a) removed.
	*/
	public static String deleteArticles(String original)
	{
		String returnValue = original;
		original = original.toLowerCase();
		if (original.contains("the ")) {
		returnValue =	original.replace("the ", "");
		}
		if (original.contains("a ")) {
		returnValue = returnValue.replace("a ", "");
		}
		if (original.contains("an ")) {
		returnValue =	returnValue.replace("an ", "");
		}

		return returnValue;
	}//end deleteArticles

}//end ExerciseFunctions
