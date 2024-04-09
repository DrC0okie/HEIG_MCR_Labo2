package mcr.shapes;

import mcr.display.Display;
import mcr.rendering.Renderer;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Abstract class that represents a shape
 */
public abstract class Bouncer implements Bouncable {

    private final Renderer renderer;
    private final Shape shape;
    private Point2D.Double moveVector;

    protected Bouncer(Shape shape, Renderer renderer, Point2D.Double moveVector) {
        this.renderer = renderer;
        this.shape = shape;
        this.moveVector = moveVector;
    }

    /**
     * Draws the shape on the display
     */
    @Override
    public void draw() {
        renderer.display(Display.getInstance().getGraphics(), this);
    }

    /**
     * Returns the shape
     * @return the shape
     */
    @Override
    public Shape getShape() {
        return shape;
    }

    /**
     * Manages the shape movement and collision
     * @return the new bounds of the shape after the move
     */
    protected Rectangle2D getNewBoundsAfterMove() {
        Display window = Display.getInstance();
        Rectangle2D bounds = this.getShape().getBounds2D();

        // Move the shape
        bounds.setRect(bounds.getX() + moveVector.x, bounds.getY() + moveVector.y, bounds.getWidth(), bounds.getHeight());

        // Check if the shape is out of the window
        Point2D.Double offset = new Point2D.Double(); // offset of the (0,0) top left point, relative to the window
        if (bounds.getX() < 0) // check left border
            offset.x = bounds.getX();
        if (bounds.getY() < 0) // check top border
            offset.y = bounds.getY();

        double rightX = bounds.getX() + bounds.getWidth();
        if (rightX > window.getWidth()) // check right border
            offset.x = rightX - window.getWidth();

        double bottomY = bounds.getY() + bounds.getHeight();
        if (bottomY > window.getHeight()) // check bottom border
            offset.y = bottomY - window.getHeight();

        // If there is an offset, move the shape back into the window
        // To not lose shapes outside, changing moveVector is not enough, we need to move it back inside the window
        if (offset.x != 0 || offset.y != 0)
            bounds.setRect(bounds.getX() - offset.x, bounds.getY() - offset.y, bounds.getWidth(), bounds.getHeight());

        // If the shape was off the screen, change the way of moveVector X and/or Y
        if (offset.x != 0)
            moveVector.x *= -1;
        if (offset.y != 0)
            moveVector.y *= -1;

        return bounds;
    }
}
