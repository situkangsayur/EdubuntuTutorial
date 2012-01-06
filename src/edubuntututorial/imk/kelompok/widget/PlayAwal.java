/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.widget;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.media.Player;
import javax.media.Time;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.protocol.DataSource;
import sun.java2d.Disposer;

/**
 *
 * @author hendri
 */
public class PlayAwal extends JPanel {

    private Player mediaPlayer;
    private Component video;
    private Component controls;

    public PlayAwal() {
        this.setOpaque(false);
    }

    public Component getControls() {
        return controls;
    }

    public void setControls(Component controls) {
        this.controls = controls;
    }

    public Player getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(Player mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public Component getVideo() {
        return video;
    }

    public void setVideo(Component video) {
        this.video = video;
    }

    @Override
    protected void paintComponent(Graphics g) {



        Graphics2D g2 = (Graphics2D) g.create();

        Shape rec2 = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        Paint paint = new LinearGradientPaint(getWidth(), 0, getWidth(), getHeight(), new float[]{
                    0F, 1F
                }, new Color[]{Color.BLACK, Color.ORANGE});


        g2.setPaint(paint);
        g2.setStroke(new BasicStroke(3F));
        g2.fill(rec2);



        super.paintComponent(g);


        g2.dispose();


    }

    public void MediaPlayer(URL mediaUrl) throws IOException {
        setLayout(new BorderLayout());
        Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);



        try {

            if (mediaPlayer != null) {
                this.removeAll();
                mediaPlayer.stop();
                mediaPlayer.deallocate();

                //this.remove(video);
                //this.remove(controls);

            }

            mediaPlayer = Manager.createRealizedPlayer(mediaUrl);

            System.out.println(Manager.createRealizedPlayer(mediaUrl).toString());
            video = mediaPlayer.getVisualComponent();


            if (video != null) {
                video.setSize(580, 390);
                add(video, BorderLayout.CENTER);
            }




            // mediaPlayer.start();

        } catch (NoPlayerException noPlayerException) {
            noPlayerException.printStackTrace();
        } catch (CannotRealizeException cannotRealizeException) {
            cannotRealizeException.printStackTrace();
        }


    }

    public void reset() {


        mediaPlayer.stop();
        Time t = mediaPlayer.RESET;
        mediaPlayer.setMediaTime(new Time(0.0));
        mediaPlayer.start();


    }
}
