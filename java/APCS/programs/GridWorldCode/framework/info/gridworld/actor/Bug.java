/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 * edited by JS Iwanski
 *    March 2021
 *    August 2022 - modified some comments
 */

package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * A <code>Bug</code> is an actor that can move and turn.
 * It drops flowers as it moves. <br>
 */
public class Bug extends Actor
{
    /**
     * Default constructor creates a red bug.
     */
    public Bug()
    { setColor(Color.RED); }

    /**
     * Constructs a bug of a given color.
     * @param bugColor the color for this bug
     */
    public Bug(Color bugColor)
    { setColor(bugColor); }

    /**
     * Moves if it can move, turns otherwise.
     */
    @Override
    public void act()
    {
        if (canMove())
            move();
        else
            turn();
    }

    /**
     * Turns the bug 45 degrees to the right without
     * changing its location.
     */
    public void turn()
    { setDirection(getDirection() + Location.HALF_RIGHT); }

    /**
     * Moves the bug forward, putting a flower into
     * the location it previously occupied.
     */
    public void move()
    {
      // get my grid (take map out of pocket)
      // and if the grid is null, the bug has
      // not yet been put into a grid, so exit method
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;

        // store current location in the grid AND
        // the location that this bug is pointing at
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());

        // if the location this bug is pointing at is valid,
        // meaning it is on the grid, then move to that location,
        // otherwise this bug dies (removes itself from the grid)
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();

        // create a flower and put in the previous location,
        // the one that this bug just vacated.
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }

    /**
     * Tests whether this bug can move forward into a location
     * that is empty or contains a flower.
     * @return true if this bug can move.
     */
    public boolean canMove()
    {
        // get my grid (take map out of pocket)
        // and if the grid is null, the bug has
        // not yet been put into a grid, so --> false
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;

        // store current location in the grid AND
        // the location that this bug is pointing at
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());

        // if the location this bug is pointing at is valid
        // (i.e. is on the grid), then store the contents of
        // that location in neighbor. If not on the grid --> false
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);

        // ok to move if neighbor represents either an
        // empty location or is simply a flower, but NOT
        // in any other case.
        return (neighbor == null) || (neighbor instanceof Flower);
    }
}
