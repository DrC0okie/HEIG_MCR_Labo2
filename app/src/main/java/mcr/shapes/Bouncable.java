package mcr.shapes;

import java.awt.*;

/**
 * Represents a shape that can be drawn and moved
 */
public interface Bouncable {

    /**
     * Draw the bouncable
     */
    void draw();

    /**
     * Move the bouncable
     */
    void move();

    /**
     * Get the color of the bouncable
     * @return the color of the bouncable
     */
    Color getColor();

    /**
     * Get the shape of the bouncable
     * @return the shape of the bouncable
     */
    Shape getShape();
}
