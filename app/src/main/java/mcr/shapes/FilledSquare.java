package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.FilledRenderer;

/**
 * Represents a square with an orange fill
 */
public class FilledSquare extends Square {
    public FilledSquare() {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), FilledRenderer.getInstance());
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
