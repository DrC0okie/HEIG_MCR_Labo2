package mcr.shapes;

import mcr.rendering.Renderer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public abstract class Circle extends AbstractShape {
    protected Circle(int size, Point2D.Double position, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer);
    }

    @Override
    public Ellipse2D getShape() {
        return (Ellipse2D) super.getShape();
    }

    @Override
    public void move() {
        // Check collision
    }
}
