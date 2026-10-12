package Vechicl;

public class Vichele {

    public static String Make = "Augur";
    public static int numVehicles = 0;
    private String ChassisNo;
    private String model;

    public Vichele(String model) {
        numVehicles++;
        ChassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicl manufactured");
    }

    public String getChassisNo() {
        return ChassisNo;
    }

    public void setChassisNo(String ChassisNo) {
        this.ChassisNo = ChassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    

}
