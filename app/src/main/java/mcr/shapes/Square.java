package mcr.shapes;

import mcr.rendering.Renderer;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Represents an abstract square
 */
public abstract class Square extends Bouncer {
    protected Square(Point2D.Double position, int size, Point2D.Double moveVector, Renderer renderer) {
        super(new Rectangle2D.Double(position.x, position.y, size, size), renderer, moveVector);
    }

    /**
     * Moves the square in a direction
     */
    @Override
    public void move() {
        ((Rectangle2D) super.getShape()).setFrame(getNewBoundsAfterMove());
    }
}
