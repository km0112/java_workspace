/**
  Processable.java
  @author - your name goes here
*/

import info.gridworld.actor.Actor;

import java.awt.Color;

/**
  A <code>QueenAnt</code> sits around and waits for a
  <code>WorkerAnt</code> to bring it food.
  It does nothing.
*/
public class QueenAnt extends Actor implements Processable
{
	/** Total amount of food that the queen has received. */
  private int foodQuantity;

  /**
    Constructs a <code>QueenAnt</code> actor.
    The queen is colored magenta.
  */
  public QueenAnt()
  {
    foodQuantity = 0;
    setColor(Color.MAGENTA);
  }

	/**
	 Gets food from and gives current location
   to <code>ant</code>.
	  @param ant the calling <code>WorkerAnt</code>
	*/
  @Override
  public void process(WorkerAnt ant)
  {
    foodQuantity+= ant.giveFood();
    //share location with WorkerAnt
    ant.shareQueenLocation(getLocation());
  }

  /**
    "Do nothing" act method.  This is provided
    for the Ant Farm <code>Cake, Cookie<\code>,
    and <code>QueenAnt</code> classes which
    do nothing.
  */
  @Override
  public void act()
  {

  }

  /**
    Creates a string that describes this QueenAnt.
    @return a string with the <code>QueenAnt</code> information
    plus the amount of food given to this <code>QueenAnt</code>
  */
  @Override
	public String toString()
	{
    // Replace with appropriate implementation !
    return super.toString() + ", FQty= " + foodQuantity;
	}
}
