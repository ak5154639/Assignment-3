import java.applet.*;
import java.awt.*;

public class DrawSquare extends Applet {
    public void paint(Graphics G) {
        G.drawRect(0, 0, 400, 400);
        G.drawRect(50, 50, 300, 300);
        G.drawRect(100, 100, 200, 200);
        G.drawRect(150, 150, 100, 100);
    }
}
