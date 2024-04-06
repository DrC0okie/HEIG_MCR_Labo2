package mcr.shapes;

import mcr.Util;
import mcr.rendering.Renderer;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Circle extends AbstractShape {
    protected Circle(Point2D.Double position, int size, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer, Util.getRandomMove());
    }

    @Override
    public void move(){
        Rectangle2D bounds = test();
        this.getShape().setFrame(bounds);
    }

    @Override
    public Ellipse2D getShape() {
        return (Ellipse2D) super.getShape();
    }
}
