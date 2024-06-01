import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br>
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a Circle bug that traces a circle of a given side length
     * @param length the side length
     */
    public CircleBug(int length)
    {
      steps = 0;
      sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    @Override
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
            steps = 0; // start new leg of the box!
        }
    }
}
