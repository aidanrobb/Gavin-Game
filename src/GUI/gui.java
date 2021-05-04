package GUI;

import Games.Selection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
public class gui {


   /**
    * Start up method for GUI
    * @throws IOException - Basic Exception
    * @throws UnsupportedAudioFileException - Basic Exception
    * @throws LineUnavailableException - Basic Exception
    */
   public static void startUp() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
      JFrame mainFrame = new JFrame("Gavin's Game");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      mainPanel(mainFrame);
      startButton(mainFrame);
      mainMenu(mainFrame);
      AudioInputStream title = AudioSystem.getAudioInputStream(new File("Assests/sounds/TitleSong.wav"));
      Clip song = AudioSystem.getClip();
      song.open(title);
      //song.loop(1);
      mainFrame.setVisible(true);

   }

   /**
    * @param window main JFRAME
    * @throws IOException - Basic Exception
    */
   public static void mainPanel(JFrame window) throws IOException {
      JLabel background = new JLabel(new ImageIcon(ImageIO.read(new File("Assests/imgs/GavinGame.png"))));
      window.getContentPane().add(BorderLayout.CENTER, background);

   }

   /**
    * @param window main JFRAME
    */
   public static void startButton(JFrame window){

      JButton startButton = new JButton("Start");
      startButton.setPreferredSize(new Dimension(40,40));
      startButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            window.dispose();
            new Selection();
         }
      });

      window.getContentPane().add(BorderLayout.SOUTH, startButton);
   }


   public static void mainMenu (JFrame window){
      JMenuBar menu = new JMenuBar();
      JMenu option1 = new JMenu("File");
      JMenu option2 = new JMenu("About");
      menu.add(option1);
      menu.add(option2);
      JMenuItem subOption11 = new JMenuItem("Exit");
      subOption11.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      option1.add(subOption11);
      JMenuItem subOption22 = new JMenuItem("This game was made for Gavin Robb Williamson");
      option2.add(subOption22);
      window.getContentPane().add(BorderLayout.NORTH, menu);
   }

}