import java.awt.*;

/**
 * Created by daria_bobrova on 10/7/14.
 */
public class Shoe {
    public void draw(Graphics2D g2){
        g2.setColor(new Color(129, 59, 19));
        g2.fillOval(600,600,40,40);
        g2.fillRoundRect(655,568,40,70,10,10);
        g2.fillOval(600,605,80,35);
        g2.fillOval(645,585,50,50);
        g2.setColor(new Color(69, 43, 5));
        g2.fillRect(605,635,50,10);
        g2.fillRect(665,635,30,10);
        g2.fillOval(655,568,40,15);
        g2.setColor(new Color(25, 172, 26));
        g2.fillRect(673,530,3,45);
        g2.fillOval(673,540,20,10);
        g2.fillOval(653,550,20,10);
    }

}
