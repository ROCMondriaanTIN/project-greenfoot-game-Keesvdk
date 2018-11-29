import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mars extends Actor
{
    private GreenfootImage button_1 = new GreenfootImage("Mars.png");  
    private GreenfootImage button_2 = new GreenfootImage("MarsClicked.png");  
   
    private boolean mouseDown;  
       
    public Mars() {  
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
            //Greenfoot.setWorld(new LevelMars());  
        }
         
    }   
}
