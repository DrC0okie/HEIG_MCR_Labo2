package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

// TODO MUST BE A SINGLETON!!!!!
public class BorderedRenderer implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        g2d.setColor(bouncable.getColor());
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.draw(bouncable.getShape());
        // TODO: Use the graphics to set the stroke, set the color (with the bouncable color) and
        // draw (with the boucable shape)
    }
}
