package com.BauhausGamesSyndicate.LudumDare29;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 *
 * @author Benedikt Vogler
 */
public class Tile {
   private final Color color;
   public static final int WIDTH = 320;
   public static final int HEIGHT = 40;

    public Tile(Color color) {
        this.color = color;
    }


    void render(ShapeRenderer sh, int xPos, int yPos) {
        sh.setColor(color);
        sh.rect(xPos, yPos, WIDTH, HEIGHT);
    }
   
   
}
