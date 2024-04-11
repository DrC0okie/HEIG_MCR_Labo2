package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.BorderedRenderer;

/**
 * Represents a square with a red border
 */
public class BorderedSquare extends Square {
    public BorderedSquare() {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), BorderedRenderer.getInstance());
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
