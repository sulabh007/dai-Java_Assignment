/*Display a filled circle in a frame. Use method g.fillOval(--------);
 * Make this circle move/toggle  between left and right walls of frame as shown below. 
 * Use Multithreading.*/

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class MovingBall extends Frame implements Runnable {
    Thread t1;
    int x1;

    public MovingBall() {
        x1 = 200;
        t1 = new Thread(this, "ball");
        t1.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.fillOval(x1, 250, 100, 100);
    }

    public void run() 
    {
        while (true) 
        {
            if (Thread.currentThread() == t1) 
            {
                while (x1 != this.getWidth()-100) 
                {
                    x1++;
                    repaint();
                    if (x1 == this.getWidth()-100) 
                    {
                        while (x1 != 0) 
                        {
                            x1--;
                            repaint();
                            try {
                                Thread.sleep(5);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    repaint();
                    try 
                    {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        MovingBall fr = new MovingBall();
        fr.setSize(600, 600);
        fr.setVisible(true);
    }
}
