package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    public Player(GamePanel gp,KeyHandler KeyH) {
        this.gp = gp;
        this.keyH = KeyH;

        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 3;
    }
    public void update() {

        if (keyH.upPressed == true) {
            y -= speed;
        }
        if (keyH.downPressed == true) {
            y += speed;
        }
        if (keyH.leftPressed == true) {
            x -= speed;
        }
        if (keyH.rightPressed == true) {
            x += speed;
        }
    }
    public void draw(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
