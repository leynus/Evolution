// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class CrabWorld extends World
{

    /**
     * 
     */
    public CrabWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new Crab();
        addObject(crab, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        Crab crab2 =  new Crab();
        addObject(crab2, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        Crab crab3 =  new Crab();
        addObject(crab3, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        crab3.setLocation(Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        crab3.setLocation(Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        lobster lobster =  new lobster();
        addObject(lobster, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        lobster lobster2 =  new lobster();
        addObject(lobster2, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        starfish starfish =  new starfish();
        addObject(starfish, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        starfish starfish2 =  new starfish();
        addObject(starfish2, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        starfish starfish3 =  new starfish();
        addObject(starfish3, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        lobster lobster3 =  new lobster();
        addObject(lobster3, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        worm worm =  new worm();
        addObject(worm, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
    }
}
