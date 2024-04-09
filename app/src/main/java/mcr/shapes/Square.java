package mcr.shapes;

import mcr.Util;
import mcr.rendering.Renderer;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Represents an abstract square
 */
public abstract class Square extends Bouncer {
    protected Square(Point2D.Double position, int size, Renderer renderer) {
        super(new Rectangle2D.Double(position.x, position.y, size, size), renderer, Util.getRandomMove());
    }

    /**
     * Moves the square in a direction
     */
    @Override
    public void move() {
        ((Rectangle2D) super.getShape()).setFrame(getNewBoundsAfterMove());
    }
}
