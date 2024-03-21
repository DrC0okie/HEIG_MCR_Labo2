package singleton;

public interface Displayer {
    int getWidth();

    int getHeight();

    Graphics2D getGraphics();

    void repaint();

    void setTitle(String title);
}