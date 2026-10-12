package Date;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Faild Input Day");
        }
    }

    public void setMonth(int month) {

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Faild Input month");
        }

    }

    public void setYear(int year) {
        if (year >= 9999) {
            System.out.println("Faild Input year");
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public void setYear(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
