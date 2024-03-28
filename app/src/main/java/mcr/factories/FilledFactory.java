package mcr.factories;

import mcr.App;
import mcr.Util;
import mcr.rendering.FilledRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.FilledCircle;
import mcr.shapes.FilledSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

public class FilledFactory extends AbstractShapeFactory {
    private static final Renderer renderer = new FilledRenderer();

    @Override
    public Square createSquare() {
        return new FilledSquare(Util.getRandomPoint(), Util.getRandomSize(), renderer);
    }

    @Override
    public Circle createCircle() {
        return new FilledCircle(Util.getRandomPoint(), Util.getRandomSize(), renderer);
    }
}
