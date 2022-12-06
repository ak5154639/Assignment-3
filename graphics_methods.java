import java.awt.*;

import java.applet.*;

public class graphics_methods extends Applet {

    public void paint(Graphics G){
        G.drawRoundRect(0, 0, 250, 250, 500, 500);
        G.drawArc(0, 0, 350, 350, 0, 360);
        
    }
}
