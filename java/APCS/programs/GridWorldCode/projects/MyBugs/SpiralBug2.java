
public class SpiralBug2 extends SpiralBug
{
    private int steps;
    private int sideLength;
    private int maxLength;

    /**
     * Constructs a SpiralBug that traces a spiral starting at a given side length
     * @param length the side length
     * precondition: maxLength must be positive num
     */
    public SpiralBug2()
    {
      int steps = 0;
      int sideLength = 2;
      int maxLength = 5;
    }

    /**
     * Moves to the next location of the square.
     */

    public void act()
    {
      for(sideLength=2; sideLength < maxLength; sideLength++)
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

        if(sideLength == maxLength)
        {
          turn();
          turn();
        }
      }

    }
}
