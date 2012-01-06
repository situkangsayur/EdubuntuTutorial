/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlayDialog.java
 *
 * Created on 22 Des 10, 2:34:29
 */

package edubuntututorial;

import edubuntututorial.imk.kelompok.MediaPlayer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Zack Syah
 */
public class PlayDialog extends javax.swing.JFrame {

    /** Creates new form PlayDialog */
    public PlayDialog(java.awt.Frame parent, boolean modal) throws IOException {
       
        initComponents();
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

                MediaPlayer mediaPanel = new MediaPlayer(mediaURL);
                this.add(mediaPanel);
                this.setSize(300, 300);
                this.setVisible(true);
            } // end inner if
        } // end outer if
     // end main
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlayDialog dialog = null;
                try {
                    dialog = new PlayDialog(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(PlayDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}