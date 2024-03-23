package mcr;

import mcr.factories.AbstractShapeFactory;
import mcr.factories.BorderedFactory;
import mcr.factories.FilledFactory;
import mcr.shapes.Bouncable;
import mcr.singleton.Display;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.LinkedList;

public class App {
    private final static int EXIT_KEY = KeyEvent.VK_Q;
    private final static int CLEAR_KEY = KeyEvent.VK_E;
    private final static int ADD_FILLED_KEY = KeyEvent.VK_F;
    private final static int ADD_BORDERED_KEY = KeyEvent.VK_B;
    private final static int ADD_QTY = 10;
    private final static int MIN_DIAMETER = 5;
    private final static int MAX_DIAMETER = 30;

    // LinkedBlockingQueue is thread-safe that is why we don't use LinkedList
    private final LinkedList<Bouncable> bouncers = new LinkedList<>();

    public App() {
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
                        addBouncers(new BorderedFactory(), ADD_QTY);
                        break;
                    case ADD_FILLED_KEY:
                        addBouncers(new FilledFactory(), ADD_QTY);
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
     * @param count   number of shapes to create
     */
    private void addBouncers(AbstractShapeFactory factory, int count) {
        Display display = Display.getInstance();
        for (int i = 0; i < count; ++i) {
            bouncers.add(factory.createCircle(
                    (int) (Math.random() * (MAX_DIAMETER - MIN_DIAMETER)) + MIN_DIAMETER,
                    new Point2D.Double((Math.random() * display.getWidth()), (Math.random() * display.getHeight())))
            );

            bouncers.add(factory.createSquare(
                    (int) (Math.random() * (MAX_DIAMETER - MIN_DIAMETER)) + MIN_DIAMETER,
                    new Point2D.Double((Math.random() * display.getWidth()), (Math.random() * display.getHeight())))
            );
        }
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
        while (true){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}