/**
  Cookie.java
  @author - your name goes here
 */

 /**
   A <code>Cookie</code> sits around and waits for a
   <code>WorkerAnt</code> to get food from it.
   It acts by doing nothing.
  */
public class Cookie extends Food
{
	/** The size of a bite */
 private int bite;

  /**
    Constructs a <code>Cookie</code> actor.
    The Cookie.gif is displayed for this actor
    without tinting.
  */
  public Cookie()
  {
      super(100);
  }
}
