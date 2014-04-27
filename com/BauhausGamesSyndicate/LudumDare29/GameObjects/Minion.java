package com.BauhausGamesSyndicate.LudumDare29.GameObjects;

import com.BauhausGamesSyndicate.LudumDare29.GameScreen;
import com.badlogic.gdx.graphics.g2d.Animation;



/**
 *
 * @author Paul
 */
public class Minion extends AbstractCharacter{
    
    public Minion(float x, float y, String name,boolean world, int steps){
        super(x, y, name, world, steps);
        setSpeed((float) (0.1f + Math.random()*.2f));
    }
    

    @Override
    public void update(float delta){
        super.update(delta);
        boolean collide = false;
        
        //colission check
        for (AbstractEntity entity : GameScreen.getOverworld().getEntityList()) {
            if (entity instanceof Enemy && entity.getX()+entity.getWidth() > getX() && entity.getX() < getX()+entity.getWidth()){
                collide = true;
            }
        }
        
        if (!collide){
            setX(getX() + getDirection()*delta*getSpeed());//run to left
        }
    }
}