package calc;

import java.awt.*;

public class JavaApplication1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 2));
        System.out.println(calc.mult(5, 12));
        System.out.println(calc.and(14, 10));

    }
}
