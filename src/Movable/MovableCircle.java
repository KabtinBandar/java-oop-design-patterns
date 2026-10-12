package Movable;

public class MovableCircle implements Movable{
int radius  ;  
MovablePoint center  ; 

    public MovableCircle(int radius , int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center  =  new MovablePoint(x, y, xSpeed, ySpeed);
    }
    
        

    @Override
    public void moveUp() {
        System.out.println("MovableCircle up");
    }

    @Override
    public void moveDown() {
        System.out.println("MovableCircle down");
    }

    @Override
    public void moveLeft() {
        System.out.println("MovableCircle left");
    }

    @Override
    public void moveRight() {
        System.out.println("MovableCircle rigth");
    }
     


    
}
