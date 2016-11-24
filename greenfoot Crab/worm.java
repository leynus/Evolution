// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class worm extends Actor
{
    private int Todesort;
    private int tageSeitMahlzeit;
    private int Zombiecrab;
    private int TodesortCrabX;
    private int TodesortCrabY;
    private int ToteCrab;

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("up") && tageSeitMahlzeit < 300) {
            move(5);
        }
        if (Greenfoot.isKeyDown("down") && tageSeitMahlzeit < 300) {
            move(-5);
        }
        if (isTouching(starfish.class)) {
            tageSeitMahlzeit = 0;
            removeTouching(starfish.class);
        }
        if (isTouching(lobster.class)) {
            tageSeitMahlzeit = 0;
            removeTouching(lobster.class);
        }
        if (isTouching(Crab.class)) {
            tageSeitMahlzeit = 0;
            removeTouching(Crab.class);
            Zombiecrab = Zombiecrab + 1;
            TodesortCrabX = getX();
            TodesortCrabY = getY();
        }
        if (Zombiecrab > 0) {
            ToteCrab = ToteCrab + 1;
        }
        if (ToteCrab == 300) {
            getWorld().addObject( new Crab2(), TodesortCrabX, TodesortCrabY);
            Zombiecrab = Zombiecrab - 1;
            ToteCrab = 0;
        }
        tageSeitMahlzeit = tageSeitMahlzeit + 1;
        if (tageSeitMahlzeit == 300) {
            Todesort = getY();
            getWorld().addObject( new Snake(), 0, Todesort);
            turn(180);
        }
    }
}
