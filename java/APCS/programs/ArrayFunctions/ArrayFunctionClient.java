import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFunctionClient
{
  public static void main(String[] args)
  {
    int min = -7;
    int max = 14;
    Integer a = -7, b = 14;
    int[] nums = MyArrays.fillRandom(10, min, max);

  //  ArrayList<Integer> numList = MyArrays.fillRandom(10,a,b);
  //  System.out.println(Arrays.toString(nums) );

double[][] m = MyArrays.fillRandom(-3.15,14.267,4,6);
MyArrays.print(m);

  }
}
