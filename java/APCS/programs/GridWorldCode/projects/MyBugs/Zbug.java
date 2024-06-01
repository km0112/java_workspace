import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br>
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class Zbug extends Bug
{
    private int steps;
    private int sideLength;


    /**
     * Constructs a SpiralBug that traces a spiral starting at a given side length
     * @param length the side length
     */



    public Zbug()
    {
      turn();
      turn();
      steps = 0;
      sideLength = 4;
    }

    int totsteps = steps*3 + 1;
    /**
     * Moves to the next location of the square.
     */
    public void step()
    {
      for(steps = 0; steps < sideLength; steps++)
      {
        move();
        totsteps--;

        if(steps == sideLength - 1 && getDirection() == 90)
        {
          turn();
          turn();
          turn();


        }
      }



      for(steps = 0; steps < sideLength; steps++)
      {
        move();
        totsteps--;

        if(steps == sideLength - 1 && getDirection() == 225)
        {
          turn();
          turn();
          turn();
          turn();
          turn();

          for(steps = 0; steps < sideLength; steps++)
          {
            move();
            totsteps--;
          }
        }
      }



    }


    public void act()
    {
      if(totsteps>0)
      {
        step();
      }
    }



}
