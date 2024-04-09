package mcr.display;

import java.awt.*;
import java.awt.event.KeyAdapter;

public interface Displayer {
    /**
     * Get the width of the displayed object
     * @return width of the displayed object
     */
    int getWidth();

    /**
     * Get the height of the displayed object
     * @return height of the displayed object
     */
    int getHeight();

    /**
     * Get the graphics used to draw on the displayed object
     * @return graphic object
     */
    Graphics2D getGraphics();

    /**
     * Induces the rendering of the displayed object
     */
    void repaint();

    /**
     * Set the title of the displayed object
     * @param title Displayed title name
     */
    void setTitle(String title);

    /**
     * Bind a KeyAdapter to displayed object that allows keyboard control event listening
     * @param ka KeyAdapter to bind
     */
    void addKeyListener(KeyAdapter adapter);
}