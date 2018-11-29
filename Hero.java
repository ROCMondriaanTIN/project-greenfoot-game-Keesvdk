
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("luffy.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("up")&&(onGround() == true)) {
            velocityY = -17;
        } else if (Greenfoot.isKeyDown("w")&&(onGround() == true)) {
            velocityY = -17;
        }
        
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
            setImage("luffyLeft.png");
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            setImage("luffyRight.png");
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
            setImage("luffyRight.png");
        } else if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
            setImage("luffyLeft.png");
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
