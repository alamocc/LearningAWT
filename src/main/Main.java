import demos.ColorDemo;
import demos.GraphicsDemo;
import demos.ResizeMeDemo;
import demos.XORDemo;

import java.awt.*;

void main() {
    testGraphicsDemo();
    testResizeMe();
    testColorDemo();
    testXORDemo();
}
// Test GraphicsDemo
private static void testGraphicsDemo() {
    GraphicsDemo appwindow = new GraphicsDemo();

    appwindow.setSize(new Dimension(370, 700));
    appwindow.setTitle("Graphics Demonstration");
    appwindow.setVisible(true);
}

// Test ResizeMeDemo
private static void testResizeMe() {
    ResizeMeDemo appwindow = new ResizeMeDemo();

    appwindow.setSize(200, 200);
    appwindow.setTitle("ResizeMe Demonstration on MouseRelease event");
    appwindow.setVisible(true);
}

// Test ColorDemo
private static void testColorDemo() {
    ColorDemo appwindow = new ColorDemo();

    appwindow.setSize(340, 260);
    appwindow.setTitle("Color Demonstration");
    appwindow.setVisible(true);
}

// Test XORDemo
private static void testXORDemo() {
    XORDemo appwindow = new XORDemo();

    appwindow.setSize(new Dimension(300, 260));
    appwindow.setTitle("XOR Drawing Mode Demonstration");
    appwindow.setVisible(true);
}