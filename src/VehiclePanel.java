import javax.swing.*;
import java.awt.*;

/**
 * Created by daria_bobrova on 10/3/14.
 */
public class VehiclePanel extends JPanel {

    public VehiclePanel() {
        setPreferredSize(new Dimension(1200, 750));

    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Background one = new Background();
        one.drawBackground(g2);
        for(int i =0; i < 100; i++) {
            Star starry = new Star(g2,(int)(Math.random() * 1200), (int) (Math.random() * 750), (int)( Math.random() * 1200),
            (int) (Math.random() * 750));
            starry.drawwhite(g2);
            starry.drawyellow(g2);
        }
            Moon moony = new Moon();
            moony.drawMoon(g2);
//        LightPost lightposty=new LightPost();
//        lightposty.draw(g2);




     //for(int i =0; i < 1000; i++) {
         Ground ground = new Ground(g2, random(0, 1200), random(625, 750), random(0, 1200), random(625, 750));
         ground.draw();
         for (int i1 = 0; i1 < 5; i1++) {
             //Trash trashey = new Trash(random(0, 1200),
                     //random(600, 750), random(0, 60), random(0, 90), random(0, 30), random(0, 90), random(0, 60), random(0, 30));
             //trashey.draw1(g2);
             //trashey.draw2(g2);
             //trashey.draw3(g2);

         }
     //}

         Fence fencey = new Fence();
         fencey.draw(g2);
        Shadow shadowey=new Shadow();
        shadowey.draw(g2);
        shadowey.paintComponent(g2);
         Eva evaa = new Eva();
         evaa.draw(g2);
         evaa.paintComponent(g2, 90);
        evaa.draw1(g2);


         Walle wallee = new Walle(g2);
         wallee.mainsquare();
         wallee.drawtopside();
         wallee.drawleftside();
         wallee.drawwheel();
         wallee.design();
         wallee.arm();
         wallee.eyes();





        Shoe shoey=new Shoe();
        shoey.draw(g2);



     }

    public int random(int start, int end){
        return (int)(Math.random()* (end - start) + start);
    }

    }


