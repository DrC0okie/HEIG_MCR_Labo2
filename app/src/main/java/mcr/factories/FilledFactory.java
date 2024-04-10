package mcr.factories;

import mcr.Util;
import mcr.rendering.FilledRenderer;
import mcr.rendering.Renderer;
import mcr.shapes.FilledCircle;
import mcr.shapes.FilledSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

/**
 * Factory for creating Filled shapes
 */
public class FilledFactory implements AbstractShapeFactory {
    private static final Renderer RENDERER = FilledRenderer.getInstance();

    private static class Instance {
        private static final FilledFactory INSTANCE = new FilledFactory();
    }

    private FilledFactory() {
    }

    public static FilledFactory getInstance() {
        return Instance.INSTANCE;
    }

    @Override
    public Square createSquare() {
        return new FilledSquare(RENDERER);
    }

    @Override
    public Circle createCircle() {
        return new FilledCircle(RENDERER);
    }
}
