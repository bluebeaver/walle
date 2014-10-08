import java.awt.*;

/**
 * Created by daria_bobrova on 10/4/14.
 */
public class Walle {

    private Graphics2D g2;
    private Head head;

    public Walle(Graphics2D g22){
        g2=g22;
        head = new Head(g2);
    }

    public void draw() {
        mainsquare();
        drawtopside();
        drawleftside();
        drawwheel();
        design();
        arm();
        head.draw();

    }
    public void mainsquare () {
       g2.setColor(new Color(210, 105, 30));
       g2.fillRect(300, 450, 175, 175);
    }

    public void drawtopside() {
        int[] xVals = {300,475,425,250};
        int[] yVals = {450,450,400,400};
        g2.setColor(new Color(102, 51, 0));
        g2.fillPolygon(xVals, yVals, 4);
    }


    public void drawleftside(){
         int[] xVals= {250,300,300,250};
         int[] yVals = {400,450,625,575};
         g2.setColor(new Color(139, 70, 16));
         g2.fillPolygon (xVals,yVals,4);
    }

    public void drawwheel(){
        g2.setColor(Color.BLACK);
        g2.fillRect(475,525,65,140);
        g2.fillRect(220,525,80,140);
    }

    public void design(){
        g2.setColor(Color.lightGray);
        g2.fillRect(320, 470, 100, 50);
        g2.setColor(Color.darkGray);
        g2.fillRect(370,480, 40,30);
        g2.setColor(new Color(11, 188, 6));
        g2.fillOval(375,490,15,15);
        g2.setColor(Color.YELLOW);
        g2.fillRect(395,485, 13,22);
    }

    public void arm(){
        int[] xvals={265,375,375,265};
        int[] yvals={490,620,655,525};
        g2.setColor(new Color(255, 130, 36));
        g2.fillPolygon(xvals,yvals,4);
        int[] xvals1={475,475, 400,400};
        int[] yvals1={520,485,625,655};
        g2.setColor(new Color(255, 130, 37));
        g2.fillPolygon(xvals1,yvals1,4);
        g2.setColor(new Color(128, 83, 44));
        g2.fillRect(375,604,45,45);
        g2.setColor(new Color(81, 40, 13));
        g2.fillRect(370,610,45,45);
        int[]xvals3={350,375,390,365};
        int[]yvals3={430,430,350,350};
        g2.fillPolygon(xvals3,yvals3,4);

    }

}


