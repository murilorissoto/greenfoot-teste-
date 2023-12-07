import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola_De_Fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class power extends p2
{
    /**
     * Act - do whatever the power wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     moveAtaque();
     acertarAlvo();
    }
    
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation());
    int x = (int) Math.round(getX() + Math.cos(angle));
    int y = (int) Math.round(getY() + Math.sin(angle));
    
    setLocation(x, y);
    }


    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(p3.class);
    if(b !=null){
        
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        
        getWorld().removeObject(b);
        getWorld().removeObject(this);
    }
    }  
}
