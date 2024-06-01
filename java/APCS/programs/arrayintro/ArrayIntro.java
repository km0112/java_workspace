import java.util.Arrays;
//arrays don't have methods
public class ArrayIntro
{
  public static void main(String[] args)
  {
    //String [] students = new String[5];
   //.length is a static field, it's a constant. You can't modify it
   String[] students = {"Kyle", "Amanda", null, "Ivana", "Jackson", "Logan", "Jayden"};

   for(int i = 0; i < students.length; i++)
    {
      //makes sure computer will not throw an exception when it encounters null
      //you can't change values in array using for-each loop
      if(students[i] == null)
        { students[i] = "Joe";}
      else if ( students[i].substring(0,1).equals("J") )
      {students[i] = "Joe";}
    }
    System.out.println();

    System.out.println();

    //use for-each loop to traverse students array
    for(String s : students)
    {
      if (s != null )
      System.out.println(s);
    }
    //for every string s in students, print out string s
  //System.out.println(Arrays.toString(students));
  }

}
