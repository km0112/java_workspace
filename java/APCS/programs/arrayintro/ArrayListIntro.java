//array lists cannot contain primative datatypes
import java.util.ArrayList;

public class ArrayListIntro
{
  public static void main(String[] args)
  {
//wrappers are capital version of the word <Double> you have to use these to create array lists w primitives
    ArrayList<Integer> numList = new ArrayList<>();
    ArrayList<Double> dblList = new ArrayList<>();
    ArrayList<Boolean> boolList = new ArrayList<>();


      int n = 20;
      for(int i = 1; i <= n; i++)

      {
       numList.add(i);
       dblList.add( (double) i);
       boolList.add( i % 2 ==0 );
      }
      System.out.println(numList);
      System.out.println(dblList);
      System.out.println(boolList);
      //taking an int put into int class- boxing. java does this automatically
      //you have to put a compatible data type.
      ArrayList<Integer> evens = new ArrayList<>();
      //check if number at a position in first array list is even. If yes, move it from that list to this one
      for(int i = 0; i < numList.size(); i++)
      {
        //remove removes element then returns import junit.framework.TestCase;
        //add adds number that remove returned
        evens.add( numList.remove(i) );
      }
      System.out.println(numList);
      System.out.println(evens);

  }
}
