package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

// TODO MUST BE A SINGLETON!!!!!
public class FilledRenderer implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        g2d.setColor(bouncable.getColor());
        g2d.fill(bouncable.getShape());
        // TODO: Use the g2d to set the color and fill based on the color and shape

    }
}