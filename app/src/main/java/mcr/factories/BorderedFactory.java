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
    public Square createSquare(int size, Point2D.Double position) {
        return new BorderedSquare(size, position, renderer);
    }

    @Override
    public Circle createCircle(int size, Point2D.Double position) {
        return new BorderedCircle(size, position, renderer);
    }
}
