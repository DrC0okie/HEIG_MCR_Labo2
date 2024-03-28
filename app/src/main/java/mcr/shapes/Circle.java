package mcr.shapes;

import mcr.App;
import mcr.rendering.Renderer;
import mcr.singleton.Display;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public abstract class Circle extends AbstractShape {
    protected Circle(Point2D.Double position, int size, Renderer renderer) {
        super(new Ellipse2D.Double(position.x, position.y, size, size), renderer, App.getRandomPoint(Display.getInstance()));
    }

    @Override
    public Ellipse2D getShape() {
        return (Ellipse2D) super.getShape();
    }
}
