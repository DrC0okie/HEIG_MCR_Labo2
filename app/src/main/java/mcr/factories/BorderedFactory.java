package mcr.factories;

import mcr.rendering.BorderedRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.BorderedCircle;
import mcr.shapes.BorderedSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

import java.awt.geom.Point2D;

public class BorderedFactory extends AbstractShapeFactory {
    private static final Renderer renderer = new BorderedRenderer();
    @Override
    public Square createSquare(Point2D.Double position, int size) {
        return new BorderedSquare(position, size, renderer);
    }

    @Override
    public Circle createCircle(Point2D.Double position, int size) {
        return new BorderedCircle(position, size, renderer);
    }
}
