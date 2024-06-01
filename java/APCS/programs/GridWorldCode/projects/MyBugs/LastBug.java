import info.gridworld.actor.Bug;

//born facing north
public class LastBug extends Bug
{
  private int steps;
  private int sideLength;



  public LastBug()
  {
    steps = 0;
    sideLength = 7;
  }

int totsteps = 28;
 @Override
 public void act()
 {
  if( totsteps>0 )
  {
//turns 1 time
    turn();
    for(steps = 0; steps<sideLength; steps++)
    {
      move();
      totsteps--;
    }
//turns 2 times
    turn();
    turn();
//reset steps
    steps = 0;
//moves 7 steps
    for(steps = 0; steps<sideLength; steps++)
    {
      move();
      totsteps--;
    }
//turns 6 times
    turn();
    turn();
    turn();
    turn();
    turn();
    turn();

//goes 7 steps
    steps = 0;
    for(steps = 0; steps<sideLength; steps++)
    {
      move();
      totsteps--;
    }
//turns 2 times
    turn();
    turn();

//goes 7 steps
    steps = 0;
    for(steps = 0; steps<sideLength; steps++)
    {
      move();
      totsteps--;
    }

  }

 }



}
//moves 7 steps
