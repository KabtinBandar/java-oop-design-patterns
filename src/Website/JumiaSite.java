package Website;

import java.util.ArrayList;

public class JumiaSite {

    ArrayList<Product> lop;
    ArrayList<Visitor> lov;

    public JumiaSite() {
        lop = new ArrayList();
        lov = new ArrayList();
    }

    public void addVisitor(String name, String mail) {
        Visitor v = new Visitor(name, mail);
        System.out.println(lov.add(v));
    }

    public void addProduct(Product p) {
        System.out.println(lop.add(p));
    }

    public void removeProduct(String productNmae) {
        int index = searchByName(productNmae);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println(lop.remove(index));
        }
    }

    public int searchByName(String productNmae) {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i).getName().equals(productNmae)) {
                return i;
            }
        }
        return -1;
    }
    
        public int searchByPrice(double productprice) {
        for (int i = 0; i < lop.size(); i++) {
            if (lop.get(i).getPrice() == productprice) {
                return i;
            }
        }
        return -1;
    }



}
