import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class TelaInicial.
     * 
     */
    public int temp = 50;
    public int temp1 = 50;
    public int temp2 = 50;
    public int temp3 = 50;
    GifImage myGifintro = new GifImage ("4.gif");
   

    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void act(){
    temp--;
    
    if(Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("1.jpg"));
        temp1--;
    }
    if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("2.jpg"));
        temp2--;
    }
    if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        setBackground(new GreenfootImage("4.gif"));
        setBackground(myGifintro.getCurrentImage());
        temp3--;
    }
    if (Greenfoot.isKeyDown("enter") && (temp3< 1)){
        World world = new Mundo();
        Greenfoot.setWorld(world);
        }
    }   
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        
    }
}