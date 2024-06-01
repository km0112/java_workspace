//intro to the most basic type of loop structures in java

import java.util.Scanner;
import java.util.InputMismatchException;

public class LoopIntro {
  public static void main(String[] args) {

    int N;

    /*  Scanner sc = new Scanner(System.in);
    try {
        int n = sc.nextInt();
    } catch(Exception e) {
        System.err.println("expected integer input")
        System.exit(1)
    }
    */

    do
    { Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter a positive integer: ");
      N = keyboard.nextInt();
    } while (N <= 0);
    //This gives an error that says can't find symbol, fix this

    System.out.println("The first " + N + "integers...");
    System.out.println("using a while loop...");
    //create a loop counter called i and set to 1
    int i = 1;

    while(i <= N)
    {
      //print out the number i
      System.out.print(i + " ");
      //increment i by 1
      i++;
    }
    System.out.println();
    System.out.println();

    System.out.println("using a for-loop...");

    for( int j = 1 ; j<= N ; j++)
    {
      System.out.print(j + " ");
    }
//trying to print j outside of loop gives an error bc j does not exist outside of for loop
//you can have same variable in multiple loops
    System.out.print("Please enter your name: ");
    String name = keyboard.nextLine();

    for(int k = 0; k < name.length(); k++)
    {
      System.out.println(name.substring(k));
    }

    keyboard.close();
  }
}
