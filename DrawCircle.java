import java.applet.*;
import java.awt.*;

public class DrawCircle extends Applet{
    public void paint(Graphics G){
        G.drawRoundRect(00, 00, 400, 400, 400, 400);
        G.drawRoundRect(50, 50, 300, 300, 300, 300);
        G.drawRoundRect(100, 100, 200, 200, 200, 200);
        G.drawRoundRect(150, 150, 100, 100, 100, 100);
        G.setColor(Color.GREEN);
    }
}