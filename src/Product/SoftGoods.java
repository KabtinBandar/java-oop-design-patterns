/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Ayman Samy
 */
public class SoftGoods extends Product {

    private String size_in_MB;

    public SoftGoods(String size_in_MB, String name, double price, int quantity, double discount, int desc) {
        super(name, price, quantity, discount, desc);
        this.size_in_MB = size_in_MB;
    }

    public String getSize_in_MB() {
        return size_in_MB;
    }

    public void setSize_in_MB(String size_in_MB) {
        this.size_in_MB = size_in_MB;
    }

}
