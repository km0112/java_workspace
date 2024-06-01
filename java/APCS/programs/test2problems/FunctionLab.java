// Lab to follow up the 2nd test of the year,
// November 2022. Write algorithms and solutions
// to the test's 3 free response, CodingBat-styled
// questions.
//
// Notes:
//    1. the main method may NOT be modified in any way.
//    2. each of the 3 methods has an initial stub solution
//       that allows it to compile
//    3. for full credit you will write an algorithm in comment
//       form within each method and then write the Java code to
//       implement your algorithm.
//    4. to run your solution simply compile and then run FunctionLab.

public class FunctionLab
{
  public static void main(String[] args)
  {
    // test of nearFar:
    System.out.println("Testing method nearFar:");
    int A = 0;
    int[] B = {1,3,5,7,-3};
    int[] C = {2,17,-2,0,8};
    for( int i = 0; i < B.length;i++ )
    {
      System.out.printf("nearFar(%1d,%1d,%1d) = %b\n", A, B[i], C[i], nearFar(A, B[i], C[i]) );
    }
    System.out.println();

    // test of filterOut:
    String[] phrases = {"catcatdogcat","oooo","Mississippi Rississippi","llateateearlylatelayt","hello!"};
    String[] words   = {"cat","ooo","iss","late","bye!"};
    System.out.println("Testing method filterOut:");
    for( int i = 0; i < phrases.length; i++ )
    {
      String p = phrases[i], w = words[i];
      System.out.printf("filterOut(\"%1s\",\"%1s\") = \"%1s\"\n", p, w, filterOut(p,w) );
    }
    System.out.println();

    // test of countX:
    String[] strs = {"abcdxfXeXXx","abcdefghi","exit","X (or x) marks the spot", "xxXXx"};
    System.out.println("Testing method countX:");
    for( int i = 0; i < strs.length; i++ )
    {
      System.out.printf("countX(\"%1s\") = %1d\n", strs[i], countX(strs[i]) );
    }
    System.out.println();
  }

// Program title: FunctionLab
// Author: Kaila McNamara
// Written on: Dec. 2, 2022
// Description: Method I checks if B and C are near A or far from A and returns true if one is close, one is far.
// Method II takes 2 strings as input and deletes all instances of the second string from the first.
//Method III returns the number of times lowercase and uppercase x are in the given string. 

  // Method I:
  // returns true if one of B or C is "near" A while
  // the other is "far" from A. "near" is defined as
  // being within 2 or less of A, while "far" is defined
  // as being 3 or more away from A.
  // precondition: none
  private static boolean nearFar(int A, int B, int C)
  {
    // 1.create a variable to store the absolute value of A-B
    int avg1= Math.abs(A-B);
    // 2.create a second variable to store the absolute value of A-C
    int avg2= Math.abs(A-C);
    // 3.if the variable from step 1 is <= to 2, check if A-C is >= to 3
    if (avg1 <= 2 && avg2 >= 3)
    {
      //3b. if both are true, return true
      return true;
    }

    //4. if both are false, return true
    if (!(avg1 <= 2) && !(avg2 >= 3))
    {
      return true;
    }
    //5. if one is true and the other is false, return false
    else
      {
        return false;
      }

  }

  // Method II:
  // returns a String that is comprised of the input String phrase,
  // but which has NO occurences within it of the String word
  // precondition: word is non-empty
  private static String filterOut(String phrase, String word)
  {
  //1. while word is in phrase
  //1b. only run if phrase is in word. Otherwise, skip and return phrase as is
     while (phrase.contains(word))
     {
  //2. delete all instances of word from phrase
       phrase = phrase.replaceAll(word, "");

    //   System.out.println("Response::"+phrase);
     }
  //return phrase with no instances of word in it
  return phrase;

   }

  // Method III:
  // Returns the number of times that "x" or "X" occurs in str
  // precondition: none
  private static int countX(String str)
  {
    // 1. make the program non-case sensitive
    str = str.toLowerCase();
    char letter;
    //2. create a variable to store the length of string to tell it when to stop looping
    int lstr= str.length();
    //3. create a counter
    int counter = 0;
    // 4. go through every position
    for (int pos = 0; pos < lstr; pos++)
    {
      //5. find the character at this index in the string
      letter = str.charAt(pos);
      //6. compare character at position to x
      if(Character.compare(letter,'x')==0)
      {
      //5b. if character is x, add one to counter
        ++counter;
      }
    }
    //6. return the counter after going through every position in the string
    return counter;

  }
}
