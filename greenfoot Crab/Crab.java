// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class Crab extends Actor
{
    private int Zombiecrab;
    private int TodesortX;
    private int TodesortY;
    private int TageSeitMahlzeit;
    private int TageseitTod;

    /**
     * 
     */
    public void act()
    {
        move(5);
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isTouching(starfish.class)) {
            World myworld;
            myworld = getWorld();
            myworld.addObject( new Crab(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        }
        if (isTouching(starfish.class)) {
            removeTouching(starfish.class);
        }
        if (isTouching(worm.class)) {
            TodesortX = getX();
            TodesortY = getY();
            TageseitTod = TageseitTod + 1;
        }
        if (TageseitTod > 0) {
            Zombiecrab = Zombiecrab + 1;
        }
        if (Zombiecrab > 0) {
            getWorld().addObject( new Crab(), TodesortX, TodesortY);
            Zombiecrab = 0;
            TageseitTod = 0;
        }
        TageSeitMahlzeit = TageSeitMahlzeit + 1;
        if (TageSeitMahlzeit == 300) {
            getWorld().removeObject(this);
        }
    }
}
