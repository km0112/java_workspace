import info.gridworld.actor.Bug;

//This code creates a bug that runs in gridworld and leaves flowers behind it.
//The bug runs until it has created an uppercase K with flowers.  
//Author: Kaila McNamara
//Date: March 10, 2023

//born facing north
public class FirstBug extends Bug
{
  private int steps;
  private int sideLength;



  public FirstBug()
  {
    steps = 0;
    sideLength = 8;
  }

int totsteps = 23;
 @Override
 public void act()
 {
//goes up 7 steps
  if( totsteps>0 )
  {
    for(steps = 0; steps<sideLength; steps++)
    {
      move();
      totsteps--;
    }
//turns 4 times
    turn();
    turn();
    turn();
    turn();
//reset steps
    steps = 0;
//moves 4 steps
    for(steps = 0; steps<sideLength-4; steps++)
    {
      move();
      totsteps--;
    }
//turns 5 times
    turn();
    turn();
    turn();
    turn();
    turn();
//goes 4 steps
    steps = 0;
    for(steps = 0; steps<sideLength-4; steps++)
    {
      move();
      totsteps--;
    }
//turns 4 times
    turn();
    turn();
    turn();
    turn();
//goes 4 steps
    steps = 0;
    for(steps = 0; steps<sideLength-4; steps++)
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
//goes 4 steps
    steps = 0;
    for(steps = 0; steps<sideLength-4; steps++)
    {
      move();
      totsteps--;
    }
  }

 }
