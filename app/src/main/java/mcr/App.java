package mcr;

import mcr.factories.AbstractShapeFactory;
import mcr.factories.BorderedFactory;
import mcr.factories.FilledFactory;
import mcr.shapes.Bouncable;
import mcr.display.Display;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.LinkedList;

public class App {
    private final static int EXIT_KEY = KeyEvent.VK_Q;
    private final static int CLEAR_KEY = KeyEvent.VK_E;
    private final static int ADD_FILLED_KEY = KeyEvent.VK_F;
    private final static int ADD_BORDERED_KEY = KeyEvent.VK_B;
    private final static int ADD_QTY = 10;

    private final Collection<Bouncable> bouncers = new LinkedList<>();

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
                        addBouncers(BorderedFactory.getInstance());
                        break;
                    case ADD_FILLED_KEY:
                        addBouncers(FilledFactory.getInstance());
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
        for (int i = 0; i < ADD_QTY; ++i) {
            bouncers.add(factory.createCircle());
            bouncers.add(factory.createSquare());
        }
    }

    /**
     * Repaint loop to move and draw each bouncer every Util.REFRESH_RATE ms
     */
    public void run() {
        Timer timer = new Timer(Util.REFRESH_RATE, e -> {
            for (Bouncable bouncer : bouncers) {
                bouncer.move();
                bouncer.draw();
            }
            Display.getInstance().repaint();
        });
        timer.start();
    }
}