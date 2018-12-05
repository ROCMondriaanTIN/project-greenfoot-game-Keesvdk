import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 1000x800 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("Titlebg.png");
        Greenfoot.start(); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Menu());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Title title = new Title();
        addObject(title,494,379);
    }
}
