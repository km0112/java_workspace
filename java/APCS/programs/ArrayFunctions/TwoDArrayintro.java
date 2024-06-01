import java.util.Arrays;

public class TwoDArrayintro
{
  public static void main(String[] args)
  {
    // standard way to declare a 2D array is;
    //datatype[][] arrayName = new datatype [#rows] [#columbs]

    // integer array
    int numRows = 4, numCols = 6;
    //int [][] nums1 = new int[numRows][numCols];
    int[][]nums1 = MyArrays.fillRandom(numRows, numCols, -100, 100);
//if array is empty, it gives you a memory location
    MyArrays.print(nums1);
//System.out.printf("Specification1 Specification2 ", var1, var2)
  }
}
