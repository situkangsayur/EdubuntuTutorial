/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelFilm.java
 *
 * Created on 22 Des 10, 3:46:51
 */
package edubuntututorial.imk.kelompok.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JPanel;

/**
 *
 * @author Zack Syah
 */
public class PanelFilm extends javax.swing.JPanel {

    private Player mediaPlayer;
    private Component video;
    private Component controls;

    /** Crea Ftes new form PanelFilm */
    public PanelFilm(URL mediaUrl) throws IOException {
        initComponents();
        setLayout(new BorderLayout());
        Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);

        drawFilm = new JPanel();

        try {

            mediaPlayer = Manager.createRealizedPlayer(mediaUrl);
            System.out.println(Manager.createRealizedPlayer(mediaUrl).toString());
            video = mediaPlayer.getVisualComponent();
            System.out.println(mediaPlayer.getVisualComponent());
            controls = mediaPlayer.getControlPanelComponent();

            if (video != null) {
               drawFilm.add(video, BorderLayout.CENTER);
            }

            if (controls != null) {
                drawFilm.add(controls, BorderLayout.SOUTH);
            }
            this.setVisible(false);
            drawFilm.setVisible(true);

            mediaPlayer.start();

        } catch (NoPlayerException noPlayerException) {
            noPlayerException.printStackTrace();
        } catch (CannotRealizeException cannotRealizeException) {
            cannotRealizeException.printStackTrace();
        }

    }

    public JPanel getDrawFilm() {
        return drawFilm;
    }

    public void setDrawFilm(JPanel drawFilm) {
        this.drawFilm = drawFilm;
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawFilm = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout drawFilmLayout = new javax.swing.GroupLayout(drawFilm);
        drawFilm.setLayout(drawFilmLayout);
        drawFilmLayout.setHorizontalGroup(
            drawFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        drawFilmLayout.setVerticalGroup(
            drawFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(drawFilm, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel drawFilm;
    // End of variables declaration//GEN-END:variables
}
