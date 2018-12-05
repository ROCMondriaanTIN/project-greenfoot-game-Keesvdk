import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 1000x800 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("MenuScreen2.png");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Earth earth = new Earth();
        addObject(earth,141,349);
        Moon moon = new Moon();
        addObject(moon,323,363);
        Mars mars = new Mars();
        addObject(mars,501,353);
        Jupiter jupiter = new Jupiter();
        addObject(jupiter,684,316);
        Saturn saturn = new Saturn();
        addObject(saturn,882,347);
        ShopButton shopButton = new ShopButton();
        addObject(shopButton,794,83);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,506,86);
    }
}
