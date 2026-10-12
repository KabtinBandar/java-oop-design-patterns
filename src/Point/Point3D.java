package Point;

public class Point3D extends Point2D {

    private float z;

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {getX(), getY(), z};
        return xyz;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

}
