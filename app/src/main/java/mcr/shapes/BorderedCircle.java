package mcr.shapes;

import java.awt.*;
import mcr.Util;
import mcr.rendering.BorderedRenderer;

/**
 * Represents a circle with a green border
 */
public class BorderedCircle extends Circle {
    public BorderedCircle() {
        super(Util.getRandomPoint(), Util.getRandomSize(), Util.getRandomMove(), BorderedRenderer.getInstance());
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
