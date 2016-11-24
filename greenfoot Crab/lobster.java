// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class lobster extends Actor
{
    private int Zombielobster;

    /**
     * 
     */
    public void act()
    {
        move(5);
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isTouching(Crab.class)) {
            World myworld;
            myworld = getWorld();
            myworld.addObject( new lobster(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        }
        if (isTouching(Crab.class)) {
            removeTouching(Crab.class);
        }
    }
}
