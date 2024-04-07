package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public class FilledRenderer implements Renderer {

    private static class Instance {
        private static FilledRenderer instance = new FilledRenderer();
    }

    /**
     * Get the singleton instance of this class
     * @return instance of FilledRenderer
     */
    public static FilledRenderer getInstance() {
        return Instance.instance;
    }

    private FilledRenderer() {
    }

    /**
     * Draw and fill the given bouncable
     * @param Graphics2D g2d
     * @param Bouncable bouncable
     */
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        Renderer.super.display(g2d, bouncable);
        g2d.fill(bouncable.getShape());
    }
}