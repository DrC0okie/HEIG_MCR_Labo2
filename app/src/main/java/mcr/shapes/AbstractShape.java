package mcr.shapes;

import mcr.singleton.Display;
import mcr.rendering.Renderer;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class AbstractShape implements Bouncable {

    private final Renderer renderer;
    private final Shape shape;
    private Point2D.Double position;
    private Point2D.Double moveVector;

    protected AbstractShape(Shape shape, Renderer renderer) {
        this.renderer = renderer;
        this.shape = shape;

        // Here calculate the moveVector
    }

    @Override
    public void draw(){
        // Here renderer.display( Display.getInstance().getGraphics(), this );
    }

    @Override
    public Shape getShape(){
        return shape;
    }

    /**
     * Check is a collision happens between the bouncable hit box and the window frame
     * @return new hit box position of the bouncable
     */
    protected Rectangle2D checkCollision(){
        // Get the window frame width and height
        Display display = Display.getInstance();

        // Get the hit box of the bouncable
        Rectangle2D hitBox = this.getShape().getBounds2D();

        // TODO: Check if the hitbox collides with the window frame, then modify the trajectory
        //  accordingly, finally return the new hit box of the bouncable

        return hitBox;
    }
}
