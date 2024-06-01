// simple application to run and time various sorting algorithms
//
// program is run by passing arguments to the command line as follows:
//
// java Tester sort smallSize largeSize stepSize > outputFilename.data
//
// where sort can be any one of
//   bubble
//   selection
//   insertion
//   merge
//   quick
//
// and smallSize is the shortest data set size to test,
// largeSize is the largest data set size to test
// and step is what step to use in the sizes
//
// The application outputs two tab-separated columns of data with
// dataSize  time to sort in ms

public class Tester
{
  public static void main(String[] args)
  {
    StopWatch timer = new StopWatch();
    String whichSort = args[0];
    int from = Integer.parseInt(args[1]);
    int to   = Integer.parseInt(args[2]);
    int step = Integer.parseInt(args[3]);

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
