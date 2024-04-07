package mcr.factories;

import mcr.shapes.Circle;
import mcr.shapes.Square;

public abstract class AbstractShapeFactory {

    public abstract Square createSquare();

    public abstract Circle createCircle();
}
