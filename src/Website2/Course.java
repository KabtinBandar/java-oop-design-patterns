package Website2;

import java.util.ArrayList;

public class Course {

    private String name;
    private String description;

    ArrayList<lecture> lol;
    ArrayList<sheet> los;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        lol = new ArrayList();
        los = new ArrayList();

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewSheet(sheet s) {
        System.out.println(los.add(s));
    }

    public void deleteSheet(String name) {
        int index = searchByName(name);
        if (index != -1) {
            System.out.println(los.remove(index));
        } else {
            System.out.println("notfound");
        }
    }

    private int searchByName(String name) {
        for (int i = 0; i < los.size(); i++) {
            if (los.get(i).getFileName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
    
    public void addNewLecture(lecture l) {
        System.out.println(lol.add(l));
    }

    public void deleteLecture(String name) {
        int index = searchByLectureName(name);
        if (index != -1) {
            System.out.println(los.remove(index));
        } else {
            System.out.println("notfound");
        }
    }

    private int searchByLectureName(String name) {
        for (int i = 0; i < lol.size(); i++) {
            if (lol.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
