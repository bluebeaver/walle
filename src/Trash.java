import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Trash {
    private int x;
    private int y;
    private int r;
    private int g;
    private int b;
    private int re;
    private int gree;
    private int blu;

    public Trash(int ex, int why, int rr, int gg, int bb,int red, int green, int blue){
     x=ex;
     y=why;
     r=rr;
     g=gg;
     b=bb;
     re=red;
     gree=green;
     blu=blue;

    }

    public int randomInt(int from, int to){
        return (int)(Math.random()* (to - from) + from);
    }

    public void draw1(Graphics2D g2) {
        int[] xVals = {x, x + 20, x + 30, x + 5, x - 5};
        int[] yVals = {y, y + 10, y + 15, y + 22, y + 8};
        GradientPaint trashgradient = new GradientPaint(0, 575, new Color(r, g, b), 0, 700, new Color(re, gree, blu));
        g2.setPaint(trashgradient);
        g2.fillPolygon(xVals, yVals, 5);
    }
    public void draw2(Graphics2D g2) {
        int[] xVals1 = {x, x - 10, x + 20, x + 30, x + 25};
        int[] yVals1 = {y, y + 20, y + 30, y + 18, y - 5};
        GradientPaint trashgradient2 = new GradientPaint(0, 575, new Color(r, g, b), 0, x+10, new Color(re, gree, blu));
        g2.setPaint(trashgradient2);
        g2.fillPolygon(xVals1, yVals1, 5);
    }
    public void draw3(Graphics2D g2) {
        int[] xVals2 = {x, x - 30, x - 15, x + 5, x + 25};
        int[] yVals2 = {y, y + 10, y + 20, y + 18, y - 2};
        GradientPaint trashgradient3 = new GradientPaint(0, 575, new Color(r, g, b), 0, 700, new Color(re, gree, blu));
        g2.setPaint(trashgradient3);
        g2.fillPolygon(xVals2, yVals2, 5);
    }
    }

