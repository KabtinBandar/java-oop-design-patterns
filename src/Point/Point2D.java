package Point;

public class Point2D {

    float x;
    float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
       float [] xy = {x,y};
       return xy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    
    
}
