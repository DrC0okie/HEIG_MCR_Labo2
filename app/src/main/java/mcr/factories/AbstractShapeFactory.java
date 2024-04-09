package mcr.factories;

import mcr.shapes.Circle;
import mcr.shapes.Square;

/**
 * Abstract factory for creating shapes
 */
public abstract class AbstractShapeFactory {

    /**
     * Returns a new square
     * @return a new square
     */
    public abstract Square createSquare();

    /**
     * Returns a new circle
     * @return a new circle
     */
    public abstract Circle createCircle();
}
