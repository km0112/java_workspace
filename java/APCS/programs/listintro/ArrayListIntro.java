//array lists cannot contain primative datatypes
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntro
{
  public static void main(String[] args)
  {
//wrappers are capital version of the word <Double> you have to use these to create array lists w primitives
    ArrayList<Integer> numList = new ArrayList<>();
    ArrayList<Double> dblList = new ArrayList<>();
    ArrayList<Boolean> boolList = new ArrayList<>();

      int i = 0;
      int n = 20;
      for(i = 1; i <= n; i++)

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
      for(i = 0; i < numList.size(); i++)
      {
        //remove removes element then returns import junit.framework.TestCase;
        //add adds number that remove returned
        evens.add( numList.remove(i) );
      }
      System.out.println(numList);
      System.out.println(evens);

//this code does not work, it does this only for odd indices
//this is bc of how code works. It checks number at position 0 and removes it but when it increments i by one
//it skips number that became first index
    if(evens.get(i) % 2 ==0)
    {
      numList.add(evens.remove(i));
    }
    System.out.println(numList);
//array lists- be careful when adding or removing stuff bc things move around
  for(i = 0; i < evens.size(); i++ )
  {
//this would work for above problem
      if(evens.get(i) % 2 == 0)
      {
        numList.add(evens.remove(i));
        i++;
      }
      System.out.println(numList);
      System.out.println(evens);
//you can't manipulate arrays in a for each loop

//use iterator to iterate through and print numbers in numList
//<> used for generic data datatypes
//iterator data types match list you iterate through
//Iterator:

Iterator<Integer> it = numList.iterator();

while(it.hasNext())
{
  System.out.println(it.next());
}
  }
  }
}
