import task1.MyDate;


public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(1, 5, 8);
        MyDate date2 = new MyDate(1, 6, 8);
        System.out.println(date1.equals(date2));
    }
}