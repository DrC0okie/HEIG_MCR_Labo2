package mcr.shapes;

import mcr.rendering.Renderer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public abstract class Circle extends AbstractShape {
    protected Circle(Point2D.Double position, int size, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer);
    }

    @Override
    public Ellipse2D getShape() {
        return (Ellipse2D) super.getShape();
    }

    @Override
    public void move() {
        // TODO: Check the collision, move the shape and set the new hit box (setFrame) of the shape
    }
}
