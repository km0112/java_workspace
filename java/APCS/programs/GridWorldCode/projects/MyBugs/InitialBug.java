

//born facing north
public class FirstBug extends Bug
{
  private int steps;
  private int sideLength;


  public FirstBug()
  {
    steps = 0;
    sideLength = 7;
  }

 @Override
 public void act()
 {
//goes up 7 steps
  for(steps = 0; steps<sideLength; steps++)
  {
    move();
  }
//turns 4 times
   turn();
   turn();
   turn();
   turn();
//reset steps
   steps = 0;
//moves 4 steps
  for(steps = 0; steps<sideLength-3; steps++)
  {
    move();
  }
//turns 5 times
  turn();
  turn();
  turn();
  turn();
  turn();
//goes 4 steps
  steps = 0
  for(steps = 0; steps<sideLength-3; steps++)
  {
    move();
  }
//turns 4 times
  turn();
  turn();
  turn();
  turn();
//goes 4 steps
  steps = 0;
  for(steps = 0; steps<sideLength-3; steps++)
  {
    move();
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
  for(steps = 0; steps<sideLength-3; steps++)
  {
    move();
  }


 }



}







//turns 6 steps
//moves 7 steps
//turns 2 times
//moves 7 steps
//turns 6 times
//moves 7 steps
//turns 2 times
//moves 7 steps
