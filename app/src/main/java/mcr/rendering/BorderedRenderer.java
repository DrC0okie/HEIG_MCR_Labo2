package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public class BorderedRenderer implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {

        // Set the border stroke
        g2d.setStroke(new BasicStroke(2.0f));

        // Set the border color
        g2d.setColor(bouncable.getColor());

        // Draw the bouncable
        g2d.draw(bouncable.getShape());
    }
}
