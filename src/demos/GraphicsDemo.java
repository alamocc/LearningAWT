package demos;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsDemo extends Frame {
    public GraphicsDemo() {

        // Anonymous inner class to handle window close events
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });

        // Set background and foreground colors
        setBackground(Color.white);
        setForeground(Color.BLUE);
    }

    @Override
    public void paint(Graphics g) {

        // Drawing a string
        g.drawString("Test String", 20, 110);

        // Drawing lines
        g.drawLine(20, 40, 100, 90);
        g.drawLine(20, 90, 100, 40);
        g.drawLine(40, 45, 250, 80);

        // Drawing rectangles
        g.drawRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
        g.drawRoundRect(200, 150, 60, 50, 15, 15);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);

        // Drawing elipses and circles
        g.drawOval(20, 250, 50, 50);
        g.fillOval(100, 250, 75, 50);
        g.drawOval(200, 260, 100, 40);

        // Drawing arcs
        g.drawArc(20, 350, 70, 70, 0, 180);
        g.fillArc(70, 350, 70, 70, 0, 75);

        // Drawing a polygon
        int[] xpoints = {20, 200, 20, 200, 20};
        int[] ypoints = {450, 450, 650, 650, 450};
        int num = 5;

        Polygon p = new Polygon(xpoints, ypoints, num);
        g.drawPolygon(p);
    }

}
