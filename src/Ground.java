import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Ground {
    private Graphics2D g2;
    public Ground(Graphics2D g22){
        g2=g22;


    }
    public void draw () {
        GradientPaint lighttodarkbrown = new GradientPaint(0, 625, new Color(69, 37, 6),0,675 , new Color(171, 83, 44));
        g2.setPaint(lighttodarkbrown);
        g2.fillRect(0, 625, 1200,600 );
   }
}
