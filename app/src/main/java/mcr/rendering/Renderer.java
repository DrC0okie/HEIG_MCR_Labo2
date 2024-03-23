package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public interface Renderer {
    void display(Graphics2D g2d, Bouncable bouncable);
}
