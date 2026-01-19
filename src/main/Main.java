import main.GraphicsDemo;

import java.awt.*;

void main() {
    testGraphicsDemo();
}

private static void testGraphicsDemo() {
    GraphicsDemo appwindow = new GraphicsDemo();

    appwindow.setSize(new Dimension(370, 700));
    appwindow.setTitle("Graphics Demonstration");
    appwindow.setVisible(true);
}