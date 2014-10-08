import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Eva {
   public void draw(Graphics2D g2) {
       g2.setColor(Color.WHITE);

       g2.fillArc(790, 275, 175, 185, 0, 180);
       g2.fillOval(790, 350, 175, 30);
       g2.setColor(Color.BLACK);
       g2.fillArc(800,290,150,120,0,180);
       g2.fillOval(800,330,150,40);
   }
       public void paintComponent(Graphics2D g2,int degrees) {
           g2.setPaint(Color.white);
//           AffineTransform old = g2.getTransform();
//           g2.rotate(Math.toRadians(degrees));
           g2.rotate(Math.toRadians(-30));
           g2.fillOval(360, 770, 150, 50);
//           g2.setTransform(old);
           g2.rotate(Math.toRadians(30));

   }
    public void draw1(Graphics2D g2) {
        g2.setColor(new Color(234, 230, 227));
        g2.fillOval(800, 400, 175, 225);
        g2.fillRoundRect(800, 400, 175, 100, 40, 40);
        g2.setColor(Color.WHITE);
        g2.fillOval(945, 425, 50, 175);
        g2.setColor(new Color(75, 143, 191));
        g2.fillOval(830, 320, 35, 24);
        g2.fillOval(880,320,35,24);
        g2.setColor(Color.WHITE);
//        g2.fillOval(837,327,7,7);
//        g2.fillOval(887,327,7,7);
    }
}

