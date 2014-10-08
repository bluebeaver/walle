import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Ground {
    private Graphics2D g2;
    private int x;
    private int y;
    private int x1;
    private int y1;
    public Ground(Graphics2D g22,int xx,int yy,int x1x,int y1y){
        g2=g22;
        x=xx;
        y=yy;
        x1=x1x;
        y1=y1y;


    }
    public void draw () {

        for (int i = 0; i < 15; i++) {
            GradientPaint lighttodarkbrown = new GradientPaint(0, 625, new Color(255,242,157), 0, 655+i*30, new Color(66,42,12));
            g2.setPaint(lighttodarkbrown);
            g2.fillRect(0, 625 + i * 30, 1200, 30);
        }

   }
}
