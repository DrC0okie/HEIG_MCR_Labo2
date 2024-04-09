package mcr.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * Display class that allows for the rendering of objects on the screen
 */
public class Display implements Displayer {
    private final static int DEFAULT_WIDTH = 1000;
    private final static int DEFAULT_HEIGHT = 1000;
    private static Display instance;
    private final JFrame frame;
    private final JPanel panel;
    private Image image;

    private Display() {
        frame = new JFrame();
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        frame.setVisible(true);
        image = createImage();
    }

    /**
     * Get the singleton instance of this class
     * @return instance of Display
     */
    public static Display getInstance() {
        if (instance == null) {
            instance = new Display();
        }
        return instance;
    }

    /**
     * Get the width of the display frame
     * @return width of the display frame
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * Get the height of the display frame
     * @return height of the display frame
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * Get the graphics object used to draw on the display frame
     * @return graphics object
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    /**
     * Induces the rendering of the display frame
     */
    @Override
    public void repaint() {
        panel.getGraphics().drawImage(image, 0, 0, null);
        // after drawing the buffered image, we create a new one for the next frame.
        image = createImage();
    }

    /**
     * Set the title of the display frame
     * @param title Displayed title name
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Bind a KeyAdapter to display frame that allows keyboard control event listening
     * @param adapter KeyAdapter to bind
     */
    @Override
    public void addKeyListener(KeyAdapter adapter) {
        frame.addKeyListener(adapter);
    }

    /**
     * Creates a drawable image that can be displayed in the displayer
     * @return new image
     */
    private Image createImage() {
        return frame.createImage(getWidth(), getHeight());
    }
}