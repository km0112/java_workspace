/**
	Food.java
 	@author - your name goes here
 */

import info.gridworld.actor.Actor;

/**
	<code>Food</code> is the top level
	abstract class for different food types.
	A food object waits for a
	<code>WorkerAnt</code> to get food from it.
	It acts by doing nothing.
 */
public abstract class Food extends Actor implements Processable
{
	//the size of a bite
	private int biteSize;
	//the total amount of food taken
	private int foodEaten;

  /**
  	Constructs a <code>Food</code> actor.  The image is
  	displayed for this actor without tinting.
  */
	  public Food(int bite)
	   {
	  		biteSize = bite;
				foodEaten = 0;
				setColor(null);
	   }

	/**
		Gives food and current location to <code>ant</code>.
		@param ant the calling <code>WorkerAnt</code>
	*/
	@Override
	public void process(WorkerAnt ant)
	{
		ant.takeFood(biteSize);
		ant.shareFoodLocation(getLocation());
		foodEaten+= biteSize;
	}

  /**
  	"Do nothing" act method.  This is provided
		for the Ant Farm <code>Cake, Cookie</code>,
		and <code>QueenAnt</code> classes which
		do nothing.
  */
  @Override
  public void act(){}

  /**
  	Creates a string that describes this food object.
  	@return a string with the <code>Actor</code> information
  	plus the amount of food eaten from this <code>Cake</code>
  */
  @Override
	public String toString()
	{
		return super.toString() + "total food eaten = " + foodEaten + "with a bit size of " + biteSize; 
	}
}
