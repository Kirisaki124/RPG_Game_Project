import java.awt.*;

public abstract class DynamicObject {
    protected Vector2D position;

    public DynamicObject() {
        position = new Vector2D();
    }

    public abstract void run(Graphics g);
}
