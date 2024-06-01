/**
 * WorkerAnt.java
 *
 * @author - your name goes here
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import static info.gridworld.grid.Grid.*;

/**
 * A <code>WorkerAnt</code> is a critter whose mission is
 * to take food from <code>Cake and Cookie</code> objects
 * and to deliver it to a <code>QueenAnt</code> object.
 * Initially it looks for food.  After it finds food,
 * it looks for a queen.
 * Worker ants share the location of food and the queen
 * with other ants they encounter.
 * Worker ants with food are red.  If they don't have food,
 * they are black.
 */
public class WorkerAnt extends Critter implements Processable {
    /**
     * Current amount of food being carried
     */
    private int foodQuantity;

    /**
     * Location of a <code>Food</code> object
     */
    private Location foodLoc;

    /**
     * Location of a <code>QueenAnt</code> object
     */
    private Location QueenLoc;

    /**
     * Constructs a <code>WorkerAnt</code> critter.
     * It is originally black (no food) and
     * its direction is chosen randomly from the
     * eight normal cardinal directions.
     */
    public WorkerAnt() {
        setColor(Color.BLACK);
        foodQuantity = 0;
        foodLoc = null;
        QueenLoc = null;
        int position = (int) (Math.random() * 8);
        if (position == 0) {
            setDirection(Location.NORTH);
        }

        if (position == 1) {
            setDirection(Location.HALF_RIGHT);
        }

        if (position == 2) {
            setDirection(Location.HALF_RIGHT+ Location.HALF_RIGHT);

        }

        if (position == 3) {
            setDirection(3 * Location.HALF_RIGHT);
        }

        if (position == 4) {
            setDirection(4 * Location.HALF_RIGHT);
        }

        if (position == 5) {
            setDirection(5 * Location.HALF_RIGHT);
        }

        if (position == 6) {
            setDirection(6 * Location.HALF_RIGHT);

        }

        if (position == 7) {
            setDirection(Location.FULL_CIRCLE);
        }

    }

    /**
     * Gives current food and queen locations
     * to <code>ant</code>.
     *
     * @param ant the calling <code>WorkerAnt</code>
     */
    public void process(WorkerAnt ant) {
        ant.shareFoodLocation(foodLoc);
        ant.shareQueenLocation(QueenLoc);
    }

    /**
     * Takes <code>fQty</code> amount of food from the
     * calling <code>Food</code>.
     *
     * @param fQty the amount of food to take.
     */
    public void takeFood(int fQty) {
        foodQuantity = fQty;
    }

    /**
     * Gives food to the calling <code>QueenAnt</code>.
     *
     * @return the amount of food to give.
     */
    public int giveFood() {
        int temp = foodQuantity;
        foodQuantity = 0;
        return temp;
        // Replace with appropriate implementation !
    }

    /**
     * Receives the <code>fLoc</code> food location from a
     * <code>Food</code> object.  Saves this location if
     * it doesn't already have one.
     *
     * @param fLoc the location of the food.
     */
    public void shareFoodLocation(Location fLoc) {
        if (foodLoc == null) {
            foodLoc = fLoc;
        }
    }

    /**
     * Receives the <code>qLoc</code> queen location from a
     * <code>QueenAnt</code> object.  Saves this location if
     * it doesn't already have one.
     *
     * @param qLoc the location of the queen.
     */
    public void shareQueenLocation(Location qLoc) {
       if(QueenLoc != getLocation()) {
           if (QueenLoc == null) {
               QueenLoc = qLoc;
           }
       }
    }

    /**
     * Processes each of the neighboring Ant Farm actors.
     * Implemented to get food from <code>Cake and
     * Cookie</code> actors, give food to
     * <code>QueenAnt</code> actors, and to share locations
     * with other <code>WorkerAnt</code> actors.<br />
     * Precondition: All objects in <code>actors</code>
     * are contained in the same grid as this critter.
     *
     * @param actors the actors to be processed
     */
    @Override
    public void processActors(ArrayList<Actor> actors) {

           for (Actor actor : actors) {
               //Need to filter out ONLY Worker Ants

                ((Processable) actor).process(this);
               }
           }



    /**
     * Gets the possible locations for the next move.
     * Implemented to return the empty neighboring locations
     * that are roughly in the direction of the current goal
     * (food or queen).  Calles getDesiredDirection to get the
     * direction to the goal.  Then it considers locations which
     * are in that direction or +- Location.HALF_RIGHT degrees.<br />
     * Postcondition: The locations must be valid in the grid
     * of this critter.
     *
     * @return a list of possible locations for the next move
     */
    @Override
    public ArrayList<Location> getMoveLocations() {
        ArrayList<Location> locations = new ArrayList<>();
        //1. in the grid

        if (getGrid().isValid(getLocation().getAdjacentLocation(this.getDesiredDirection()))) {
            //2. in desired direction or 45 degrees to left or right
            if (getDesiredDirection() == getDirection() || getDesiredDirection() == (getDirection() + Location.HALF_RIGHT)) {
                if (getLocation().getAdjacentLocation(getDirection()) != null) {
                    locations.add(getLocation().getAdjacentLocation(getDirection()));
                }
            }

            if (getDesiredDirection() == (getDirection() + Location.HALF_LEFT)) {
                if (getLocation().getAdjacentLocation(getDirection()) != null) {
                    locations.add(getLocation().getAdjacentLocation(getDirection()));
                }
            }
        }
        return locations;
    }


    /**
     * Moves this critter to the given location,
     * sets its direction, and sets its color
     * (red = has food, black = does not have food).
     * Implemented to call moveTo.<br />
     * Precondition: <code>loc</code> is valid in the grid of this critter
     *
     * @param loc the location to move to (must be valid)
     */
    @Override
    public void makeMove(Location loc) {
        if (getLocation() != loc) {
            setDirection(getLocation().getDirectionToward(loc));
            moveTo(loc);
        }

        int dir = (int) (Math.random() * 2);

        if (dir == 0) {
            setDirection(getDirection() + Location.HALF_LEFT);
        }

        if (dir == 1) {
            setDirection(getDirection() + Location.HALF_RIGHT);
        }

        if (foodQuantity != 0) {
            setColor(Color.RED);
        }

        setColor(Color.BLACK);
    }

    /**
     * Returns the direction that the ant wants to go.
     *
     * @return the direction to the queen (if there is food
     * and a queen's location is known); the direction to the
     * food (if there is no food and a food's location is known);
     * the current ant's direction otherwise.
     */
    private int getDesiredDirection() {
        if (QueenLoc != null && foodQuantity != 0) {
            return getLocation().getDirectionToward(QueenLoc);
        }

        if (foodLoc != null && foodQuantity == 0) {
            return getLocation().getDirectionToward(foodLoc);
        }

        return getDirection();
    }

    /**
     * Creates a string that describes this actor.
     *
     * @return a string with the <code>Actor</code> information
     * plus the current amount of food and any known
     * <code>Food</code> and <code>QueenAnt</code> locations.
     */
    @Override
    public String toString() {
        super.toString();
        String antString = " it knows the food is at location " +
                foodLoc + " it knows the queen is at location " + QueenLoc;
        return "This ant has " + foodQuantity + " pounds of food" + antString;
    }
}
