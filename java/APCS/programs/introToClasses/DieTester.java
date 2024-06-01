import java.util.Arrays;
public class DieTester
{

  public static void main(String[] args)
  {
    //args is an array of strings so you have to convert it to an int
  /*  int numRolls = Integer.parseInt(args[0]);
    Die die1 = new Die(), die2 = new Die();
    int[] histogram = new int[11];

    //Die myDie = new Die(6);
    //System.out.println( myDie );

    for(int i = 0; i < numRolls; i++)
    {
      //uses number rolled as index to store each time you roll a number from 1-6 into the position number-1
      histogram[die1.roll()+die2.roll()-2]++;
    }
    //Simple experiment: you take 10 die and roll them all at once then count up how many ones you see face up
    //first space in result array is 0 ones, position 1 is 1 one
    //you have 10 dice

    //System.out.println(Arrays.toString(histogram));
    //in terminal you would enter javac DieTester.java
    //java DieTester 50
    //2nd line runs roll 50 times

    for(int i = 0; i < histogram.length; i++)
    {
      System.out.printf("%1d: %3.2f%%\n", (i+2), (double) histogram[i]/numRolls * 100);
      //to left of colon: this means you want to see an integer and a field length of at least 1
      // to right of colon: this prints out percentage of times die lands on each number out of total rolls
    }


  }

public static void roll10Dice(int numRolls)
  {
// Roll 10 6-sided dice at once, and then count the number of 1's showing
// Repeat this experiment numRolls times, and keep track of the number of
// times we get any possible number of 1's.
  Die die1 = new Die(), die2 = new Die(), die3 = new Die(), die4 = new Die(), die5 = new Die(), die6 = new Die(), die7 = new Die();
  Die die8 = new Die(), die9 = new Die(), die10 = new Die();

  int[] rolls = new int [11];
//create a counter for number of ones rolled



  for(int i = 0; i < numRolls; i++)
  {
    int numOnes = 0;
    if(die1.roll() == 1)
    {
      numOnes++;
    }
    if(die2.roll() == 1)
    {
      numOnes++;
    }
    if(die3.roll() == 1)
    {
      numOnes++;
    }
    if(die4.roll() == 1)
    {
      numOnes++;
    }
    if(die5.roll() == 1)
    {
      numOnes++;
    }
    if(die6.roll() == 1)
    {
      numOnes++;
    }
    if(die7.roll() == 1)
    {
      numOnes++;
    }
    if(die8.roll() == 1)
    {
      numOnes++;
    }
    if(die9.roll() == 1)
    {
      numOnes++;
    }
    if(die10.roll() == 1)
    {
      numOnes++;
    }

    rolls[numOnes]++;

  }

  for(int k = 0; k < rolls.length; k++)
  {

    System.out.print(k + ":");
    System.out.print(rolls[k]);
    System.out.print( (double) rolls[k]/numRolls *100 );
    System.out.println("");
*/
    //to left of colon: this means you want to see an integer and a field length of at least 1
    // to right of colon: this prints out percentage of times die lands on each number out of total rolls


  Die die11 = new Die();
  



  }




}
