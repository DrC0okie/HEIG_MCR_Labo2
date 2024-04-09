package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

/**
 * Represents a circle with a blue fill
 */
public class FilledCircle extends Circle {
    public FilledCircle(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    /**
     * Returns the color of the circle
     * @return the color of the circle
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
