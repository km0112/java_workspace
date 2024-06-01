// class for timing routines

public class StopWatch
{
  private long begin, end, elapsedTime;

  public StopWatch()
  {}

  // captures the time when stopwatch is started
  public void start()
  { begin = System.currentTimeMillis(); }

  // captures the time when stopwatch is stopped
  public void stop()
  { end = System.currentTimeMillis(); }

  // returns the time in milliseconds (ms)
  public long getTime()
  { return end - begin; }
}
