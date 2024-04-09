package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

/**
 * Represents a square with a red border
 */
public class BorderedSquare extends Square {
    public BorderedSquare(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    /**
     * Returns the color of the square
     * @return the color of the square
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }
}
