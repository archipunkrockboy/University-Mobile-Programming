package lab2;


import java.util.Date;

public class DepositScore extends Score {
    private float percentage;
    private Date dateStart;

    public DepositScore(int sum, float percent){
        super(sum);
        setPercentage(percent);
    }
    @Override
    public void closeScore() {
        getMoney(score);
        isActive = false;
    }

    @Override
    public void getInfo() {
        System.out.println("Бабок на депозитном счету: " + getScore());
        System.out.println("Срок депозита: " + (new Date().getTime() - getDateStart().getTime()));
    }
    public Date getDateStart() {
        return dateStart;
    }
    public void setDateStart(Date date){
        dateStart = date;
    }
    public float getPercentage() {
        return percentage;
    }
    public void setPercentage(float p) {
        percentage = p;
    }
}
