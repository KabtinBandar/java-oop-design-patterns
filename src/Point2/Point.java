package Point2;

public class Point {

    float x;
    float y;

    public Point() {
    }

    public Point(float x, float y) {
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
    
        return new float [] {x,y};
    }
    
}
