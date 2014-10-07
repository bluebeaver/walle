import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Star {
    private Graphics2D g2;
    private int x;
    private int y;
    private int a;
    private int b;

    public Star (Graphics2D g22,int ex, int why,int aa,int bb){
        g2=g22;
        x=ex;
        y=why;
        a=aa;
        b=bb;
    }

    public void drawwhite(Graphics2D g2){
       g2.setColor(Color.WHITE);
       g2.fillOval(x,y ,5,5);}
    public void drawyellow(Graphics2D g2) {
        g2.setColor(Color.YELLOW);
        g2.fillOval(a, b, 7, 7);
    }


    }







