import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class MyBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
      //  ActorWorld world = new ActorWorld( new UnboundedGrid <Actor>() );
    //  ActorWorld world = new ActorWorld( new BoundedGrid <Actor> () );

        LastBug nik = new LastBug();

        world.add(nik);

        world.show();
    }
}
