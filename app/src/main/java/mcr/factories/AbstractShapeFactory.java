package mcr.factories;

import mcr.shapes.Circle;
import mcr.shapes.Square;

import java.awt.geom.Point2D;

public abstract class AbstractShapeFactory {

    public abstract Square createSquare(Point2D.Double position, int size);

    public abstract Circle createCircle(Point2D.Double position, int size);
}
