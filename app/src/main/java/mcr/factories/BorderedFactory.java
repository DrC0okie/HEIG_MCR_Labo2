package mcr.factories;

import mcr.Util;
import mcr.rendering.BorderedRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.BorderedCircle;
import mcr.shapes.BorderedSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

/**
 * Factory for creating Bordered shapes
 */
public class BorderedFactory extends AbstractShapeFactory {
    private static final Renderer RENDERER = BorderedRenderer.getInstance();

    private static BorderedFactory instance;

    private BorderedFactory() {}

    /**
     * Get the singleton instance of this class
     * @return instance of BorderedFactory
     */
    public static BorderedFactory getInstance() {
        if (instance == null) {
            instance = new BorderedFactory();
        }
        return instance;
    }

    /**
     * Create a new BorderedSquare
     * @return a new BorderedSquare
     */
    @Override
    public Square createSquare() {
        return new BorderedSquare(Util.getRandomPoint(), Util.getRandomSize(), RENDERER);
    }

    /**
     * Create a new BorderedCircle
     * @return a new BorderedCircle
     */
    @Override
    public Circle createCircle() {
        return new BorderedCircle(Util.getRandomPoint(), Util.getRandomSize(), RENDERER);
    }
}
