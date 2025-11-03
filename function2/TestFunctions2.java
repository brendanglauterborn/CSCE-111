import java.util.Arrays;
/*

CSCE 111 Functions Exercise 2

Updated by Robert Lightfoot
Adapted from Bruce Gooch

This file is to test your functions.
*/
public class TestFunctions2
{
	public static void main(String[] args)
	{
		Functions2 myFunctions = new Functions2();
		//you can turn on or off printing errors.
		boolean printErrors = true;
		String[] functionNames = {"hasInt", "hasString", "maxInt", "firstString",
		            "longestString", "placeInt", "placeString", "array2Ints",
								"array2Strings", "sort3Ints", "sort3Strings", "merge2Ints", "merge2Strings",
								"duplicateInts", "duplicateStrings", "removeDuplicateInts",
								"removeDuplicateStrings", "compare2IntArrays", "compare2StringArrays"};


				//this is the function you are testing. It is the only one that will be called.
				   // TESTremoveDuplicateInts(printErrors, myFunctions, functionNames[15]);

	       if(true)  // Copy and paste the functions you want to test outside this if block
           {          // In the TEST methods first parameter true prints return values, false only prints pass/fail

				   TESThasInt(printErrors, myFunctions, functionNames[0]);
				   TESThasString(printErrors, myFunctions, functionNames[1]);

				   TESTmaxInt(printErrors, myFunctions, functionNames[2]);
           TESTfirstString(printErrors, myFunctions, functionNames[3]);
           TESTlongestString(printErrors, myFunctions, functionNames[4]);
           TESTplaceInt(printErrors, myFunctions, functionNames[5]);
				   TESTplaceString(printErrors, myFunctions, functionNames[6]);

			     TESTarray2Ints(printErrors, myFunctions, functionNames[7]);
				   TESTarray2Strings(printErrors, myFunctions, functionNames[8]);

				   TESTsort3Ints(printErrors, myFunctions, functionNames[9]);
				   TESTsort3Strings(printErrors, myFunctions, functionNames[10]);

					 TESTmerge2Ints(printErrors, myFunctions, functionNames[11]);
				   TESTmerge2Strings(printErrors, myFunctions, functionNames[12]);

				   TESTduplicateInts(printErrors, myFunctions, functionNames[13]);
				   TESTduplicateStrings(printErrors, myFunctions, functionNames[14]);

				   TESTremoveDuplicateInts(printErrors, myFunctions, functionNames[15]);
				   TESTremoveDuplicateStrings(printErrors, myFunctions, functionNames[16]);

				   TESTcompare2IntArrays(printErrors, myFunctions, functionNames[17]);
				   TESTcompare2StringArrays(printErrors, myFunctions, functionNames[18]);

				 }//end if
	} // End Main

	// other than Color items in the next few lines, you do not need to edit below this line.
	// altering things below this line might make things pass for your testing, but I will use a different
	// version to do my testing.

	//if you have color output (mac), use these and comment out the three below These
	//
	//public static final String ANSI_RESET = "\u001B[0m";
	//public static final String ANSI_RED = "\u001B[31m";
	//public static final String ANSI_GREEN = "\u001B[32m";

	//if you do not have color output(pc) on use these
	public static final String ANSI_RESET = "";
	public static final String ANSI_RED = "";
	public static final String ANSI_GREEN = "";


	public static void TESThasInt(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if( myFunctions.hasInt(7, new int [] {1, 7, 3})  &&
		   !myFunctions.hasInt(3, new int [] {1, 2, 4, 5}) &&
		    myFunctions.hasInt(4, new int [] {5, 3, 6, 1, 4}) &&
				myFunctions.hasInt(22, new int [] {1, 7, 9, 22, 33, 44, 55}))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.hasInt(7, new int [] {1, 7, 3}) );  // true
			System.out.println(myFunctions.hasInt(3, new int [] {1, 2, 4, 5}));//  false
			System.out.println(myFunctions.hasInt(4, new int [] {5, 3, 6, 1, 4})); //  true
			System.out.println(); System.out.println();
		}
	}// end TESThasInt



	/*
	Given a String and an array of Strings, return true if the array contains the String, false otherwise.
	Note: Capital letters count

	hasString("fizz", {"fizz", "buzz", "bang", "boom"})  true
	hasString("Fizz", {"fizz", "buzz", "bang", "boom"})  false
	hasString("fizz", {"buzz", "bang", "boom"})  false
	hasString("buzz", {"1", "2", "$$#%^", "pico"})  false
	hasString("4", {"5", "3", "6", "1", "4"})  true
	*/
	public static void TESThasString(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if( myFunctions.hasString("fizz", new String [] {"fizz", "buzz", "bang", "boom"}) &&
		   !myFunctions.hasString("Fizz", new String [] {"fizz", "buzz", "bang", "boom"}) &&
		   !myFunctions.hasString("fizz", new String [] {"buzz", "bang", "boom"}) &&
		   !myFunctions.hasString("buzz", new String [] {"1", "2", "$$#%^", "pico"}) &&
		    myFunctions.hasString("4",    new String [] {"5", "3", "6", "1", "4"}))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.hasString("fizz", new String [] {"fizz", "buzz", "bang", "boom"}));  //   true
			System.out.println(myFunctions.hasString("Fizz", new String [] {"fizz", "buzz", "bang", "boom"}));//   false
			System.out.println(myFunctions.hasString("fizz", new String [] {"buzz", "bang", "boom"}));//   false
			System.out.println(myFunctions.hasString("buzz", new String [] {"1", "2", "$$#%^", "pico"})); //   false
		  System.out.println(myFunctions.hasString("4",    new String [] {"5", "3", "6", "1", "4"}));  //   true
		}
	}// end TESThasString


/*
Given an an array of ints, return the largest int in the array.

maxInt({1, 7, 3})   7
maxInt({1, 2, 4, 5})   5
maxInt({5, 3, 6, 1, 4})   6
*/
public static void TESTmaxInt(Boolean printValues, Functions2 myFunctions, String methodName)
{
	if((myFunctions.maxInt(new int [] {1, 7, 3}) == 7) &&
	   (myFunctions.maxInt(new int [] {1, 2, 4, 5}) == 5) &&
	   (myFunctions.maxInt(new int [] {5, 3, 6, 1, 4}) == 6))
	{
		System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
	}
	else
	{
	   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
	}
	System.out.println();
	if(printValues)
	{
	  System.out.println(myFunctions.maxInt(new int [] {1, 7, 3}));  //   7
		System.out.println(myFunctions.maxInt(new int [] {1, 2, 4, 5}));//   5
		System.out.println(myFunctions.maxInt(new int [] {5, 3, 6, 1, 4}));//   6
		System.out.println(); System.out.println();
	}
}

/*
Given an array of Strings, return the first String in alphabetical order.
Note: Capital letters count

firstString({"fizz", "buzz", "bang", "boom"})   "bang"
firstString({"Fizz", "buzz", "bang", "boom"})   "fizz"
firstString({"1", "2", "$$#%^", "pico"})   "$$#%^"
firstString({"5", "3", "6", "1", "4"})   "1"
*/
public static void TESTfirstString(Boolean printValues, Functions2 myFunctions, String methodName)
{
	if((myFunctions.firstString(new String [] {"fizz", "buzz", "bang", "boom"}).equals("bang")) &&
	   (myFunctions.firstString(new String [] {"Fizz", "buzz", "bang", "boom"}).equals("Fizz")) &&
	   (myFunctions.firstString(new String [] {"1", "2", "$$#%^", "pico"}).equals("$$#%^")) &&
	   (myFunctions.firstString(new String [] {"5", "3", "6", "1", "4"}).equals("1")))
	{
		System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
	}
	else
	{
	   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
	}
	System.out.println();
	if(printValues)
	{
	  System.out.println(myFunctions.firstString(new String [] {"fizz", "buzz", "bang", "boom"}));  //   "bang"
		System.out.println(myFunctions.firstString(new String [] {"Fizz", "buzz", "bang", "boom"}));//   "fizz"
		System.out.println(myFunctions.firstString(new String [] {"1", "2", "$$#%^", "pico"}));//   "1"
		System.out.println(myFunctions.firstString(new String [] {"5", "3", "6", "1", "4"}));//   "1"

		System.out.println(); System.out.println();
	}
}


	/*
	Given an array of Strings, return an array with the length of the longest string

	longestString({"a", "big", "fat", "cat"})   3
	longestString({"Fizz", "buzz", "bang", "boom"})   4
	longestString({"1", "2", "$$#%^", "pico"})   5
	longestString({"5", "3", "6", "1", "4"})   1
	longestString({"These", "Are", "the", "Good", "Old", "days"})   5
	*/
	public static void TESTlongestString(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((myFunctions.longestString(new String [] {"a", "big", "fat", "cat"}) == 3) &&
		   (myFunctions.longestString(new String [] {"Fizz", "buzz", "bang", "boom"}) == 4) &&
		   (myFunctions.longestString(new String [] {"1", "2", "$$#%^", "pico"}) == 5) &&
		   (myFunctions.longestString(new String [] {"5", "3", "6", "1", "4"}) == 1) &&
		   (myFunctions.longestString(new String [] {"These", "Are", "the", "Good", "Old", "days"}) == 5))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.longestString(new String [] {"a", "big", "fat", "cat"}));//   3
			System.out.println(myFunctions.longestString(new String [] {"Fizz", "buzz", "bang", "boom"}));//   4
			System.out.println(myFunctions.longestString(new String [] {"1", "2", "$$#%^", "pico"}));//   5
			System.out.println(myFunctions.longestString(new String [] {"5", "3", "6", "1", "4"}));//   1
			System.out.println(myFunctions.longestString(new String [] {"These", "Are", "the", "Good", "Old", "days"}));//   5
			System.out.println(); System.out.println();
		}
	}//end TESTlongestString


	/*
	Given an int and an array of ints, return -1 if the array does not contain the int
	Otherwise return the position of the int in the arrary.

	placeInt(7, {7, 3})  0
	placeInt(7, {2, 7, 3})   1
	placeInt(3, {1, 2, 4, 5})   -1
	placeInt(4, {5, 3, 6, 1, 4})   4
	*/
	public static void TESTplaceInt(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((myFunctions.placeInt(7, new int [] {7, 3}) == 0) &&
		   (myFunctions.placeInt(7, new int [] {2, 7, 3}) == 1) &&
		   (myFunctions.placeInt(3, new int [] {1, 2, 4, 5}) == -1) &&
		   (myFunctions.placeInt(4, new int [] {5, 3, 6, 1, 4}) == 4))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.placeInt(7, new int [] {7, 3}));//   0
			System.out.println(myFunctions.placeInt(7, new int [] {2, 7, 3}));//   1
			System.out.println(myFunctions.placeInt(3, new int [] {1, 2, 4, 5}));//   -1
			System.out.println(myFunctions.placeInt(4, new int [] {5, 3, 6, 1, 4}));//   4
			System.out.println(); System.out.println();
		}
	}// end TESTplaceInt



	/*
	Given a String and an array of Strings, return -1 if the array does not contain the String
	Otherwise return the position of the String in the arrary.

	placeString("fizz", {"fizz", "buzz", "bang", "boom"})   0
	placeString("buzz", {"fizz", "buzz", "bang", "boom"})   1
	placeString("bang", {"fizz", "buzz", "bang", "boom"})   2
	placeString("boom", {"fizz", "buzz", "bang", "boom"})   3
	placeString("Fizz", {"fizz", "buzz", "bang", "boom"})   -1
	placeString("fizz", {"buzz", "bang", "boom"})   -1
	placeString("buzz", {"1", "2", "$$#%^", "pico"})   -1
	placeString("4", {"5", "3", "6", "1", "4"})   4
	*/
	public static void TESTplaceString(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((myFunctions.placeString("fizz", new String [] {"fizz", "buzz", "bang", "boom"}) == 0) &&
		   (myFunctions.placeString("buzz", new String [] {"fizz", "buzz", "bang", "boom"}) == 1) &&
		   (myFunctions.placeString("bang", new String [] {"fizz", "buzz", "bang", "boom"}) == 2) &&
		   (myFunctions.placeString("boom", new String [] {"fizz", "buzz", "bang", "boom"}) == 3) &&
		   (myFunctions.placeString("Fizz", new String [] {"fizz", "buzz", "bang", "boom"}) == -1) &&
		   (myFunctions.placeString("fizz", new String [] {"buzz", "bang", "boom"}) == -1) &&
		   (myFunctions.placeString("buzz", new String [] {"1", "2", "$$#%^", "pico"}) == -1) &&
		   (myFunctions.placeString("4",    new String [] {"5", "3", "6", "1", "4"}) == 4))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.placeString("fizz", new String [] {"fizz", "buzz", "bang", "boom"}));//   0
			System.out.println(myFunctions.placeString("buzz", new String [] {"fizz", "buzz", "bang", "boom"}));//   1
			System.out.println(myFunctions.placeString("bang", new String [] {"fizz", "buzz", "bang", "boom"}));//   2
		  System.out.println(myFunctions.placeString("boom", new String [] {"fizz", "buzz", "bang", "boom"}));//   3
			System.out.println(myFunctions.placeString("Fizz", new String [] {"fizz", "buzz", "bang", "boom"}));//   -1
			System.out.println(myFunctions.placeString("fizz", new String [] {"buzz", "bang", "boom"}));//   -1
		  System.out.println(myFunctions.placeString("buzz", new String [] {"1", "2", "$$#%^", "pico"}));//   -1
			System.out.println(myFunctions.placeString("4",    new String [] {"5", "3", "6", "1", "4"}));//   4
			System.out.println(); System.out.println();
		}
	}// end TESTplaceString

	/*
	Given two ints, return an int array containing the ints in value order.

	array2Ints(7, 3)   {3, 7}
	array2Ints(7, 7)   {3, 7}
	array2Ints(3, 7)   {3, 7}
	array2Ints(3, -4)   {-4, 3}
	*/
	public static void TESTarray2Ints(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.array2Ints(7, 3),  new int [] {3, 7})) &&
		   (Arrays.equals(myFunctions.array2Ints(7, 7),  new int [] {7, 7})) &&
		   (Arrays.equals(myFunctions.array2Ints(3, 7),  new int [] {3, 7})) &&
		   (Arrays.equals(myFunctions.array2Ints(3, -4), new int [] {-4, 3})))

		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.array2Ints(7, 3))); // {3, 7}
			System.out.println(Arrays.toString(myFunctions.array2Ints(7, 3))); // {3, 7}
			System.out.println(Arrays.toString(myFunctions.array2Ints(7, 3))); // {3, 7}
			System.out.println(Arrays.toString(myFunctions.array2Ints(3, -4))); // {-4, 3}
			System.out.println(); System.out.println();
		}
	}// end TESTarray2Ints

	/*
	Given two Strings return a String array containing the strings in alphabetical order.
	Note: Capital letters count

	array2Strings("washington", "irving")  {"irving", "washington"}
	array2Strings("washington", "Irving")  {"Irving", "washington"}
	array2Strings("Washington", "irving")  {"Washington", "irving"}
	array2Strings("washington", "Washington")  {"Washington", "washington"}
	*/
	public static void TESTarray2Strings(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.array2Strings("washington", "irving"),  new String [] {"irving", "washington"})) &&
		   (Arrays.equals(myFunctions.array2Strings("washington", "Irving"),  new String [] {"Irving", "washington"})) &&
		   (Arrays.equals(myFunctions.array2Strings("Washington", "irving"),  new String [] {"Washington", "irving"})) &&
		   (Arrays.equals(myFunctions.array2Strings("washington", "Washington"), new String [] {"Washington", "washington"})))

		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.array2Strings("washington", "irving"))); //  {"irving", "washington"}
			System.out.println(Arrays.toString(myFunctions.array2Strings("washington", "Irving"))); // {"Irving", "washington"}
			System.out.println(Arrays.toString(myFunctions.array2Strings("Washington", "irving"))); // {"Washington", "irving"}
			System.out.println(Arrays.toString(myFunctions.array2Strings("washington", "Washington"))); // {"Washington", "washington"}
			System.out.println(); System.out.println();
		}
	}//end TESTarray2Strings

	/*
	Given an int and an array of two ints, return an array of 3 ints sorted in value order.

	sort3Ints(5, {3, 7})    {3, 5, 7}
	sort3Ints(7, {5, 3})    {3, 5, 7}
	sort3Ints(3, {3, 3})    {3, 3, 3}
	sort3Ints(3, {3, -4})   {-4, 3, 3}
	*/
	public static void TESTsort3Ints(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.sort3Ints(5, new int [] {3, 7}),  new int [] {3, 5, 7})) &&
		   (Arrays.equals(myFunctions.sort3Ints(7, new int [] {5, 3}),  new int [] {3, 5, 7})) &&
		   (Arrays.equals(myFunctions.sort3Ints(3, new int [] {3, 3}),  new int [] {3, 3, 3})) &&
		   (Arrays.equals(myFunctions.sort3Ints(3, new int [] {3, -4}), new int [] {-4, 3, 3})))

		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.sort3Ints(5, new int [] {3, 7}))); // {3, 5, 7}
			System.out.println(Arrays.toString(myFunctions.sort3Ints(7, new int [] {5, 3}))); // {3, 5, 7}
			System.out.println(Arrays.toString(myFunctions.sort3Ints(3, new int [] {3, 3}))); // {3, 3, 3}
			System.out.println(Arrays.toString(myFunctions.sort3Ints(3, new int [] {3, -4}))); // {-4, 3, 3}
			System.out.println(); System.out.println();
		}
	}// end TESTsort3Ints

	/*
	Given a String and an array of two Strings,
	return a three String array containing the strings in alphabetical order.
	Note: Capital letters count

	sort3Strings("wallace", {"washington", "irving"})  {"irving", "wallace", "washington"}
	sort3Strings("wallace", {"washington", "Irving"})  {"Irving", "wallace", "washington"}
	sort3Strings("Washington", {"irving", "wallace"})  {"Washington", "irving", "wallace"}
	sort3Strings("washington", {"washington", "Washington"})  {"Washington", "washington", "washington"}
	*/
	public static void TESTsort3Strings(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.sort3Strings("wallace",    new String [] {"washington", "irving"}),      new String [] {"irving", "wallace", "washington"})) &&
		   (Arrays.equals(myFunctions.sort3Strings("wallace",    new String [] {"washington", "Irving"}),      new String [] {"Irving", "wallace", "washington"})) &&
		   (Arrays.equals(myFunctions.sort3Strings("Washington", new String [] {"irving", "wallace"}),         new String [] {"Washington", "irving", "wallace"})) &&
		   (Arrays.equals(myFunctions.sort3Strings("washington", new String [] {"washington", "Washington"}),  new String [] {"Washington", "washington", "washington"})))

		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.sort3Strings("wallace",    new String [] {"washington", "irving"}))); // "irving", "wallace", "washington"}
			System.out.println(Arrays.toString(myFunctions.sort3Strings("wallace",    new String [] {"washington", "Irving"}))); // {"Irving", "wallace", "washington"}
			System.out.println(Arrays.toString(myFunctions.sort3Strings("Washington", new String [] {"irving", "wallace"}))); // {"Washington", "irving", "wallace"}
			System.out.println(Arrays.toString(myFunctions.sort3Strings("washington", new String [] {"washington", "Washington"}))); // {"Washington", "washington", "washington"}
			System.out.println(); System.out.println();
		}
	}// end TESTsort3Strings

	/*
	Given two int arrays of length two, return a length four int array containing the ints in value order.
	Hint: use your array2Ints method

	merge2Ints({3, 4}, {1, 2})   {1, 2, 3, 4}
	merge2Ints({1, 2}, {3, 4})   {1, 2, 3, 4}
	merge2Ints({7, 7}, {7, 7})   {7, 7, 7, 7}
	*/
	public static void TESTmerge2Ints(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.merge2Ints(new int [] {3, 4}, new int [] {1, 2}),  new int [] {1, 2, 3, 4})) &&
		   (Arrays.equals(myFunctions.merge2Ints(new int [] {1, 2}, new int [] {3, 4}),  new int [] {1, 2, 3, 4})) &&
		   (Arrays.equals(myFunctions.merge2Ints(new int [] {7, 7}, new int [] {7, 7}),  new int [] {7, 7, 7, 7})))
		   {
			  System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		   }
		   else
		  {
		    System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		  }
		  System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.merge2Ints(new int [] {3, 4}, new int [] {1, 2}))); //  {1, 2, 3, 4}
			System.out.println(Arrays.toString(myFunctions.merge2Ints(new int [] {1, 2}, new int [] {3, 4}))); // {1, 2, 3, 4}
			System.out.println(Arrays.toString(myFunctions.merge2Ints(new int [] {7, 7}, new int [] {7, 7}))); // {7, 7, 7, 7}
			System.out.println(); System.out.println();
		}
	}// end TESTmerge2Ints

	/*
	Given two Strings return a String array containing the strings in alphabetical order.
	Note: Capital letters count
	Hint: use your array2Strings method

	merge2Strings({"a", "b"}, {"c", "d"})  {"a", "b", "c", "d"}
	merge2Strings({"a", "b"}, {"c", "D"})  {"D", "a", "b", "c"}
	merge2Strings({"d", "c"}, {"b", "a"})  {"a", "b", "c", "d"}
	merge2Strings({"My", "Dear"}, {"Aunt", "Sally"})  {"Aunt", "Dear", "My", "Sally"}
	merge2Strings({"my", "dear"}, {"Aunt", "Sally"})  {"Aunt", "Sally", "dear", "my"}
	merge2Strings({"Irving", "washington"}, {"Irving", "berlin"})   {"Irving", "Irving", "berlin", "washington"}
	*/
	public static void TESTmerge2Strings(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.merge2Strings(new String [] {"a", "b"},     new String [] {"c", "d"}),       new String [] {"a", "b", "c", "d"})) &&
		   (Arrays.equals(myFunctions.merge2Strings(new String [] {"a", "b"},     new String [] {"c", "D"}),        new String [] {"D", "a", "b", "c"})) &&
		   (Arrays.equals(myFunctions.merge2Strings(new String [] {"d", "c"},     new String [] {"b", "a"}),        new String [] {"a", "b", "c", "d"})) &&
		   (Arrays.equals(myFunctions.merge2Strings(new String [] {"My", "Dear"}, new String [] {"Aunt", "Sally"}), new String [] {"Aunt", "Dear", "My", "Sally"})) &&
		   (Arrays.equals(myFunctions.merge2Strings(new String [] {"my", "dear"}, new String [] {"Aunt", "Sally"}), new String [] {"Aunt", "Sally", "dear", "my"})) &&
		   (Arrays.equals(myFunctions.merge2Strings(new String [] {"Irving", "washington"}, new String [] {"Irving", "berlin"}),  new String [] {"Irving", "Irving", "berlin", "washington"})))

		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		  System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"a", "b"},     new String [] {"c", "d"}))); // {"a", "b", "c", "d"}
			System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"a", "b"},     new String [] {"c", "D"}))); // {"D", "a", "b", "c"}
			System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"d", "c"},     new String [] {"b", "a"}))); // {"a", "b", "c", "d"}
			System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"My", "Dear"}, new String [] {"Aunt", "Sally"}))); //  {"Aunt", "Dear", "My", "Sally"}
			System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"my", "dear"}, new String [] {"Aunt", "Sally"}))); //  {"Aunt", "Sally", "dear", "my"}
			System.out.println(Arrays.toString(myFunctions.merge2Strings(new String [] {"Irving", "washington"}, new String [] {"Irving", "berlin"}))); // {"Irving", "Irving", "berlin", "washington"}
			System.out.println(); System.out.println();
		}
	}//end TESTmerge2Strings

	/*
	Given an int array, return true if the array contains duplicate values.

	duplicateInts({3})   false
	duplicateInts({1, 2})   false
	duplicateInts({7, 7})   true
	duplicateInts({1, 2, 3, 4, 5})   false
	duplicateInts({1, 2, 3, 2, 4, 5})   true
	*/
	public static void TESTduplicateInts(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if(!myFunctions.duplicateInts(new int [] {3}) &&
		   !myFunctions.duplicateInts(new int [] {1, 2}) &&
		   myFunctions.duplicateInts(new int [] {7, 7}) &&
		   !myFunctions.duplicateInts(new int [] {1, 2, 3, 4, 5}) &&
		   myFunctions.duplicateInts(new int [] {1, 2, 3, 2, 4, 5}))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		  System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.duplicateInts(new int [] {3}));  //  false
			System.out.println(myFunctions.duplicateInts(new int [] {1, 2}));//  false
	    System.out.println(myFunctions.duplicateInts(new int [] {7, 7}));  //  true
			System.out.println(myFunctions.duplicateInts(new int [] {1, 2, 3, 4, 5}));  //  false
			System.out.println(myFunctions.duplicateInts(new int [] {1, 2, 3, 2, 4, 5}));  //  true
			System.out.println(); System.out.println();
		}
	}//end TESTduplicateInts

	/*
	Given a String array, return true if the array contains duplicate values.
	Note: Capital letters count

	duplicateStrings({"a"})  false
	duplicateStrings({"a", "b", "c", "d"})  false
	duplicateStrings({"a", "a"})   true
	duplicateStrings({"A", "a"})   false
	duplicateStrings({"these", "are", "the", "times"})  false
	duplicateStrings({"these", "are", "the", "times", "they", "are"})  true
	*/
	public static void TESTduplicateStrings(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if(!myFunctions.duplicateStrings(new String [] {"a"}) &&
		   !myFunctions.duplicateStrings(new String [] {"a", "b", "c", "d"}) &&
		    myFunctions.duplicateStrings(new String [] {"a", "a"}) &&
		   !myFunctions.duplicateStrings(new String [] {"A", "a"}) &&
		   !myFunctions.duplicateStrings(new String [] {"these", "are", "the", "times"}) &&
		    myFunctions.duplicateStrings(new String [] {"these", "are", "the", "times", "they", "are"}))
		{
			System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.duplicateStrings(new String [] {"a"}));  //  false
			System.out.println(myFunctions.duplicateStrings(new String [] {"a", "b", "c", "d"}));//  false
	    System.out.println(myFunctions.duplicateStrings(new String [] {"a", "a"}));  //  true
			System.out.println(myFunctions.duplicateStrings(new String [] {"A", "a"}));  //  false
			System.out.println(myFunctions.duplicateStrings(new String [] {"these", "are", "the", "times"}));  //  false
			System.out.println(myFunctions.duplicateStrings(new String [] {"these", "are", "the", "times", "they", "are"}));  //  true
			System.out.println(); System.out.println();
		}
	}//end TESTduplicateStrings

	/*
	Given an int array, return an int array with duplicate ints removed if the array contains duplicate values.

	removeDuplicateInts({3})   {3}
	removeDuplicateInts({1, 2})   {1, 2}
	removeDuplicateInts({7, 7})   {7}
	removeDuplicateInts({1, 7, 1, 7, 1})   {1, 7}
	removeDuplicateInts({1, 2, 3, 4, 5})   {1, 2, 3, 4, 5}
	removeDuplicateInts({1, 2, 3, 2, 4, 2, 5, 2})   {1, 2, 3, 4, 5}
	*/
	public static void TESTremoveDuplicateInts(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.removeDuplicateInts(new int [] {3}),     new int [] {3})) &&
		   (Arrays.equals(myFunctions.removeDuplicateInts(new int [] {1, 2}),  new int [] {1, 2})) &&
		   (Arrays.equals(myFunctions.removeDuplicateInts(new int [] {7, 7}),  new int [] {7})) &&
		   (Arrays.equals(myFunctions.removeDuplicateInts(new int [] {1, 7, 1, 7, 1}),  new int [] {1, 7})) &&
		   (Arrays.equals(myFunctions.removeDuplicateInts(new int [] {1, 2, 3, 4, 5}),   new int [] {1, 2, 3, 4, 5})) &&
		   (Arrays.equals(myFunctions.removeDuplicateInts(new int [] {1, 2, 3, 2, 4, 2, 5, 2}),  new int [] {1, 2, 3, 4, 5})))
		   {
			  System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		   }
		   else
		  {
		     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		  }
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {3}))); //  {3}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {1, 2}))); // {1, 2}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {7, 7}))); // {7}
		  System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {1, 7, 1, 7, 1}))); //  {1, 7}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {1, 2, 3, 4, 5}))); // {1, 2, 3, 4, 5}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateInts(new int [] {1, 2, 3, 2, 4, 2, 5, 2}))); // {1, 2, 3, 2, 4, 2, 5, 2}
			System.out.println(); System.out.println();
		}
	}//TESTremoveDuplicateInts

	/*
	Given a String array, return an String array with duplicate Strings removed if the array contains duplicate values.
	Note: Capital letters count

	removeDuplicateStrings({"a"})  {"a"}
	removeDuplicateStrings({"a", "b", "c", "d"})  {"a", "b", "c", "d"}
	removeDuplicateStrings({"a", "a"})   {"a"}
	removeDuplicateStrings({"A", "a"})   {"A", "a"}
	removeDuplicateStrings({"these", "are", "the", "times"})  {"these", "are", "the", "times"}
	removeDuplicateStrings({"these", "times", "are", "the", "times", "they", "are"})  {"these", "times", "are", "the", "they"})
	*/
	public static void TESTremoveDuplicateStrings(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if((Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"a"}),     new String [] {"a"})) &&
		   (Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"a", "b", "c", "d"}),  new String [] {"a", "b", "c", "d"})) &&
		   (Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"a", "a"}),  new String [] {"a"})) &&
		   (Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"A", "a"}),  new String [] {"A", "a"})) &&
		   (Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"these", "are", "the", "times"}),   new String [] {"these", "are", "the", "times"})) &&
		   (Arrays.equals(myFunctions.removeDuplicateStrings(new String [] {"these", "times", "are", "the", "times", "they", "are"}),  new String [] {"these", "times", "are", "the", "they"})))
		   {
			  System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		   }
		   else
		  {
		    System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		  }
		System.out.println();
		if(printValues)
		{
		  System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"a"}))); //  {3}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"a", "b", "c", "d"}))); // {1, 2}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"a", "a"}))); // {7}
		  System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"A", "a"}))); //  {1, 7}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"these", "are", "the", "times"}))); // {1, 2, 3, 4, 5}
			System.out.println(Arrays.toString(myFunctions.removeDuplicateStrings(new String [] {"these", "times", "are", "the", "times", "they", "are"}))); // {1, 2, 3, 2, 4, 2, 5, 2}
			System.out.println(); System.out.println();
		}
	}//end TESTremoveDuplicateStrings

	/*
	Given two int arrays return true if the arrays contain the same values in the same order.
	Note: Order matters, see the third example

	compare2IntArrays({3, 4}, {1})  false
	compare2IntArrays({1, 2}, {1, 2})  true
	compare2IntArrays({1, 2}, {2, 1})  false
	compare2IntArrays({1, 2, 3, 4}, {1, 2, 3, 4})  true
	*/
	public static void TESTcompare2IntArrays(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if(!myFunctions.compare2IntArrays(new int [] {3, 4}, new int [] {1}) &&
		    myFunctions.compare2IntArrays(new int [] {1, 2}, new int [] {1, 2}) &&
		   !myFunctions.compare2IntArrays(new int [] {3, 4}, new int [] {1}) &&
		    myFunctions.compare2IntArrays(new int [] {1, 2, 3, 4}, new int [] {1, 2, 3, 4}))
		{
		System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.compare2IntArrays(new int [] {3, 4}, new int [] {1}));  //  false
			System.out.println(myFunctions.compare2IntArrays(new int [] {1, 2}, new int [] {1, 2}));//  true
	    System.out.println(myFunctions.compare2IntArrays(new int [] {3, 4}, new int [] {1}));  //  false
			System.out.println(myFunctions.compare2IntArrays(new int [] {1, 2, 3, 4}, new int [] {1, 2, 3, 4}));  //  true
			System.out.println(); System.out.println();
		}
	}//end TESTcompare2IntArrays

	/*
	Given two String arrays return true if the arrays contain the same values in the same order.
	Note: Order matters, see the forth example
	Note: Capatil letters matter, see the final example

	compare2StringArrays({"and"}, {"or"})   false
	compare2StringArrays({"and", "but"}, {"or"})   false
	compare2StringArrays({"a", "b", "c", "d"}, {"a", "b", "c", "d"})   true
	compare2StringArrays({"a", "b", "c", "d"}, {"d", "c", "b", "d"})   false
	compare2StringArrays({"a", "b", "c", "d"}, {"A", "b", "C", "d"})   false
	compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "Sally"})  true
	compare2StringArrays({"Aunt", "Sally"}, {"Aunt", "sally"})  false
	*/
	public static void TESTcompare2StringArrays(Boolean printValues, Functions2 myFunctions, String methodName)
	{
		if(!myFunctions.compare2StringArrays(new String [] {"and"}, new String [] {"or"}) &&
		   !myFunctions.compare2StringArrays(new String [] {"and", "but"}, new String [] {"or"}) &&
		    myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"a", "b", "c", "d"}) &&
		   !myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"d", "c", "b", "d"}) &&
		   !myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"A", "b", "C", "d"}) &&
		    myFunctions.compare2StringArrays(new String [] {"Aunt", "Sally"}, new String [] {"Aunt", "Sally"}) &&
		   !myFunctions.compare2StringArrays(new String [] {"Aunt", "Sally"}, new String [] {"Aunt", "sally"}))
		{
		System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + methodName);
		}
		else
		{
		   System.out.println(ANSI_RED + "Failed " + ANSI_RESET + methodName);
		}
		System.out.println();
		if(printValues)
		{
		  System.out.println(myFunctions.compare2StringArrays(new String [] {"and"}, new String [] {"or"}));  //  false
			System.out.println(myFunctions.compare2StringArrays(new String [] {"and", "but"}, new String [] {"or"}));  //  false
			System.out.println(myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"a", "b", "c", "d"}));//  true
			System.out.println(myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"d", "c", "b", "d"}));  //  false
	    System.out.println(myFunctions.compare2StringArrays(new String [] {"a", "b", "c", "d"}, new String [] {"A", "b", "C", "d"}));  //  false
			System.out.println(myFunctions.compare2StringArrays(new String [] {"Aunt", "Sally"}, new String [] {"Aunt", "Sally"}));  //  true
			System.out.println(myFunctions.compare2StringArrays(new String [] {"Aunt", "Sally"}, new String [] {"Aunt", "sally"}));  //  false
			System.out.println(); System.out.println();
		}
	}//end TESTcompare2StringArrays


}//end TestFunctions2
