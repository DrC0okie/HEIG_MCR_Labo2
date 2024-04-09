package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public interface Renderer {
    /**
    * Set the color of the bouncable, further changes are made in implementation classes
    * @param g2d The graphics object used to draw the bouncable
    * @param bouncable The bouncable to draw.
    */
    default public void display(Graphics2D g2d, Bouncable bouncable) {
        g2d.setColor(bouncable.getColor());
    }
}
