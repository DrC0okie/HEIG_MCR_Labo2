package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

/**
 * Represents a square with an orange fill
 */
public class FilledSquare extends Square {
    public FilledSquare(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    /**
     * Returns the color of the square
     * @return the color of the square
     */
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
