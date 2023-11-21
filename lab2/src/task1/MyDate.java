package task1;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof MyDate date) {
            return (day == date.day) && (month == date.month) && (year == date.year);
        }
        return false;
    }
}
