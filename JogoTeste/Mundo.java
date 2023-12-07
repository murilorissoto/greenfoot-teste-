import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Mundo here.
 * 
 * @author Murilo 
 * @version 0.1 Alpha
 */

    public class Mundo extends World
    
    {   
    private GreenfootSound bgMusic = new GreenfootSound("Yamamoto- Ryu Theme STREET FIGHTER II.mp3");
    public void started()
    {
    bgMusic.playLoop();
}

    public void stopped()
    {   
    bgMusic.pause();
}
    public Mundo(){    
    super(1000, 600, 1); 
    addObject(new p2(), 300, 400);
    addObject(new p3(), 700, 400);
    prepare();
}
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Inimigo p2 = new Inimigo(100); // 100 é o dano que o inimigo causa
        addObject(p2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));

        Inimigo p3 = new Inimigo(100); // é o dano que o inimigo causa
        addObject(p3, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Counter counter = new Counter();
        addObject(counter,296,241);
        Counter2 counter2 = new Counter2();
        addObject(counter2,697,247);
        removeObject(counter2);
        Counter2 counter22 = new Counter2();
        addObject(counter22,694,240);
    }    
}
    class Inimigo extends Actor {
    private int dano;
    public Inimigo(int dano) {
        this.dano = dano;
    }
    public void act() {
        if (isTouching(Counter.class)) {
            Counter counter = (Counter) getOneIntersectingObject(Counter.class);
            counter.aplicarDano(dano);
            getWorld().removeObject(this); // Remover inimigo após aplicar dano
        }
    }
}