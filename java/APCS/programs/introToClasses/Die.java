//compilers ignore comments

/**
  * implements an N-sided die class
  */

public class Die
{
  //instance fields: always private
  private int numSides; //# of sides on this die
  private int value; // current value on die side face up

  //constructors: we can only call constructor the name of the class. super rare that they are private. No return type
  //job of constructor is to initialize the instance fields

  /**
    *sets the # of sides to N
    *and rolls the Die
    *<b>precondition: N > 0</b>
    *
    * @param N the number of sides on the die
    * @throws IllegalArgumentException if N is less than 1
    */
  public Die(int N)
  {
    if( N < 1)
    {
      throw new IllegalArgumentException("A die must have at least one side");
    }
    numSides = N;
    roll();
  }

  /**
    * default constructor: sets num sides to 6
    * and rolls the die to set the value to a random value in [1,6]
    *
    */
  public Die()
  {
    numSides = 6;
    roll();
  }


  //methods
  //rolls the Die
  public int roll()
  {
    value = (int) (Math.random() * numSides + 1);

    if(numSides <=6)
    {
      showDie(value);
    }
    return value;
  }
/**
  *returns the number of sides on this die
  *
  *@returns number of sides on this Die
  */
public int getNumSides()
{
  return numSides;
}

/**
  *sets the number of sides to n
  *@throws IllegalArgumentException if N is less than 1
  */
public void setNumSides(int N)
{
  if( N < 1)
  {
    throw new IllegalArgumentException("A die must have at least one side");
  }
  numSides = N;
  roll();
}
/**
  *returns current value for this die
  *
  *@returns value on the side of the die facing up
  */
public int getValue()
{
  return value;
}

/**
  *returns a string version of the number of faces the die has
  *
  *@returns the number of faces the die has
  */

@Override
public String toString()
{
  return "die with" + numSides + "faces";
}

private void showDie(int value)
{
//call inside of roll method
//if the die is anything other than a 6 sided die, print value
//if it’s a 6 sided die, prints an ascii image of die face that is rolled
//square face w a number inside
  if(value == 0)
  {
    System.out.println("---------");
    System.out.println("|   *   |");
    System.out.println("| *   * |");
    System.out.println("| *   * |");
    System.out.println("|   *   |");
    System.out.println("---------");
  }

  if(value == 1)
  {
    System.out.println("---------");
    System.out.println("|   *   |");
    System.out.println("| * *   |");
    System.out.println("|   *   |");
    System.out.println("| ****  |");
    System.out.println("---------");
  }


  if(value == 2)
  {
    System.out.println("-------------");
    System.out.println("|    * *     |");
    System.out.println("|  *     *   |");
    System.out.println("|      *     |");
    System.out.println("|    *       |");
    System.out.println("|  *******   |");
    System.out.println("-------------");
  }

  if(value == 3)
  {
    System.out.println("--------------");
    System.out.println("|     **     |");
    System.out.println("|   *    *   |");
    System.out.println("|      *     |");
    System.out.println("|   *    *   |");
    System.out.println("|     **     |");
    System.out.println("--------------");
  }

  if(value == 4)
  {
    System.out.println("--------------");
    System.out.println("|     **     |");
    System.out.println("|   *  *     |");
    System.out.println("|  *****     |");
    System.out.println("|      *     |");
    System.out.println("|      *     |");
    System.out.println("--------------");
  }

  if(value == 5)
  {
    System.out.println("--------------");
    System.out.println("|   ******** |");
    System.out.println("|   *        |");
    System.out.println("|   *  * *   |");
    System.out.println("|   **     * |");
    System.out.println("|          * |");
    System.out.println("|    * * *   |");
    System.out.println("--------------");
  }

  else 
  {
    System.out.println("--------------");
    System.out.println("|     ****   |");
    System.out.println("|   *        |");
    System.out.println("|   * ***    |");
    System.out.println("|   *     *  |");
    System.out.println("|     ***    |");
    System.out.println("--------------");
  }

}


}
