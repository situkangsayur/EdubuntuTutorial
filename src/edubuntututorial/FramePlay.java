/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FramePlay.java
 *
 * Created on Dec 16, 2010, 6:12:10 PM
 */
package edubuntututorial;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import edubuntututorial.imk.kelompok.view.Splash;
import edubuntututorial.imk.kelompok.widget.PlayPanel;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hendri
 */
public class FramePlay extends javax.swing.JFrame {

    /** Creates new form FramePlay */
    public FramePlay() throws IOException {
        initComponents();
        this.setLocation(250, 50);
        sesiSatuPanel1.setFramePlay(this);
        sessionPanel1.setFramePlay(this);
        //   playPanel1.setSize(580, 420);
        playPanel6.MediaPlayer(new URL("file:/C:/Aplikasi Etutorial Edubuntu/sourceimk/start.mpg"));
        playPanel6.setVisible(true);
        playPanel6.reset();

        playPanel1.MediaPlayer(new URL("file:/C:/Aplikasi Etutorial Edubuntu/sourceimk/install ubuntu.mpg"));
        playPanel1.setVisible(false);
        playPanel2.MediaPlayer(new URL("file:/C:/Aplikasi Etutorial Edubuntu/sourceimk/office.mpg"));
        playPanel2.setVisible(false);
        playPanel3.MediaPlayer(new URL("file:/C:/Aplikasi Etutorial Edubuntu/sourceimk/media.mpg"));
        playPanel3.setVisible(false);
        playPanel4.MediaPlayer(new URL("file:/C:/Aplikasi Etutorial Edubuntu/sourceimk/edubuntuinternet.mpg"));
        playPanel4.setVisible(false);


        // this.add(Main.start("file:/C:/sourceimk/contohMovie.mpg"));


//start();
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public PlayPanel getPlayPanel1() {
        return playPanel1;
    }

    public void setPlayPanel1(int in) throws MalformedURLException, IOException {
        playPanel1.setVisible(true);
        String str = null;

        switch (in) {
            case 0:
                playPanel1.setVisible(true);
                playPanel1.reset();
                playPanel2.getMediaPlayer().stop();
                playPanel2.setVisible(false);
                playPanel3.getMediaPlayer().stop();
                playPanel3.setVisible(false);
                playPanel4.getMediaPlayer().stop();
                playPanel4.setVisible(false);

                playPanel6.getMediaPlayer().stop();
                playPanel6.setVisible(false);
                labelJudul.setText("Cara Install Edubuntu");
                break;
            case 1:
                playPanel2.setVisible(true);
                playPanel2.reset();
                playPanel1.getMediaPlayer().stop();
                playPanel1.setVisible(false);
                playPanel3.getMediaPlayer().stop();
                playPanel3.setVisible(false);
                playPanel4.getMediaPlayer().stop();
                playPanel4.setVisible(false);

                playPanel6.getMediaPlayer().stop();
                playPanel6.setVisible(false);
                labelJudul.setText("Pengenalan Aplikasi OpenOffice");
                break;
            case 2:
                playPanel3.setVisible(true);
                playPanel3.reset();
                playPanel1.getMediaPlayer().stop();
                playPanel1.setVisible(false);
                playPanel2.getMediaPlayer().stop();
                playPanel2.setVisible(false);
                playPanel4.getMediaPlayer().stop();
                playPanel4.setVisible(false);

                playPanel6.getMediaPlayer().stop();
                playPanel6.setVisible(false);
                labelJudul.setText("Pengenalan Aplikasi Multimedia");
                break;
            case 3:
                playPanel4.setVisible(true);
                playPanel4.reset();
                playPanel1.getMediaPlayer().stop();
                playPanel1.setVisible(false);
                playPanel3.getMediaPlayer().stop();
                playPanel3.setVisible(false);
                playPanel2.getMediaPlayer().stop();
                playPanel2.setVisible(false);

                playPanel6.getMediaPlayer().stop();
                playPanel6.setVisible(false);
                labelJudul.setText("Pengenalan Aplikasi Internet");
                break;

            case 5:
                playPanel6.setVisible(true);
                playPanel6.reset();
                playPanel1.getMediaPlayer().stop();
                playPanel1.setVisible(false);
                playPanel3.getMediaPlayer().stop();
                playPanel3.setVisible(false);
                playPanel4.getMediaPlayer().stop();
                playPanel4.setVisible(false);
                playPanel2.getMediaPlayer().stop();
                playPanel2.setVisible(false);
                labelJudul.setText("Aplikasi Et-Tutorial Kelompok 5 ; IF-8");
                break;
        }



    }

    /*
    public void start() {

    JFileChooser fileChooser = new JFileChooser();

    // show open file dialog
    int result = fileChooser.showOpenDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) // user chose a file
    {
    URL mediaURL = null;

    try {
    // get the file as URL
    mediaURL = fileChooser.getSelectedFile().toURL();
    } // end try
    catch (MalformedURLException malformedURLException) {
    System.err.println("Could not create URL for the file");
    } // end catch

    if (mediaURL != null) // only display if there is a valid URL
    {
    JPanel mediaTest = new JPanel();


    PanelFilm panelFilm = null;
    try {
    panelFilm = new PanelFilm(mediaURL);
    } catch (IOException ex) {
    ex.printStackTrace();
    }


    jInternalFrame1.add(panelFilm);




    }
    }
    }
     * 
     */
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warnaComp21 = new edubuntututorial.imk.kelompok.widget.WarnaComp2();
        panelOval1 = new from.launk.container.PanelOval();
        panelLine1 = new from.launk.container.PanelLine();
        panelWhiteBorder2 = new from.launk.container.PanelWhiteBorder();
        panelOval2 = new from.launk.container.PanelOval();
        panelWhiteBorder3 = new from.launk.container.PanelWhiteBorder();
        warnaComp22 = new edubuntututorial.imk.kelompok.widget.WarnaComp2();
        panelOval3 = new from.launk.container.PanelOval();
        panelOval4 = new from.launk.container.PanelOval();
        playPanel = new from.launk.container.PanelGlass();
        playPanel2 = new edubuntututorial.imk.kelompok.widget.PlayPanel();
        playPanel3 = new edubuntututorial.imk.kelompok.widget.PlayPanel();
        playPanel4 = new edubuntututorial.imk.kelompok.widget.PlayPanel();
        playPanel6 = new edubuntututorial.imk.kelompok.widget.PlayAwal();
        playPanel1 = new edubuntututorial.imk.kelompok.widget.PlayPanel();
        labelJudul = new javax.swing.JLabel();
        panelWhiteBorder4 = new from.launk.container.PanelWhiteBorder();
        jPanel7 = new javax.swing.JPanel();
        sesiSatuPanel1 = new edubuntututorial.imk.kelompok.view.panel.sesi.SesiSatuPanel();
        jPanel8 = new javax.swing.JPanel();
        sessionPanel1 = new edubuntututorial.imk.kelompok.view.panel.SessionPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Tutorial Edubuntu");
        setMinimumSize(new java.awt.Dimension(1000, 681));

        warnaComp21.setMinimumSize(new java.awt.Dimension(912, 681));
        warnaComp21.setPreferredSize(new java.awt.Dimension(1000, 670));
        warnaComp21.setLayout(new java.awt.BorderLayout());

        panelOval1.setMinimumSize(new java.awt.Dimension(912, 481));
        panelOval1.setPreferredSize(new java.awt.Dimension(1000, 670));
        panelOval1.setLayout(new java.awt.BorderLayout());

        panelLine1.setMinimumSize(new java.awt.Dimension(912, 481));
        panelLine1.setPreferredSize(new java.awt.Dimension(1000, 670));

        panelWhiteBorder2.setPreferredSize(new java.awt.Dimension(1000, 550));
        panelWhiteBorder2.setLayout(new javax.swing.BoxLayout(panelWhiteBorder2, javax.swing.BoxLayout.LINE_AXIS));

        panelOval2.setPreferredSize(new java.awt.Dimension(750, 550));
        panelOval2.setLayout(new java.awt.BorderLayout());

        panelWhiteBorder3.setPreferredSize(new java.awt.Dimension(750, 550));
        panelWhiteBorder3.setLayout(null);

        warnaComp22.setPreferredSize(new java.awt.Dimension(550, 510));
        warnaComp22.setLayout(new java.awt.BorderLayout());

        panelOval3.setPreferredSize(new java.awt.Dimension(680, 510));
        panelOval3.setLayout(new java.awt.BorderLayout());

        panelOval4.setPreferredSize(new java.awt.Dimension(680, 510));
        panelOval4.setLayout(new java.awt.BorderLayout());

        playPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout playPanel2Layout = new javax.swing.GroupLayout(playPanel2);
        playPanel2.setLayout(playPanel2Layout);
        playPanel2Layout.setHorizontalGroup(
            playPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        playPanel2Layout.setVerticalGroup(
            playPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        playPanel.add(playPanel2, "card3");

        javax.swing.GroupLayout playPanel3Layout = new javax.swing.GroupLayout(playPanel3);
        playPanel3.setLayout(playPanel3Layout);
        playPanel3Layout.setHorizontalGroup(
            playPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        playPanel3Layout.setVerticalGroup(
            playPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        playPanel.add(playPanel3, "card4");

        javax.swing.GroupLayout playPanel4Layout = new javax.swing.GroupLayout(playPanel4);
        playPanel4.setLayout(playPanel4Layout);
        playPanel4Layout.setHorizontalGroup(
            playPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        playPanel4Layout.setVerticalGroup(
            playPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        playPanel.add(playPanel4, "card5");

        javax.swing.GroupLayout playPanel6Layout = new javax.swing.GroupLayout(playPanel6);
        playPanel6.setLayout(playPanel6Layout);
        playPanel6Layout.setHorizontalGroup(
            playPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        playPanel6Layout.setVerticalGroup(
            playPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        playPanel.add(playPanel6, "card7");

        javax.swing.GroupLayout playPanel1Layout = new javax.swing.GroupLayout(playPanel1);
        playPanel1.setLayout(playPanel1Layout);
        playPanel1Layout.setHorizontalGroup(
            playPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        playPanel1Layout.setVerticalGroup(
            playPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        playPanel.add(playPanel1, "card2");

        panelOval4.add(playPanel, java.awt.BorderLayout.CENTER);

        panelOval3.add(panelOval4, java.awt.BorderLayout.CENTER);

        warnaComp22.add(panelOval3, java.awt.BorderLayout.CENTER);

        panelWhiteBorder3.add(warnaComp22);
        warnaComp22.setBounds(30, 50, 700, 480);

        labelJudul.setFont(new java.awt.Font("Showcard Gothic", 1, 24));
        labelJudul.setForeground(new java.awt.Color(255, 255, 255));
        labelJudul.setText("*SELAMAT DATANG DI APLIKASI ETUTORIAL EDUBUNTU*");
        panelWhiteBorder3.add(labelJudul);
        labelJudul.setBounds(30, 0, 710, 50);

        panelOval2.add(panelWhiteBorder3, java.awt.BorderLayout.CENTER);

        panelWhiteBorder2.add(panelOval2);

        panelWhiteBorder4.setMinimumSize(new java.awt.Dimension(200, 354));
        panelWhiteBorder4.setPreferredSize(new java.awt.Dimension(250, 450));
        panelWhiteBorder4.setLayout(new java.awt.CardLayout());

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 350));
        jPanel7.setLayout(new java.awt.CardLayout());

        sesiSatuPanel1.setMinimumSize(new java.awt.Dimension(182, 350));
        sesiSatuPanel1.setPreferredSize(new java.awt.Dimension(300, 446));
        jPanel7.add(sesiSatuPanel1, "card2");

        panelWhiteBorder4.add(jPanel7, "card8");

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(182, 350));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        panelWhiteBorder4.add(jPanel8, "card9");

        panelWhiteBorder2.add(panelWhiteBorder4);

        panelLine1.add(panelWhiteBorder2, java.awt.BorderLayout.PAGE_START);

        sessionPanel1.setPreferredSize(new java.awt.Dimension(900, 120));
        panelLine1.add(sessionPanel1, java.awt.BorderLayout.CENTER);

        panelOval1.add(panelLine1, java.awt.BorderLayout.CENTER);

        warnaComp21.add(panelOval1, java.awt.BorderLayout.CENTER);

        getContentPane().add(warnaComp21, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        Splash splash = new Splash();
        splash.setVisible(true);

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    FramePlay frame = new FramePlay();
                    frame.setVisible(true);
                    frame.setLocation(160, 10);

                } catch (IOException ex) {
                    Logger.getLogger(FramePlay.class.getName()).log(Level.SEVERE, null, ex);
                }



            }
        });
        splash.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelJudul;
    private from.launk.container.PanelLine panelLine1;
    private from.launk.container.PanelOval panelOval1;
    private from.launk.container.PanelOval panelOval2;
    private from.launk.container.PanelOval panelOval3;
    private from.launk.container.PanelOval panelOval4;
    private from.launk.container.PanelWhiteBorder panelWhiteBorder2;
    private from.launk.container.PanelWhiteBorder panelWhiteBorder3;
    private from.launk.container.PanelWhiteBorder panelWhiteBorder4;
    private from.launk.container.PanelGlass playPanel;
    private edubuntututorial.imk.kelompok.widget.PlayPanel playPanel1;
    private edubuntututorial.imk.kelompok.widget.PlayPanel playPanel2;
    private edubuntututorial.imk.kelompok.widget.PlayPanel playPanel3;
    private edubuntututorial.imk.kelompok.widget.PlayPanel playPanel4;
    private edubuntututorial.imk.kelompok.widget.PlayAwal playPanel6;
    private edubuntututorial.imk.kelompok.view.panel.sesi.SesiSatuPanel sesiSatuPanel1;
    private edubuntututorial.imk.kelompok.view.panel.SessionPanel sessionPanel1;
    private edubuntututorial.imk.kelompok.widget.WarnaComp2 warnaComp21;
    private edubuntututorial.imk.kelompok.widget.WarnaComp2 warnaComp22;
    // End of variables declaration//GEN-END:variables
}
