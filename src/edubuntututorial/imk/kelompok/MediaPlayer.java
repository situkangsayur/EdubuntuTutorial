/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok;

import from.launk.container.PanelGlass;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;

/**
 *
 * @author hendri
 */
public class MediaPlayer extends PanelGlass {

    private Player mediaPlayer;
    private Component video;
    private Component controls;

    public MediaPlayer(URL mediaUrl) throws IOException {

        setLayout(new BorderLayout());
        Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);



        try {

            mediaPlayer = Manager.createRealizedPlayer(mediaUrl);
            
            System.out.println(Manager.createRealizedPlayer(mediaUrl).toString());
            video = mediaPlayer.getVisualComponent();
            System.out.println(mediaPlayer.getVisualComponent());
            controls = mediaPlayer.getControlPanelComponent();

            if (video != null) {
                video.setMaximumSize(new Dimension(300, 300));
                add(video, BorderLayout.CENTER);
            }

            if (controls != null) {
                add(controls, BorderLayout.SOUTH);
            }

            mediaPlayer.start();

        } catch (NoPlayerException noPlayerException) {
            noPlayerException.printStackTrace();
        } catch (CannotRealizeException cannotRealizeException) {
            cannotRealizeException.printStackTrace();
        }
       
    }
    



    
}
