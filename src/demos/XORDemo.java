package demos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


// Demonstrate XOR drawing mode
public class XORDemo extends Frame {

    int chsX = 100;
    int chsY = 100;

    public XORDemo() {

        // Anonymous inner class to handle mouse motion events
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();

                chsX = x-5;
                chsY = y-5;
                repaint();
            }
        });

        // Anonymous inner class to handle window close events
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    // paint method to draw rectangles and XOR crosshair
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(20, 40, 60, 70);

        g.setColor(Color.blue);
        g.fillRect(110, 40, 60, 70);

        g.setColor(Color.black);
        g.fillRect(200, 40, 60, 70);

        g.setColor(Color.red);
        g.fillRect(60, 120, 160, 110);

        // XOR Crosshair
        g.setXORMode(Color.black);
        g.drawLine(chsX-20, chsY, chsX+20, chsY);
        g.drawLine(chsX, chsY-20, chsX, chsY+20);
        g.setPaintMode();
    }

}
