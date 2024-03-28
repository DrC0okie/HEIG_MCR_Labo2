package mcr.shapes;

import mcr.App;
import mcr.rendering.Renderer;
import mcr.singleton.Display;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class Square extends AbstractShape {
    protected Square(Point2D.Double position, int size, Renderer renderer) {
        super(new Rectangle2D.Double(position.x, position.y, size, size), renderer, App.getRandomPoint(Display.getInstance()));
    }

    @Override
    public Rectangle2D.Double getShape() {
        return (Rectangle2D.Double) super.getShape();
    }
}
