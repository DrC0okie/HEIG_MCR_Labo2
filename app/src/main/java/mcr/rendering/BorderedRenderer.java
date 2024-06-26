package mcr.rendering;

import mcr.shapes.Bouncable;
import java.awt.*;

/**
 * Renderer for drawing a border around a bouncable
 */
public class BorderedRenderer implements Renderer {

    private static class Instance {
        private static BorderedRenderer INSTANCE = new BorderedRenderer();
    }

    /**
     * Get the singleton instance of this class
     * @return instance of BorderedRenderer
     */
    public static BorderedRenderer getInstance() {
        return Instance.INSTANCE;
    }

    private BorderedRenderer() {
    }

    /**
     * Draw and set the stroke of the bouncable
     * @param g2d The graphics object used to draw the bouncable
     * @param bouncable The bouncable to draw
     */
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        Renderer.super.display(g2d, bouncable);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.draw(bouncable.getShape());
    }
}
