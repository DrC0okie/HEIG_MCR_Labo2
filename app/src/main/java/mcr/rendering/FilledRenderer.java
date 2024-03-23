package mcr.rendering;

import mcr.shapes.Bouncable;

import java.awt.*;

public class FilledRenderer implements Renderer {
    @Override
    public void display(Graphics2D g2d, Bouncable bouncable) {
        g2d.setColor(bouncable.getColor());
        g2d.fill(bouncable.getShape());
    }
}