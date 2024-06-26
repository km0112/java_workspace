/**
  Processable.java
  @author - your name goes here
 */

/**
 Provides the process method that allows
 <code>WorkerAnt</code> actors to polymorphically
 get food from the <code>Food</code> objects
 (<code>Cake</code> and <code>Cookie</code>) and
 give food to <code>QueenAnt</code> objects.
 This method also enables the various actors
 to share their locations.
 */
public interface Processable
{
	/**
	 Called by <code>ant</code> to get/give food and to
	 get/give food and queen locations.
	 @param ant the calling <code>WorkerAnt</code>
	*/

  public void process(WorkerAnt ant);


}
