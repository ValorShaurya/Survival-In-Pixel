package main;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("My RPG Survival Game");

        // Window settings
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); // Center the window
        window.setResizable(true);
        window.setTitle("Survival In Pixel");
        // Show window
        window.setVisible(true);
    }
}