import java.awt.*;

/**
 * Created by daria_bobrova on 10/7/14.
 */
public class Shadow {
    public void draw (Graphics2D g2) {
        g2.setColor(new Color(55, 39, 7));
        int[] xVals = {220, 540, 465, 150};
        int[] yVals = {625, 625, 750, 750};
        g2.fillPolygon(xVals, yVals, 4);
    }
    public void paintComponent(Graphics2D g2) {
        g2.setPaint(new Color(55,39,7));
        g2.rotate(Math.toRadians(30));
        g2.fillOval(1015, 100, 175, 400);
        g2.rotate(Math.toRadians(-30));

    }
}
