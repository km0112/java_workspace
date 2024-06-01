//contains useful Array and ArrayList functions
import java.util.Random;
import java.util.ArrayList;
public class MyArrays
{
  public static void print(int[][] arr)
  {
    //row-major traversal = for each row, you go through every columb
    //row-major traversal from row 0 to the end
    //arr.length = # of rows
    for(int row = 0; row < arr.length; row++)
    {
      //in row major traversal, inner loop is for columbs
      for(int col = 0; col < arr[0].length; col++)
      {
        //comma automatically groups digits in large numbers in groups of 3
        System.out.printf("%,8d", arr[row][col]);
      }
      System.out.println();
    }
  }

  public static void print(double[][] arr)
  {
    //row-major traversal = for each row, you go through every columb
    //row-major traversal from row 0 to the end
    //arr.length = # of rows
    for(int row = 0; row < arr.length; row++)
    {
      //in row major traversal, inner loop is for columbs
      for(int col = 0; col < arr[0].length; col++)
      {
        //comma automatically groups digits in large numbers in groups of 3
        System.out.printf("%7.2f", arr[row][col]);
      }
      System.out.println();
    }
  }
  //returns sum of all values in array
  public static int sum(int[] nums)
  {
    //1. create a counter i and set it to zero
    //2. create a variable sum and set it to zero
    //3. add element at each position to sum
    //4. return sum
    int i = 0;
    int sum = 0;

    for (i = 0; i < nums.length; i++)
    {
      sum = nums[i] + sum;
    }
    return sum;

  }
//creates and returns a double array of length n
//filled w randomly selected values from [min,max)
//precondition: n>0, max>min
public static double[][] fillRandom(double min, double max,int numRows, int numCols)
{
  Random rgen = new Random();
  double [][] result = new double[numRows][numCols];
  for(int row = 0; row < numRows; row++)
  {
    for(int col = 0; col < numCols; col++)
    {
      result[row][col] = min + (max-min) * Math.random();
    }
  }
  return result;
}
  //create and return a 2D int with numRows rows and numCols columbs
  //filled with randomly selected values in [min,max)
  //precondition max>min, numRows>0, numCols>0
  public static int[][] fillRandom(int numRows, int numCols, int min, int max)
  {
    Random rgen = new Random();

    int[][] result = new int[numRows][numCols];

    for(int row = 0; row < numRows; row++)
    {
      for(int col = 0; col < numCols; col++)
      {
        result[row][col] = min + rgen.nextInt(max-min);
      }
    }


    return result;
  }

  //create and return an integer array of length n
  //filled with randomly selected values in [min,max)
  //precondition max>min, n>0
  public static ArrayList<Integer> fillRandom(int n, Integer min, Integer max)
  {
  //create a Random object
  Random rgen = new Random();

  //create an empty array list
  ArrayList<Integer> result = new ArrayList<>();
  //generate n random integers and add them to the lists
  for(int i = 0; i < n; i++)
    {
    result.add(min+rgen.nextInt(max-min));

    }

    return result;
  }
  //create and return an integer array of length n
  //filled with randomly selected values in [min,max)
  //precondition max>min, n>0
  public static int[] fillRandom(int n, int min, int max)
  {
    //create a Random object
    Random rgen = new Random(1);

    //create an int array called result and set its length to n
    int[] result = new int [n];

    //for every element of result
    //set its value to a random number in [min,max)
    for (int i = 0; i < n; i++)
    {
      result[i] = min + rgen.nextInt(max-min);
    }
    //return the array
    return result;

  }


}
