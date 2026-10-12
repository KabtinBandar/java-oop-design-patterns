
package Website;

public class HardGood extends Product{
    private String address ;

  

    public HardGood() {
    }

    public HardGood(String address, String name, double price, double discount, int quantity, String desc) {
        super(name, price, discount, quantity, desc);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
