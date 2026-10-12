package Website2;

public class Main {

    public static void main(String[] args) {

        Coursera c = new Coursera();

        Teacher t1 = new Teacher("hos", "gmail", "123");
        Teacher t2 = new Teacher("aym", "hot", "123");

        Course c1 = new Course("java", "prog");
        Course c2 = new Course("sql", "db");
        Course c3 = new Course("plsql", "db");
        Course c4 = new Course("oop", "prog");

        sheet s1 = new sheet(1, "for java", "loop");
        sheet s2 = new sheet(2, "for sql", "select");
        sheet s3 = new sheet(3, "for plsql", "fun");
        sheet s4 = new sheet(4, "for oop", "inhert");

        lecture l1 = new lecture("1", "for java", "loop");
        lecture l2 = new lecture("2", "for sql", "select");
        lecture l3 = new lecture("3", "for plsql", "fun");
        lecture l4 = new lecture("4", "for oop", "inhert");
        
        c1.addNewLecture(l1);
        c1.addNewSheet(s1);
        
        c2.addNewLecture(l2);
        c2.addNewSheet(s2);
        
        c3.addNewLecture(l3);
        c3.addNewSheet(s3);
        
        c4.addNewLecture(l4);
        c4.addNewSheet(s4);
        
//        t1.addCourse(c1);
//        t1.addCourse(c2);
//        t2.addCourse(c3);
//        t2.addCourse(c4);
//        
        
        
        
    }

}
