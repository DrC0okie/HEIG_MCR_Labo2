package mcr;

import mcr.factories.AbstractShapeFactory;
import mcr.factories.BorderedFactory;
import mcr.factories.FilledFactory;
import mcr.shapes.Bouncable;
import mcr.singleton.Display;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    private final static int EXIT_KEY = KeyEvent.VK_Q;
    private final static int CLEAR_KEY = KeyEvent.VK_E;
    private final static int ADD_FILLED_KEY = KeyEvent.VK_F;
    private final static int ADD_BORDERED_KEY = KeyEvent.VK_B;
    private final static int ADD_QTY = 10;
    private final static int MAX_SIZE = 30;
    private final static int MIN_SIZE = 5;
    private final Collection<Bouncable> bouncers = new ConcurrentLinkedQueue<>(); // TODO: better choice ?
    private static Random random;

    public App() {
        random = new Random();
        Display display = Display.getInstance();
        display.setTitle("Bouncers");
        display.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case EXIT_KEY:
                        System.exit(0);
                        break;
                    case CLEAR_KEY:
                        bouncers.clear();
                        break;
                    case ADD_BORDERED_KEY:
                        addBouncers(new BorderedFactory());
                        break;
                    case ADD_FILLED_KEY:
                        addBouncers(new FilledFactory());
                        break;
                }
            }
        });
    }

    public static void main(String... args) {
        new App().run();
    }

    /**
     * Add new bouncers to the simulation
     *
     * @param factory factory to use for shapes creation
     */
    private void addBouncers(AbstractShapeFactory factory) {
        Display display = Display.getInstance();
        for (int i = 0; i < ADD_QTY; ++i) {
            bouncers.add(factory.createCircle(getRandomPoint(display), getRandomSize(display)));
            bouncers.add(factory.createSquare(getRandomPoint(display), getRandomSize(display)));
        }
    }

    static public Point2D.Double getRandomPoint(Display display) {
        double x = Math.random() * display.getWidth();
        double y = Math.random() * display.getHeight();
        return new Point2D.Double(x, y);
    }

    static private int getRandomSize(Display display) {
        return random.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }

    /**
     * Run two thread, one for moving shapes, one for rendering.
     */
    public void run() {

        // TODO: Render looper that takes the delay in ms as constructor
        // This looper must have a run() method to launch it
        // and an abstract protected void update() method that we can implement here
        // by calling draw(), then move() on each bouncable objects.
        // Finally, we call Display.getInstance().repaint();
        while (true) {
            for (Bouncable bouncer : bouncers) {
                bouncer.move();
                bouncer.draw();
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}