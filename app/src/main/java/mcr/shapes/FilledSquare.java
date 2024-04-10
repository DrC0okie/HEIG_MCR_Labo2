package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.Renderer;

/**
 * Represents a square with an orange fill
 */
public class FilledSquare extends Square {
    public FilledSquare(Renderer renderer) {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), renderer);
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
