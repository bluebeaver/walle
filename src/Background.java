/**
 * Created by daria_bobrova on 10/3/14.
 */

import java.awt.*;

public class Background {


      public void drawBackground (Graphics2D g2) {
          GradientPaint purpletopink = new GradientPaint(0, 0, new Color(71, 0, 100), 0, 600, Color.pink);
          g2.setPaint(purpletopink);
          g2.fillRect(0, 0, 1200, 750);
      }

    }




