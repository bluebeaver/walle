import java.awt.*;

/**
 * Created by daria_bobrova on 10/5/14.
 */
public class Fence {
    public void draw(Graphics2D g2){
    g2.setColor(Color.BLACK);


    for(int i = 0; i < 50; i++) {
        g2.fillRect(i * 50, 500, 3, 125);
        g2.fillRect(i * 50, 500, 50, 3);
        g2.fillRect(i * 50, 550, 50, 3);
    }
    }
}
