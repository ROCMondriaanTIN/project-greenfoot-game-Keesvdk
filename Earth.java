import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Actor
{
    private GreenfootImage button_1 = new GreenfootImage("Earth.png");  
    private GreenfootImage button_2 = new GreenfootImage("EarthClicked.png");  
   
    private boolean mouseDown;  
       
    public Earth() {  
        setImage(button_1);  
        mouseDown = false;  
    }  
   
    public void act() {  
        if (!mouseDown && Greenfoot.mousePressed(this)) {    
            setImage(button_2); 
            mouseDown = true;
        }    
        if (mouseDown && Greenfoot.mouseClicked(this)) {  
            setImage(button_1);  
            mouseDown = false;
            Greenfoot.setWorld(new LevelEarth());  
        }
         
    }
}
