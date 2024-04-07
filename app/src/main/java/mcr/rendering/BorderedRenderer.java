package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public class BorderedRenderer implements Renderer {

    private static class Instance {
        private static BorderedRenderer instance = new BorderedRenderer();
    }

    /**
     * Get the singleton instance of this class
     * @return instance of BorderedRenderer
     */
    public static BorderedRenderer getInstance() {
        return Instance.instance;
    }

    private BorderedRenderer() {
    }

    /**
     * Draw and set the stroke of the bouncable
     * @param Graphics2D g2d
     * @param Bouncable bouncable
     */
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        Renderer.super.display(g2d, bouncable);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.draw(bouncable.getShape());
    }
}
