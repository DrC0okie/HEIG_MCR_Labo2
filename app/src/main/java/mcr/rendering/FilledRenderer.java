package mcr.rendering;

import mcr.shapes.Bouncable;
import java.awt.*;

/**
 * Renderer for filling a bouncable
 */
public class FilledRenderer implements Renderer {

    private static class Instance {
        private static final FilledRenderer INSTANCE = new FilledRenderer();
    }

    /**
     * Get the singleton instance of this class
     * @return instance of FilledRenderer
     */
    public static FilledRenderer getInstance() {
        return Instance.INSTANCE;
    }

    private FilledRenderer() {}

    /**
     * Draw and fill the given bouncable
     * @param g2d The graphics object used to draw the bouncable
     * @param bouncable The bouncable to draw
     */
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        Renderer.super.display(g2d, bouncable);
        g2d.fill(bouncable.getShape());
    }
}