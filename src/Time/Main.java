package Time;

public class Main {

    public static void main(String[] args) {

        Time t = new Time(3, 5, 4);
        System.out.println(t);

        for (int i = 0; i < 60; i++) {
            Time t2 = t.nextSecond();
            System.out.println(t2);
        }
    }

}
