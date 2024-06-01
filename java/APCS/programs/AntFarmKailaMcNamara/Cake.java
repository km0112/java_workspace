/**
  Cake.java
  @author - Kaila McNamara
 */

/**
  A <code>Cake</code> sits around and waits for a
  <code>WorkerAnt</code> to get food from it.
  It acts by doing nothing.
 */
public class Cake extends Food
{
	/** The size of a bite */
  private int biteSize;

  /**
    Constructs a <code>Cake</code> actor.
    The Cake.gif is displayed for this actor
    without tinting.
  */
  public Cake()
  {
    super(100);
  }
}
