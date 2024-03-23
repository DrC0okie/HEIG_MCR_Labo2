package mcr.shapes;

import mcr.rendering.Renderer;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Square extends AbstractShape {
    protected Square(int size, Point2D.Double position, Renderer renderer) {
        super(new Rectangle2D.Double(position.x, position.y, size, size), renderer);
    }

    @Override
    public Rectangle2D.Double getShape() {
        return (Rectangle2D.Double) super.getShape();
    }

    @Override
    public void move() {
        // Check collision and move
    }
}
