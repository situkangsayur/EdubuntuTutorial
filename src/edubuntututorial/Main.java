/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial;

import edubuntututorial.imk.kelompok.MediaPlayer;
import edubuntututorial.imk.kelompok.view.Splash;
import edubuntututorial.imk.kelompok.widget.WarnaComp2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class Main {

    //public static void main(String[] args)
    public static void main(String args[]) throws IOException, InterruptedException {
        Splash splash = new Splash();
        //FramePlay framePlay = null;


        Thread thread;
        splash.setVisible(true);

        thread = new Thread(new Runnable() {

            FramePlay framePlay;

            public void run() {

                try {
                    framePlay = new FramePlay();
                    framePlay.setLocation(160, 10);
                    framePlay.setVisible(true);


                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            private FramePlay getPlay() {
                return framePlay;
            }
        });
        int i = 0;
        thread.start();
        while (thread.isAlive()) {
            i++;
            thread.sleep(50);
            splash.getjProgressBar().setValue(i);
        }


        //for(int i=0;i<100;i++){
        //  thread.sleep(50);
        //}


        splash.setVisible(false);




    }
}
