import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Moon {
    public void drawMoon (Graphics2D g2) {
        GradientPaint yellowtowhite = new GradientPaint(0, 0, Color.YELLOW, 0, 600, Color.white);
        g2.setPaint(yellowtowhite);
        g2.fillOval(150, 100, 900, 900);
    }
}
