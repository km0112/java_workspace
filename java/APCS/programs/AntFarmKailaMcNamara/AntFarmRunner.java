/**
 * AntFarmRunner.java
 * originally created 05/10/07
 * by Robert Glen Martin
 *
 * updated March 2020 for use
 * at Dwight-Englewood School
 * by Joseph Iwanski
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
	This class runs a world that contains AntFarm actors.
	A cookie, a cake, and a queen are added at specific locations
	in a 20-by-20 grid.  25 worker ants are added at random locations.
*/
public class AntFarmRunner
{
	public static void main(String[] args)
	{
		// if you wish to change the size, modify either
		// gridSize, or one or both of numRows, numCols if
		// non-square grid is desired
		int gridSize = 20;
		int numRows = gridSize;
		int numCols = gridSize;
		Grid<Actor> grid = new BoundedGrid<Actor>(numRows, numCols);
    ActorWorld world = new ActorWorld(grid);

		// if you want to modify locations of cookie, cake,
		// or queen, change locations below
		Location cookieLoc = new Location(2,2);
		Location cakeLoc = new Location(17,2);
		Location queenLoc = new Location(9,15);

    world.add(cookieLoc, new Cookie());
    world.add(cakeLoc, new Cake());
    world.add(queenLoc, new QueenAnt());

		// if you want to add more food, you could add that here

		// modify numWorkers to change the number of worker ants
		int numWorkers = 25;
    for (int i = 0; i < numWorkers; i++)
    {	world.add(new WorkerAnt()); }

    world.show();
	}
}
