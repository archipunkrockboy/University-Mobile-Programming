package lab1;

import java.awt.*;

public class JavaApplication1 {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Hello World!");
        Calculator calc = new Calculator();
        System.out.println("2+5=" + calc.sum(5, 2));

        // Задание 2
        //Graphics g;
        //Painter painter = new Painter();
        //painter.drawLine(g);
    }
    public static class Adder {
        private int sum;
        public Adder() { sum=0; }
        public Adder(int a) {this.sum = a; }

        public void add(int b) {
            sum += b;
        }

        public int getSum() { return sum; }
    }

    public static class Calculator {
        public int sum (int... a) {
            Adder adder = new Adder();
            for(int i:a)
            {
                adder.add(i);
            }
            return adder.getSum();
        }
    }
}
