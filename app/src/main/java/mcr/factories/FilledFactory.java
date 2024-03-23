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
    public Square createSquare(int size, Point2D.Double position) {
        return new FilledSquare(size, position, renderer);
    }

    @Override
    public Circle createCircle(int size, Point2D.Double position) {
        return new FilledCircle(size, position, renderer);
    }
}


