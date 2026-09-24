package main;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

    // screen setting
    final int originalTilesSize =32 ;  // 32 x 32
    final int scale = 3;
    final int tileSize = originalTilesSize * scale ;
    final int maxScreenRow = 12 ;
    final int maxScreenCol = 16 ;
    final int screenWidth = tileSize * maxScreenCol ;
    final int screenHeight = tileSize * maxScreenRow ;
    
}
