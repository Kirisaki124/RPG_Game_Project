import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends DynamicObject {
    private static BufferedImage playerImg;

    public Player(BufferedImage img) {
        playerImg = img;
    }

    public Player(int x, int y) {
        position.reset(x, y);
    }

    public Player(Vector2D vector) {
        position.reset(vector);
    }

    public void setPosition(int x, int y) {
        position.reset(x, y);
    }

    private void update() {
        position.addVector(KeyboardListener.instance.getVector());
    }

    private void render(Graphics g) {
        g.drawImage(playerImg, position.getX(), position.getY(), null);
    }

    @Override
    public void run(Graphics g) {
        update();
        render(g);
    }
}
