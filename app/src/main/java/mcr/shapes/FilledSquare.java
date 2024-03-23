package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

public class FilledSquare extends Square {
    public FilledSquare(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
