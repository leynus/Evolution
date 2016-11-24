// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * 
     */
    public void act()
    {
        move(5);
        if (isTouching(worm.class)) {
            removeTouching(worm.class);
            turn(180);
            move(-5);
        }
    }
}
