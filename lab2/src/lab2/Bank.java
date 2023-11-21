package lab2;

import java.util.Calendar;
import java.util.Date;

public class Bank {

    public static void main(String[] args) {
        Score[] scores = new Score[7];
        scores[0] = new SeleryScore(150);
        scores[1] = new DepositScore(10, 5);
        scores[2] = new CreditScore(10, 20, new Date(2025, Calendar.JANUARY, 1));

        scores[3] = new SeleryScore(150);
        scores[4] = new DepositScore(10, 6);
        scores[5] = new CreditScore(10, 20, new Date(2026, Calendar.JANUARY, 1));

        System.out.println(scores[0].equals(scores[3]));
        System.out.println(scores[1].equals(scores[4]));
        System.out.println(scores[2].equals(scores[5]));

        scores[3].putMoney(150);
        System.out.println(scores[0].equals(scores[3]));
        scores[3].getInfo();
    }
}
