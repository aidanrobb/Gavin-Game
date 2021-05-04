package Games;

import javax.swing.*;
import java.awt.*;

public class Selection extends JFrame {

    public Selection() {
        super("Game Selection");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JButton shapes = new JButton("Shapes & More");
        JButton memory = new JButton("Memory");
        JButton game3 = new JButton("Coming Soon");
        getContentPane().add(BorderLayout.NORTH, shapes);
        getContentPane().add(BorderLayout.CENTER, memory);
        getContentPane().add(BorderLayout.SOUTH, game3);

        setVisible(true);
    }
}
