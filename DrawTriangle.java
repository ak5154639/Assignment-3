import java.applet.*;
import java.awt.*;

public class DrawTriangle extends Applet{
    public void paint(Graphics g) {
        g.drawLine(300, 0, 600, 600);
        g.drawLine(0, 600, 600, 600);
        g.drawLine(0, 600, 300, 0);
        g.drawLine(300, 100, 500, 500);
        g.drawLine(100, 500, 500, 500);
        g.drawLine(100, 500, 300, 100);
        g.drawLine(300, 200, 400, 400);
        g.drawLine(200, 400, 400, 400);
        g.drawLine(200, 400, 300, 200);
    }
}
