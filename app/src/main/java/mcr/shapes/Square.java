package mcr.shapes;

import mcr.rendering.Renderer;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Square extends AbstractShape {
    protected Square(Point2D.Double position, int size, Renderer renderer) {
        super(new Rectangle2D.Double(position.x, position.y, size, size), renderer);
    }

    @Override
    public Rectangle2D.Double getShape() {
        return (Rectangle2D.Double) super.getShape();
    }

    @Override
    public void move() {
        // TODO: Check the collision, move the shape and set the new hit box (setFrame) of the shape
    }
}
