package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

public class FilledCircle extends Circle{
    public FilledCircle(Point2D.Double position, int size, Renderer renderer) {
        super(position, size, renderer);
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
