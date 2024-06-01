//instance fields

//sideLength

//steps

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br>
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a SpiralBug that traces a spiral starting at a given side length
     * @param length the side length
     */
    public SpiralBug()
    {
      steps = 0;
      sideLength = 1;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps = 0; // start new leg of the box!
            sideLength++;
        }
    }
}
