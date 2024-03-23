package mcr.factories;

import mcr.rendering.FilledRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.Circle;
import mcr.shapes.Square;
import mcr.shapes.FilledCircle;
import mcr.shapes.FilledSquare;

import java.awt.geom.Point2D;

public class FilledFactory extends AbstractShapeFactory {

    private static final Renderer renderer = new FilledRenderer();

    @Override
    public Square createSquare(Point2D.Double position, int size) {
        return new FilledSquare(position, size, renderer);
    }

    @Override
    public Circle createCircle(Point2D.Double position, int size) {
        return new FilledCircle(position, size, renderer);
    }
}
