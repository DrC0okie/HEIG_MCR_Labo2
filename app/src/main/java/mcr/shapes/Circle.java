package mcr.shapes;

import mcr.rendering.Renderer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * Represents an abstract circle
 */
public abstract class Circle extends Bouncer {
    protected Circle(Point2D.Double position, int size, Point2D.Double moveVector, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer, moveVector);
    }

    /**
     * Moves the circle in a direction
     */
    @Override
    public void move() {
        ((Ellipse2D) super.getShape()).setFrame(getNewBoundsAfterMove());
    }
}
