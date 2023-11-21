package calc.operation;

public class Multiplier {
    private int pr;
    public Multiplier() { pr=1; }
    public Multiplier(int a) {this.pr = a; }
    public void mult(int b) {
        pr *= b;
    }
    public int getPr() { return pr; }
}