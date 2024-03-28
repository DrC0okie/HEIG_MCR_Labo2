package mcr.shapes;

import mcr.singleton.Display;
import mcr.App;
import mcr.rendering.Renderer;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class AbstractShape implements Bouncable {

    private final Renderer renderer;
    private final Shape shape;
    private Point2D.Double moveVector;

    protected AbstractShape(Shape shape, Renderer renderer, Point2D.Double moveVector) {
        this.renderer = renderer;
        this.shape = shape;
        this.moveVector = moveVector;
    }

    @Override
    public void draw() {
        renderer.display(Display.getInstance().getGraphics(), this);
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public void move() {
        Display window = Display.getInstance();

        // Compute the next position
        Rectangle bounds = getShape().getBounds();
        Point2D.Double nextPosition = new Point2D.Double(bounds.getMinX() + moveVector.x, bounds.getMinY() + moveVector.y);

        // If the shape goes out of the window bounds, we need to change the moveVector for the next iteration
        if (nextPosition.x < 0
                || nextPosition.x + bounds.width > window.getWidth()
                || nextPosition.y < 0
                || nextPosition.y + bounds.height > window.getHeight()) {

            // If we touch the left or right of the window, we need to invert the X value, otherwise the Y value
            int invertX = nextPosition.x < 0 || nextPosition.y > window.getWidth() ? -1 : 1;
            moveVector = new Point2D.Double(moveVector.x * invertX, moveVector.y * invertX * -1);
        }

        // TODO: okay ?
        shape.getBounds().setFrame(nextPosition, bounds.getSize());
        // TODO: Check the collision, move the shape and set the new hit box (setFrame) of the shape
    }

    /**
     * Check is a collision happens between the bouncable hit box and the window frame
     * @return new hit box position of the bouncable
     */
    protected Rectangle2D checkCollision() {
        // Get the window frame width and height
        Display display = Display.getInstance();

        // Get the hit box of the bouncable
        Rectangle2D hitBox = this.getShape().getBounds2D();

        // TODO: Check if the hitbox collides with the window frame, then modify the trajectory
        // accordingly, finally return the new hit box of the bouncable

        return hitBox;
    }
}
