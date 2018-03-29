import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {

    BufferedImage background;
    BufferedImage backBuffered;
    BufferedImage playerImg;

    Graphics graphics;


    public GameCanvas() {
        this.setFocusable(true);
        this.requestFocusInWindow();

        this.setSize(800,800);
        this.setVisible(true);
        this.backBuffered = new BufferedImage(800,800,BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
        this.addKeyListener(KeyboardListener.instance);
        // load images
        try {
            this.background = ImageIO.read(new File("resource/background.jpg"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            this.playerImg = ImageIO.read(new File("resource/player.png"));
            player = new Player(playerImg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(backBuffered, 0,0,null);
    }

    Player player;

    public void renderAll(){
        this.graphics.drawImage(background,0,0,null);

        player.run(graphics);

        this.repaint();
    }
}
