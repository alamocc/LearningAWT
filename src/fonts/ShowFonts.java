package fonts;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowFonts extends Frame {

    String msg = "First five fonts: ";
    GraphicsEnvironment ge;
    String[] fontlist;

    public ShowFonts() {

        // Anonymous inner class to handle window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // get the graphics environment
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // obtains a list of the fonts
        fontlist = ge.getAvailableFontFamilyNames();

        // creates a string of the first 5 fonts
        int i = 0;
        while(i < 5 && i < fontlist.length) {
            msg += fontlist[i] + " ";
            i++;
        }
    }

    // paint method to display fonts
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public String[] getFontlist() {
        return this.fontlist;
    }
}
