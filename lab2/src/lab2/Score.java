package lab2;

import task1.MyDate;

public abstract class Score {
    protected int score;
    protected boolean isActive;

    public Score(int sum) {
        setScore(sum);
        setActive(true);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Score) {
            return score == ((Score) obj).getScore();
        }
        return false;
    }
    @Override
    public String toString() {
        return String.valueOf(getScore());
    }
    public void putMoney(int money){
        score += money;
    }
    public void getMoney(int money){
        score -= money;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int s){
        score = s;
    }
    public boolean getActive(){
        return isActive;
    }
    public void setActive(boolean active){
        isActive = active;
    }

    public abstract void closeScore();

    public abstract void getInfo();

}
