import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    private Vector2D position;
    public static KeyboardListener instance = new KeyboardListener();

    private KeyboardListener() {
        position = new Vector2D(0, 0);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                position.reset(0, -1);
                break;
            case KeyEvent.VK_A:
                position.reset(-1, 0);
                break;
            case KeyEvent.VK_D:
                position.reset(1, 0);
                break;
            case KeyEvent.VK_S:
                position.reset(0, 1);
                break;
        }
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        position.reset(0, 0);
    }

    public Vector2D getVector() {
        return position;
    }
}
