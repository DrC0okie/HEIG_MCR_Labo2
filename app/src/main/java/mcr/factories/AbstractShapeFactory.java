package mcr.factories;

import mcr.shapes.Circle;
import mcr.shapes.Square;

import java.awt.geom.Point2D;

public abstract class AbstractShapeFactory {

    public abstract Square createSquare(int size, Point2D.Double position);

    public abstract Circle createCircle(int size, Point2D.Double position);
}
