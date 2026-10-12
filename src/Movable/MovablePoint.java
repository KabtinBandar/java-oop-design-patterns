package Movable;

public class MovablePoint implements Movable{
     int x  ; 
     int  y ; 
     int xSpeed  ; 
     int ySpeed ; 

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("movable up");
    }

    @Override
    public void moveDown() {
        System.out.println("movable down");
    }

    @Override
    public void moveLeft() {
        System.out.println("movable left");
    }

    @Override
    public void moveRight() {
        System.out.println("movable rigth");
    }
     
     
          
}