package demos;

import java.awt.*;
import java.awt.event.*;


public class ResizeMeDemo extends Frame {

    final int INC = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    public ResizeMeDemo() {
        // Anonymous inner class to handle mouse release events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent me) {
                int w = (d.width + INC) > max ? min : d.width + INC;
                int h = (d.height + INC) > max ? min : d.height + INC;
                setSize(new Dimension(w, h));
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
    //  paint method to draw diagonal lines
    @Override
    public void paint(Graphics g) {
        // Get the insets and size of the window
        Insets i = getInsets();
        d = getSize();

        g.drawLine(i.left, i.top, d.width-i.right, d.height-i.bottom);
        g.drawLine(i.left, d.height-i.bottom, d.width-i.right, i.top);
    }
}
