package mcr.factories;

import mcr.App;
import mcr.Util;
import mcr.rendering.BorderedRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.BorderedCircle;
import mcr.shapes.BorderedSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

public class BorderedFactory extends AbstractShapeFactory {
    private static final Renderer renderer = new BorderedRenderer();

    @Override
    public Square createSquare() {
        return new BorderedSquare(Util.getRandomPoint(), Util.getRandomSize(), renderer);
    }

    @Override
    public Circle createCircle() {
        return new BorderedCircle(Util.getRandomPoint(), Util.getRandomSize(), renderer);
    }
}
