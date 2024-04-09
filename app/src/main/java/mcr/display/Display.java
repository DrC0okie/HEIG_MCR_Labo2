package mcr.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

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

    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(image, 0, 0, null);
        // after drawing the buffered image, we create a new one for the next frame.
        image = createImage();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }

    /**
     * Creates a drawable image that can be displayed in the displayer
     * @return new image
     */
    private Image createImage() {
        return frame.createImage(getWidth(), getHeight());
    }
}