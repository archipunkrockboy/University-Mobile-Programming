package calc;

import calc.operation.*;

public class Calculator {
    public int sum (int... a) {
        Adder adder = new Adder();
        for (int i:a) {
            adder.add(i);
        }
        return adder.getSum();
    }
    public int mult(int...a) {
        Multiplier multiplier = new Multiplier();
        for (int i:a){
            multiplier.mult(i);
        }
        return multiplier.getPr();
    }
    public String and(int...a) {
        OperatorAnd operatorAnd = new OperatorAnd(a[0]);
        for (int i:a){
            operatorAnd.and(i);
        }
        return operatorAnd.getStrResult();
    }
}
