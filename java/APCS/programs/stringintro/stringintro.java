public class stringintro
{
  public static void main(String[]args)
  {
    String w = "cat";
    String v = "cat";
    String u = new String("cat");
//comparing 2 strings using == compares the references not the strings
    System.out.println(w == v);
    System.out.println(w==u);
//always compare 2 strings for lexicographical equality using ==

// .length method returns number of characters in string
/// v.contains(w) returns true if w is contained in string
    System.out.println(w.equals(u));

    String river1 = "Hudson River";
    System.out.print("river1 = \"" + river1 + "\"");
    System.out.println(" Which has a length of " + river1.length() + " characters.");

// substring
    int n = 0, m = 2;
    System.out.println("river1.substring(" + n + ") = \"" + river1.substring(n) + " \" ");
    String.w1="Cat",w2="cat"
    "Cat".compareTo("cat");


    river1.contains("Hudson");

//  \n in a string is like pressing enter, it creates a new line
//  \t indents the Line
//  \b is backspace, it moves first letter of line back one, will write over previous lines
  }
}
