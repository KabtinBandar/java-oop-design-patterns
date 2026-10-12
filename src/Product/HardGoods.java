/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Ayman Samy
 */
public class HardGoods extends Product {

    private String delivery_address;

    public HardGoods(String delivery_address, String name, double price, int quantity, double discount, int desc) {
        super(name, price, quantity, discount, desc);
        this.delivery_address = delivery_address;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

}
