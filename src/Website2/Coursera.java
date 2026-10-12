package Website2;

import java.util.ArrayList;

public class Coursera {

    ArrayList<Teacher> lot;

    public Coursera() {
        lot = new ArrayList();
    }

    public void registerTeacher(String name, String mail, String password) {
        Teacher t = new Teacher(name, mail, password);
        System.out.println(lot.add(t));
    }

    public void loginTeacher(String name, String password) {
        for (int i = 0; i < lot.size(); i++) {
            String n = lot.get(i).getName() ;
            String p = lot.get(i).getPassword() ;
            if (n.equals(name) && p.equals(password)) {
                System.out.println("Welcome");
            }
        }
        System.out.println("not found");
    }
}


