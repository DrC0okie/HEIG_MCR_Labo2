package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public interface Renderer {
    default public void display(Graphics2D g2d, Bouncable bouncable) {
        g2d.setColor(bouncable.getColor());
    }
}
