package mcr.factories;

import mcr.shapes.FilledCircle;
import mcr.shapes.FilledSquare;
import mcr.shapes.Circle;
import mcr.shapes.Square;

/**
 * Factory for creating Filled shapes
 */
public class FilledFactory implements AbstractShapeFactory {
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
        return new FilledSquare();
    }

    @Override
    public Circle createCircle() {
        return new FilledCircle();
    }
}
