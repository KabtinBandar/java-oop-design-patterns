package Date;

public class Main {
  
    public static void main(String[] args) {
        
        Date  d  =  new Date(8, 3, 2024);
        System.out.println(d);
        
        d.setDay(23);
        d.setMonth(4);
        System.out.println(d);
    }
    
}
