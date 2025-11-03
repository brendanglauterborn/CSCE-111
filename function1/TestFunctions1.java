/*
  TestFunctions1 will test the homework ExerciseFunctions.java
  Adopted by Robert Lightfoot from Bruce Gooch's original exercise.

  4/1/2019
*/


public class TestFunctions1
{

    //  if you are on a mac, use these.
     /*
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
     */
     //if you are on a PC, use these.
        public static final String ANSI_RESET = "";
        public static final String ANSI_RED = "";
        public static final String ANSI_GREEN = "";

	public static void main(String[] args)
	{

		ExerciseFunctions myFunctions = new ExerciseFunctions();

    //Put individual test cases up here.
    // TESTwinCondition(myFunctions);

    //put true in the condition to test everything
    //put false in the condition to only test the code above.
    if(true){
      TESTwinCondition(myFunctions);
      TESTmaxInt(myFunctions);
      TESTisWet(myFunctions);
      TESTlovesYou(myFunctions);
		  TESTisNice(myFunctions);
		  TESTnearest10(myFunctions);
	    TESTsameLastDigit(myFunctions);
		  TESTcatch22(myFunctions);
		  TESTformalWords(myFunctions);
		  TESTdeleteArticles(myFunctions);
    }
	}//end main

  // DO NOT EDIT BELOW HERE.

	public static void TESTwinCondition(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.winCondition("win prizes")  &&
		   myFunctions.winCondition("pin the tail") &&
  		 !myFunctions.winCondition("wit fries?") &&
  		 !myFunctions.winCondition("pit viper") &&
		   !myFunctions.winCondition("in")) //
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "winCondition");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "winCondition");
		   System.out.println();

		   System.out.println(myFunctions.winCondition("win prizes"));
       System.out.println(myFunctions.winCondition("pin the tail"));
		   System.out.println(myFunctions.winCondition("wit fries?"));
		   System.out.println(myFunctions.winCondition("pit viper"));
		   System.out.println(myFunctions.winCondition("in")); //Oh No!
		   System.out.println(myFunctions.winCondition("i"));
		   System.out.println(myFunctions.winCondition(""));

		   System.out.println(); System.out.println();
	    }
	}//end TESTwinCondition

	public static void TESTmaxInt(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.maxInt(1, 2, 3) == 3 && myFunctions.maxInt(3, 2, 3) == 3 &&
		  myFunctions.maxInt(3, 2, 5) == 5 && myFunctions.maxInt(7, 5, 4) == 7)
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "maxInt");
	    }
	    else
	    {
	       System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "maxInt");
		     System.out.println();

	       System.out.println(myFunctions.maxInt(1, 2, 3));
         System.out.println(myFunctions.maxInt(3, 2, 3));
    	   System.out.println(myFunctions.maxInt(3, 2, 5));
    	   System.out.println(myFunctions.maxInt(7, 5, 4));

		     System.out.println(); System.out.println();
	    }
	}//end TESTmaxInt

	public static void TESTisWet(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.isWet("wet", "wet")    && !myFunctions.isWet("wet", "water") &&
		 !myFunctions.isWet("water", "wet") && !myFunctions.isWet("any-string", "any-string"))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "isWet");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "isWet");
		   System.out.println();

		   System.out.println(myFunctions.isWet("wet", "wet"));
       System.out.println(myFunctions.isWet("wet", "water"));
		   System.out.println(myFunctions.isWet("water", "wet"));
		   System.out.println(myFunctions.isWet("any-string", "any-string"));
		   System.out.println(myFunctions.isWet("Asking if water is wet", "can cause problems."));
		   System.out.println(myFunctions.isWet("I am ", "wet"));
		   System.out.println(myFunctions.isWet("wet", "stone"));

		   System.out.println(); System.out.println();
	    }
	}//TESTisWet

	public static void TESTisNice(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.isNice("nice", "any-string") &&
		  myFunctions.isNice("any-string", "nice") &&
		 !myFunctions.isNice("any-string", "any-string"))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "isNice");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "isNice");
		   System.out.println();

		   System.out.println(myFunctions.isNice("nice", "any-string"));
       System.out.println(myFunctions.isNice("any-string", "nice"));
		   System.out.println(myFunctions.isNice("any-string", "any-string"));
		   System.out.println(myFunctions.isNice("Making a list", "Checking it twice"));
		   System.out.println(myFunctions.isNice("Gonna find out", "Who is wet"));
		   System.out.println(myFunctions.isNice("and", "Nice"));

		   System.out.println(); System.out.println();
	    }
	}//end TESTisNice

	public static void TESTnearest10(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.nearest10(8, 13) == 8 && myFunctions.nearest10(13, 8) == 8 && myFunctions.nearest10(13, 7) == 0)
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "nearest10");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "nearest10");
		   System.out.println();

		   System.out.println(myFunctions.nearest10(8, 13));
       System.out.println(myFunctions.nearest10(13, 8));
		   System.out.println(myFunctions.nearest10(13, 7));
		   System.out.println(myFunctions.nearest10(10, 10));
		   System.out.println(myFunctions.nearest10(9, 11));
		   System.out.println(myFunctions.nearest10(0, 0));
		   System.out.println(); System.out.println();
	    }
	}//end TESTnearest10

	public static void TESTsameLastDigit(ExerciseFunctions myFunctions)
    {
	   if(myFunctions.sameLastDigit(3, 3)  && myFunctions.sameLastDigit(7, 17) &&
		 !myFunctions.sameLastDigit(6, 17) && myFunctions.sameLastDigit(3, 113))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "sameLastDigit");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "sameLastDigit");
		   System.out.println();

		   System.out.println(myFunctions.sameLastDigit(3, 3));
       System.out.println(myFunctions.sameLastDigit(7, 17));
		   System.out.println(myFunctions.sameLastDigit(6, 17));
		   System.out.println(myFunctions.sameLastDigit(3, 113));
		   System.out.println(myFunctions.sameLastDigit(48, 208)); // Nickel and Lead, Magic Numbers?

		   System.out.println(); System.out.println();
	    }
	}//end TESTsameLastDigit

	public static void TESTlovesYou(ExerciseFunctions myFunctions)
    {
	   if(new String("TAMU loves you").equalsIgnoreCase(myFunctions.lovesYou("I love TAMU")) &&
		  new String("Basketball loves you").equalsIgnoreCase(myFunctions.lovesYou("I love Basketball")) &&
		  new String("Fred Rogers 143").equalsIgnoreCase(myFunctions.lovesYou("")) &&
		  new String("Fred Rogers 143").equalsIgnoreCase(myFunctions.lovesYou("any thing else")))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "lovesYou");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "lovesYou");
		   System.out.println();

		   System.out.println(myFunctions.lovesYou("I love TAMU"));
       System.out.println(myFunctions.lovesYou("I love Basketball"));
		   System.out.println(myFunctions.lovesYou(""));
		   System.out.println(myFunctions.lovesYou("any thing else"));
		   System.out.println(myFunctions.lovesYou("I love Yoyodyne Propulsion Systems"));
		   System.out.println(myFunctions.lovesYou("No matter where you go, there you are."));

		   System.out.println(); System.out.println();
	    }
	}//end TESTlovesYou


	public static void TESTcatch22(ExerciseFunctions myFunctions)
    {
	   if(new String("Catch").equalsIgnoreCase(myFunctions.catch22("Catch 22")) &&
		  new String("Rifle").equalsIgnoreCase(myFunctions.catch22("22 Rifle")) &&
		  (new String("22 Hamburgers for $1").equalsIgnoreCase(myFunctions.catch22(" Hamburgers for $1")) ||
		   new String("Hamburgers for $1").equalsIgnoreCase(myFunctions.catch22("22 Hamburgers for $1"))))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "catch22");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "catch22");
		   System.out.println();

		   System.out.println(myFunctions.catch22("Catch 22"));
       System.out.println(myFunctions.catch22("22 Rifle"));
		   System.out.println(myFunctions.catch22("22 Hamburgers for $1"));
		   System.out.println(myFunctions.catch22("They couldn't touch Yossarian because he was 22Tarzan, 22Mandrake, 22Flash Gordon."));
		   System.out.println(myFunctions.catch22("Actually, Major Major had been promoted by an I.B.M. 22 machine with a sense of humor almost as keen as his father's."));

		   System.out.println(); System.out.println();
	    }
	}//end TESTcatch22

	public static void TESTformalWords(ExerciseFunctions myFunctions)
    {
	   if(new String("Hi").equals(myFunctions.formalWords("hi")) &&
		  new String("This Is Our Finest Hour").equals(myFunctions.formalWords("This is our finest hour")))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "formalWords");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "formalWords");
		   System.out.println();

		   System.out.println(myFunctions.formalWords("hi"));
       System.out.println(myFunctions.formalWords("This is our finest hour"));
		   System.out.println(myFunctions.formalWords("Oh, you ate one too?"));
		   System.out.println(myFunctions.formalWords("1.21 gigawatts?!"));
		   System.out.println(myFunctions.formalWords("Great Scott!"));

		   System.out.println(); System.out.println();
	    }
	}//end TESTformalWords

	public static void TESTdeleteArticles(ExerciseFunctions myFunctions)
    {
	   if(new String("cat").equalsIgnoreCase(myFunctions.deleteArticles("cat")) &&
		  new String("cat").equalsIgnoreCase(myFunctions.deleteArticles("a cat")) &&
		  new String("cat in hat").equalsIgnoreCase(myFunctions.deleteArticles("The cat in a hat")))
	    {
		   System.out.println(ANSI_GREEN + "Passed " + ANSI_RESET + "deleteArticles");
	    }
	    else
	    {
	     System.out.println(ANSI_RED + "Failed " + ANSI_RESET + "deleteArticles");
		   System.out.println();

       System.out.println(myFunctions.deleteArticles("cat"));
       System.out.println(myFunctions.deleteArticles("a cat"));
       System.out.println(myFunctions.deleteArticles("The cat in a hat"));


		   System.out.println("deleteArticles(\"cat\") -> " + myFunctions.deleteArticles("cat"));
       System.out.println("deleteArticles(\"a cat\") -> " + myFunctions.deleteArticles("a cat"));
		   System.out.println("deleteArticles(\"the cat in the hat\") -> " + myFunctions.deleteArticles("the cat in the hat"));
		   System.out.println("deleteArticles(\"The CIA\") -> " + myFunctions.deleteArticles("The CIA"));
		   System.out.println("deleteArticles(\"Please give me a water.\") -> " + myFunctions.deleteArticles("Please give me a water."));
	     System.out.println("deleteArticles(\"We need a light in this room.\") -> " + myFunctions.deleteArticles("We need a light in this room."));

		   System.out.println(); System.out.println();
	    }
	}//end TESTdeleteArticles

}	// End TestFunctions
