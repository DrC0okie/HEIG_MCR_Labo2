package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.FilledRenderer;

/**
 * Represents a circle with a blue fill
 */
public class FilledCircle extends Circle {
    public FilledCircle() {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), FilledRenderer.getInstance());
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
