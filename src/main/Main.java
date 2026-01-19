import demos.GraphicsDemo;
import demos.ResizeMeDemo;

import java.awt.*;

void main() {
    testGraphicsDemo();
    testResizeMe();
}

private static void testGraphicsDemo() {
    GraphicsDemo appwindow = new GraphicsDemo();

    appwindow.setSize(new Dimension(370, 700));
    appwindow.setTitle("Graphics Demonstration");
    appwindow.setVisible(true);
}

private static void testResizeMe() {
    ResizeMeDemo appwindow = new ResizeMeDemo();

    appwindow.setSize(200, 200);
    appwindow.setTitle("ResizeMe Demonstration on MouseRelease event");
    appwindow.setVisible(true);
}