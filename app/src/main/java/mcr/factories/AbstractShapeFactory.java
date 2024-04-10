package mcr.factories;

import mcr.shapes.Circle;
import mcr.shapes.Square;

/**
 * Interface of factory for creating shapes
 */
public interface AbstractShapeFactory {

    /**
     * Returns a new square
     * @return a new square
     */
    public Square createSquare();

    /**
     * Returns a new circle
     * @return a new circle
     */
    public Circle createCircle();
}
