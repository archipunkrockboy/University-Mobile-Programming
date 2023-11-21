package lab2;

import java.util.Date;

public class CreditScore extends Score {
    private int loan;
    private float percentage;
    private Date dateStart;

    public Date dateEnd;
    public CreditScore(int score, float percent, Date end) {
        super(score);
        setDateStart(new Date());
        setDateEnd(end);
        setPercentage(percent);
        setLoan((int) (score * getPercentage()));
    }
    @Override
    public void closeScore() {
        int current_score = getScore();
        if (current_score < getLoan()){
            System.out.println("Вы не можете закрыть счёт так как должны нам бабки");
        }
        else{
            setActive(false);
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Кредит взят: " + getDateStart());
        System.out.println("Дата возврата: " + getDateEnd());
        System.out.println("Сумма задолженности: " + (getLoan() - getScore()));
    }

    public int getLoan() {
        return loan;
    }
    public void setLoan(int l) {
        loan = l;
    }
    public Date getDateStart() {
        return dateStart;
    }
    public void setDateStart(Date date) {
        dateStart = date;
    }
    public Date getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(Date date) {
        dateEnd = date;
    }
    public float getPercentage() {
        return percentage;
    }
    public void setPercentage(float p) {
        percentage = p;
    }
}
