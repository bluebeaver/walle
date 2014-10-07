/**
 * Created by daria_bobrova on 10/3/14.
 */
import javax.swing.*;

    public class VehicleMain extends JPanel{
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            VehiclePanel panel = new VehiclePanel();
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

