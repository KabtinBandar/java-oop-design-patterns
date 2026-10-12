package Website;

public class Product {

    private String name;
    private double price;
    private double discount;
    private int quantity;
    private String desc;

    public Product(String name, double price, double discount, int quantity, String desc) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.desc = desc;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", discount=" + discount + ", quantity=" + quantity + ", desc=" + desc + '}';
    }
    
    
    
}
