public class Vector2D {
    private int x, y;

    public Vector2D() {
        x = 50;
        y = 50;
    }

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(Vector2D vector) {
        x = vector.x;
        y = vector.y;
    }

    public void reset(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void reset(Vector2D vector) {
        x = vector.x;
        y = vector.y;
    }

    public void addVector(Vector2D vector) {
        x += vector.x;
        y += vector.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
