import javax.swing.*;

public class GameWindow extends JFrame{
    GameCanvas gameCanvas;
    public GameWindow (){
        this.setSize(800, 800);
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
        this.setVisible(true);
    }
    private long lastTime = 0;
    public void GameLoop(){
        while(true){
            long currentTime = System.nanoTime();
            if (currentTime - lastTime >= 17_000_000) {
                this.gameCanvas.renderAll();
                lastTime = currentTime;
            }
        }
    }
}