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

import java.awt.Color;

/**
 * A <code>Flower</code> is an actor that darkens over time.
 * Some actors drop flowers as they move. <br>
 */

public class Flower extends Actor
{
    // generic flowers are PINK
    private static final Color DEFAULT_COLOR = Color.PINK;

    // lose 5% of color value in each step (flower withers)
    private static final double DARKENING_FACTOR = 0.05;

    /**
     * Default constructor creates a pink flower.
     */
    public Flower()
    { setColor(DEFAULT_COLOR); }

    /**
     * Constructs a flower of a given color.
     * @param initialColor the initial color of this flower
     */
    public Flower(Color initialColor)
    { setColor(initialColor); }

    /**
     * Causes the color of this flower to darken.
     */
    @Override
    public void act()
    {
        // get and store this flower's current color
        Color c = getColor();

        // compute the darkened color values
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        // change this flower's color to darkened color
        setColor(new Color(red, green, blue));
    }
}
