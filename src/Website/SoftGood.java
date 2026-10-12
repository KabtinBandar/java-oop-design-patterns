
package Website;

public class SoftGood extends Product{
    private double sizeInMB;

    public SoftGood(double sizeInMB, String name, double price, double discount, int quantity, String desc) {
        super(name, price, discount, quantity, desc);
        this.sizeInMB = sizeInMB;
    }

    public SoftGood() {
       
    }

    public double getSizeInMB() {
        return sizeInMB;
    }

    public void setSizeInMB(double sizeInMB) {
        this.sizeInMB = sizeInMB;
    }
    
    
    
    
}
