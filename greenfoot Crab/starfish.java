// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class starfish extends Actor
{

    /**
     * 
     */
    public void act()
    {
        move(5);
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90));
        }
        if (isTouching(lobster.class)) {
            World myworld;
            myworld = getWorld();
            myworld.addObject( new starfish(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        }
        if (isTouching(lobster.class)) {
            removeTouching(lobster.class);
        }
    }
}
