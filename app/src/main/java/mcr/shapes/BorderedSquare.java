package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.Renderer;

/**
 * Represents a square with a red border
 */
public class BorderedSquare extends Square {
    public BorderedSquare(Renderer renderer) {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), renderer);
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
