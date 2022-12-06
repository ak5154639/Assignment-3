import java.applet.*;
import java.awt.*;
public class DrawGraph extends Applet{
    public void paint(Graphics G){
        G.drawLine(50, 50, 50, 450);
        G.drawLine(50, 450, 450, 450);
        G.drawString("Y", 40, 50);
        G.drawString("X", 450, 465);
        for(int i=50, count=0;i<450;i+=40){
            G.drawLine(i, 446, i, 454);
            G.drawString(Integer.toString(count), i-5, 470);
            G.drawLine(46, 500-i, 54, 500-i);
            G.drawString(Integer.toString(count++), 35, 500-i);
        }
        //points ats (7,3) and (6,6) and (2,2) with red marker
        G.setColor(Color.RED);
        G.fillRoundRect(327, 327, 6, 6, 6, 6);//Point(7,3)
        G.drawString("(7,3)", 335, 330);
        G.fillRoundRect(287, 207, 6, 6, 6, 6);//Point (6,6)
        G.drawString("(6,6)", 295, 210);
        G.fillRoundRect(127, 367, 6, 6, 6, 6);//Point (2,2)
        G.drawString("(6,6)", 135, 375);
        G.setColor(Color.MAGENTA);
        G.drawString("Discrete Graph Representing coordinates (7,3),(6,6) & (2,2)", 50, 500);
        
    }
}
