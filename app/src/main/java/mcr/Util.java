package mcr;

import java.awt.geom.Point2D;
import java.util.Random;
import mcr.display.Display;

public class Util {
    private final static int MAX_SIZE = 30;
    private final static int MIN_SIZE = 5;
    private final static int MAX_SPEED = 10; // max number of pixels to move by iteration
    public final static int REFRESH_RATE = 20;  //repaint every 20ms
    private static Random random;
    private static Display display = Display.getInstance();

    static {
        random = new Random();
    }

    /**
     * Generate a random point
     * @return a random point
     */
    static public Point2D.Double getRandomPoint() {
        double x = Math.random() * display.getWidth();
        double y = Math.random() * display.getHeight();
        return new Point2D.Double(x, y);
    }

    /**
     * Generate a random move vector
     * @return a random move vector
     */
    static public Point2D.Double getRandomMove() {
        // Generate 2 values between -MAX_SPEED and +MAX_SPEED
        double x = Math.random() * MAX_SPEED * 2 - MAX_SPEED;
        double y = Math.random() * MAX_SPEED * 2 - MAX_SPEED;
        return new Point2D.Double(x, y);
    }

    /**
     * Generate a random size for the shapes
     * @return a random size
     */
    static public int getRandomSize() {
        return random.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }
}
