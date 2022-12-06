import java.applet.*;
import java.awt.*;

public class DrawSpiral1 extends Applet {
    public void paint(Graphics G) {
        drawSpiral1(G);
        drawSpiral2(G);
        drawSpiral3(G);
        drawSpiral4(G);
        drawSpiral5(G);
        // drawSpiral6(G);
    }

    void drawSpiral1(Graphics G) {
        Graphics2D g2 = (Graphics2D) G;
        g2.translate(250, 250);
        int x1 = 0;
        int y1 = 0;
        int x2;
        int y2;
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.CAP_ROUND));
        for (int i = 0; i < 2000; i++) {
            double t = i * Math.PI / 180;
            x2 = (int) ((int) 5 * t * Math.sin(t));
            y2 = (int) ((int) 5 * t * Math.cos(t));
            g2.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }

    void drawSpiral2(Graphics G){
        Graphics2D g2 = (Graphics2D) G;
        g2.translate(400, 0);
        int x1 = 0;
        int y1 = 0;
        int x2;
        int y2;
        g2.setStroke(new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.CAP_ROUND));
        for (int i = 0; i < 3000; i++) {
            double t = i * Math.PI / 180;
            x2 = (int) ((int) 2 * t * Math.sin(t));
            y2 = (int) ((int) 2 * t * Math.cos(t));
            g2.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
    void drawSpiral3(Graphics G){
        Graphics2D g2 = (Graphics2D) G;
        g2.translate(400, 0);
        int x1 = 0;
        int y1 = 0;
        int x2;
        int y2;
        g2.setStroke(new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.CAP_ROUND));
        for (int i = 0; i < 720; i++) {
            double t = i * Math.PI / 180;
            x2 = (int) ((int) 15 * t * Math.cos(t));
            y2 = (int) ((int) 15 * t * Math.sin(t));
            g2.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
    void drawSpiral4(Graphics G){
        Graphics2D g2 = (Graphics2D) G;
        g2.translate(500, 0);
        int x1 = 0;
        int y1 = 0;
        int x2;
        int y2;
        g2.setStroke(new BasicStroke(20,BasicStroke.CAP_ROUND,BasicStroke.CAP_ROUND));
        for (int i = 180; i < 1350; i++) {
            double t = i * Math.PI / 180;
            x2 = (int) ((int) 10 * t * Math.cos(t));
            y2 = (int) ((int) 10 * t * Math.sin(t));
            x1 = (int) ((int) 10 * t * Math.cos(t));
            y1 = (int) ((int) 10 * t * Math.sin(t));
            g2.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
    void drawSpiral5(Graphics G){
        Graphics2D g2 = (Graphics2D) G;
        g2.translate(-1300, 400);
        int x1 = 0;
        int y1 = 0;
        int x2;
        int y2;
        g2.setStroke(new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.CAP_ROUND));
        for (int i = 360; i < 2550; i++) {
            double t = i * Math.PI / 180;
            x1 = (int) ((int) 3 * t * Math.cos(t));
            y1 = (int) ((int) 3 * t * Math.sin(t));
            x2 = (int) ((int) 3 * t * Math.cos(t));
            y2 = (int) ((int) 3 * t * Math.sin(t));
            g2.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
    
//     void drawSpiral6(Graphics G) {
//         Graphics2D g2 = (Graphics2D) G;
//         g2.translate(400, 0);
//         int x1 = 0;
//         int y1 = 0;
//         int x2;
//         int y2;
//         g2.setColor(Color.GRAY);
//         for (int i = 0,wid=1,open=1; i < 1000; i++) {
//             double t = i * Math.PI / 180;
//             x2 = (int) ( (open/100) * t * Math.sin(Math.PI));
//             y2 = (int) ( (open/100) * t * Math.cos(Math.PI));
//             g2.setStroke(new BasicStroke(wid, BasicStroke.CAP_ROUND, BasicStroke.CAP_ROUND));
//             g2.drawLine(x1, y1, x2, y2);
//             if(i%10==0){
//                 if(i<500){wid++;}
//                 else{wid--;}
//             }
//             open++;
//             x1 = x2;
//             y1 = y2;
//         }
//     }
}
