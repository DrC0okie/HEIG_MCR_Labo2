package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

/**
 * Represents a circle with a green border
 */
public class BorderedCircle extends Circle {
    public BorderedCircle(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    /**
     * Returns the color of the circle
     * @return the color of the circle
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
