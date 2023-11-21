package lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Painter extends Frame {
    public static void main(String[] args) {
        //SimpleFrame rectangle_frame = new SimpleFrame("Rectangle", 700, 700);
        //rectangle_frame.add(new Rectangle(30, 40, 310, 150));

//        SimpleFrame circle_frame = new SimpleFrame("Circle", 700, 700);
//        circle_frame.add(new Circle(50, 50, 100, 100));

        SimpleFrame fir_frame = new SimpleFrame("Fir", 700, 700);
        fir_frame.add(new Fir());

    }

    static class Rectangle extends JComponent {
        public int x;
        public int y;
        public int width;
        public int height;

        public Rectangle (int x, int y, int height, int width) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        public void paint(Graphics g) {
            g.drawRect(this.x, this.y, this.width, this.height);
            g.fillRect(this.x, this.y, this.width, this.height);
        }
    }
    static class Circle extends JComponent {
        public int x;
        public int y;
        public int width;
        public int height;

        public Circle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        public void paint(Graphics g) {
            g.drawOval(this.x, this.y, this.width, this.height);
        }
    }

    static class Fir extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            // Звезда
            g.drawLine(500, 0, 480, 30);
            g.drawLine(500, 0, 520, 30);
            g.drawLine(480, 30, 450, 35);
            g.drawLine(520, 30, 550, 35);
            g.drawLine(450, 35, 470, 55);
            g.drawLine(550, 35, 530, 55);
            g.drawLine(470, 55, 465, 80);
            g.drawLine(530, 55, 535, 80);
            g.drawLine(465, 80, 500, 65);
            g.drawLine(535, 80, 500, 65);

            // Верхний уровень
            g.drawLine(465, 80, 425, 160);
            g.drawLine(535, 80, 575, 160);
            g.drawLine(425, 160, 575, 160);

            //Средний уровень
            g.drawLine(445, 160, 395, 240);
            g.drawLine(555, 160, 605, 240);
            g.drawLine(395, 240, 605, 240);

            //Нижний уровень
            g.drawLine(415, 240, 365, 330);
            g.drawLine(585, 240, 635, 330);
            g.drawLine(365, 330, 635, 330);

            //Ствол
            g.drawRect(480, 330, 50, 50);


        }
    }
}
class SimpleFrame extends Frame {
    SimpleFrame(String title, int width, int height) {
        super(title);
        setSize(width, height);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                dispose();
                System.exit(0);
            }
        });
    }
}

class HelloWorldFrame extends Frame {
    HelloWorldFrame(String s) {
        super(s);
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.ITALIC|Font.BOLD, 30)) ;
        g.drawString("Hello World yoptaaa", 20, 100);
    }

    public static void main(String[] args) {
        Frame frame = new HelloWorldFrame("kaif");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

