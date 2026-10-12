package Website2;

import java.util.ArrayList;

public class Teacher {
    
    private String name;
    private String email;
    private String password;
    
    ArrayList<Course> loc;
    
    public Teacher(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        loc = new ArrayList();
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
   
    public void addNewCourse (Course c){
        System.out.println(loc.add(c));
    }
    
    public void deletCourse(String name) {
        int index = searchByName(name);
        if (index != -1) {
            loc.remove(index);
        } else {
            System.out.println("not found");
        }
        
    }
//

    private int searchByName(String name) {
        for (int i = 0; i < loc.size(); i++) {
            if (loc.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
}
