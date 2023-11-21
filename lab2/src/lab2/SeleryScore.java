package lab2;

public class SeleryScore extends Score {

    public SeleryScore() {
        super(0);
    }
    public SeleryScore(int sum) {
        super(sum);
    }

    @Override
    public void closeScore() {
        getMoney(score);
        setActive(false);
    }

    @Override
    public void getInfo() {
        System.out.println("Бабок на зарплатном счету: " + getScore());
    }
}
