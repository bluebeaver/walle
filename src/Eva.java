import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Eva {
   public void draw(Graphics2D g2) {
       g2.setColor(new Color(23, 16, 1));
       g2.fillOval(800, 400, 175, 275);
       g2.fillRoundRect(800, 400, 175, 125, 40, 40);
       g2.setColor(Color.WHITE);
       g2.fillOval(945,450,50,175);
       g2.fillArc(790,325);
   }
//       public void paintComponent(Graphics g,int degrees) {
//           Graphics2D g2d = (Graphics2D)g;
//           AffineTransform old = g2d.getTransform();
//          // g2d.rotate(Math.toRadians(degrees));
//           g2d.setPaint(Color.white);
//           g2d.fillOval(650, 475, 100, 30);
//           g2d.rotate(Math.toRadians(degrees));
//           g2d.setTransform(old);

   }

