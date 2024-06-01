

public class Tester
{
  public static void main(String[] args)
  {
    StopWatch timer = new StopWatch();
    System.out.println("Which sort do you want to use?")
    String whichSort = args[0];
    System.out.println("How many elements do you want the smallest list to have?");
    int from = Integer.parseInt(args[1]);
    System.out.println("How many elements do you want the longest list to have?");
    int to   = Integer.parseInt(args[2]);
    System.out.println("How many more elements do you want the next list to have than the previous one?"); 
    int step = Integer.parseInt(args[3]);
    System.out.println("How many repeats of each list do you want to have?");
    int repeats = Integer.parseInt(args[4]);

    for(int n = from; n <= to; n+= step)
    {
      int[] data = ArrayUtils.fillRandom(n, -to, to);
      //ArrayUtils.quickSort(data);

      switch(whichSort)
      {
        case "bubble": timer.start();
                       ArrayUtils.bubbleSort(data);
                       timer.stop();
                       break;
        case "selection": timer.start();
                          ArrayUtils.selectionSort(data);
                          timer.stop();
                          break;
        case "insertion": timer.start();
                          ArrayUtils.insertionSort(data);
                          timer.stop();
                          break;
        case "merge":  timer.start();
                       ArrayUtils.mergeSort(data);
                       timer.stop();
                       break;
        case "quick":  timer.start();
                       ArrayUtils.quickSort(data);
                       timer.stop();
                       break;
      }
      if(ArrayUtils.isSorted(data, true))
      {
        System.out.printf("%1d \t %1.4f\n", n, (timer.getTime()/1000.0));
      }
      else
      {
        System.out.println("Error!");
      }
      data = null;
    }
  }
}
