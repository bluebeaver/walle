import java.awt.*;

/**
 * @author Vadim Bobrov
 */
public class Head {

    private Graphics2D g2;

    public Head(Graphics2D g22) {
        g2 = g22;
    }

    public void draw() {
        openEyes();
    }


    public void openEyes(){
        g2.setColor(new Color(69, 37, 6));
        g2.fillRect(350,305,130,50);
        g2.fillOval(340,305,20,50);
        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(340,315,130,50);
        g2.fillOval(330,315,20,50);
        g2.setColor(new Color(149, 147, 128));
        g2.fillOval(460,305,30,50);
        g2.fillOval(455,315,30,50);
        g2.setColor(Color.black);
        g2.fillOval(464,310,20,40);
        g2.fillOval(457,320,20,40);
        g2.setColor(Color.white);
        g2.fillOval(467,317,10,15);
        g2.fillOval(460,327,10,15);
    }

    public void closedEyes(){
        g2.setColor(new Color(69, 37, 6));
        g2.fillRect(350,305,130,50);
        g2.fillOval(340,305,20,50);
        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(340,315,130,50);
        g2.fillOval(330,315,20,50);
        g2.setColor(new Color(149, 147, 128));
        g2.fillOval(460,305,30,50);
        g2.fillOval(455,315,30,50);
        g2.setColor(Color.black);
        g2.fillOval(464,310,20,40);
        g2.fillOval(457,320,20,40);

    }


}
