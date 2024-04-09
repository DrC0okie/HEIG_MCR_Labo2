package mcr.shapes;

import mcr.Util;
import mcr.rendering.Renderer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Represents an abstract circle
 */
public abstract class Circle extends AbstractShape {
    protected Circle(Point2D.Double position, int size, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer, Util.getRandomMove());
    }

    /**
     * Returns the circle shape
     * @return the circle shape
     */
    @Override
    public Ellipse2D getShape() {
        return (Ellipse2D) super.getShape();
    }

    /**
     * Moves the circle in a direction
     */
    @Override
    public void move() {
        this.getShape().setFrame(getNewBoundsAfterMove());
    }
}
