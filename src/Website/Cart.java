package Website;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> lop;

    public Cart() {
        lop = new ArrayList();
    }

    public void addProduct(Product p) {
        System.out.println(lop.add(p));
    }

    public void removeProduct(String productNmae) {
        int index  =  searchByName(productNmae);
        
        if  (index   == -1){
            System.out.println("not found");
        }else {
            System.out.println(lop.remove(index));
        }
    }

    private int searchByName(String productNmae) {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i).getName().equals(productNmae)) {
                return i;
            }
        }
        return -1;
    }
    
    public double totalPrice(){
        double  total  =  0 ;
        for (int i = 0; i < lop.size(); i++) {
               total  = total + lop.get(i).getPrice();
        }
        return total;
    }
    
     public double totalAfterDiscount(){
       double  total = 0 ;
         for (int i = 0; i < lop.size(); i++) {
             double disc = lop.get(i).getDiscount();
             double price = lop.get(i).getPrice();
             
            total  += price  -  (price * disc / 100);
         }
         return total;
    }
    
    
    
}
