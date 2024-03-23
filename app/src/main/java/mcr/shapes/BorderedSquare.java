package mcr.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import mcr.rendering.Renderer;

public class BorderedSquare extends Square{
    public BorderedSquare(int size, Point2D.Double position, Renderer renderer) {
        super(size, position, renderer);
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
