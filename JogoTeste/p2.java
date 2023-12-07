import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kanye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2 extends Actor 
{
    GifImage myGif = new GifImage("wp2.gif");
    GifImage mygf = new GifImage("leftp2.gif");
    GifImage myGiif = new GifImage("wp2.gif");
    public int speed=3;
    private int speedY = 0;
    private static final int GRAVITY = 1; 
    int direction = 1;
    /**
     * Act - do whatever the kanye wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if (canMove()) {
        movimento();
        }
    else {
        turnLeft();
    }
        {
            setImage(myGif.getCurrentImage() );
    }
    }

    /**
     * Move one step forward.
     */
    public void move()
    {
        move(1);
    }
   
    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft()
    {
        turn(-90);
    }

    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }
   
    public void movimento() {
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
            setRotation(360);
            setImage(mygf.getCurrentImage());
            direction = 2;
        }
         else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
            setRotation(360);
            setImage(myGiif.getCurrentImage());
            direction = 1;
        } 
         else if(direction==2){
             setImage(mygf.getCurrentImage());
         }
            else if (Greenfoot.isKeyDown("f")) {
        getWorld().addObject(new power(), getX() -1, getY() -10);
        } else {
    }
    }
   
    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
       
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
       
        return !facingEdge;
    }
}
