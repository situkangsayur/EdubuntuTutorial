/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SesiSatuPanel.java
 *
 * Created on Dec 16, 2010, 6:48:33 PM
 */
package edubuntututorial.imk.kelompok.view.panel.sesi;

import edubuntututorial.FramePlay;
import edubuntututorial.Main;
import edubuntututorial.imk.kelompok.controll.panel.sesi.SesiSatuControll;
import edubuntututorial.imk.kelompok.listener.panel.sesi.SesiSatuListener;
import edubuntututorial.imk.kelompok.model.panel.sesi.SesiSatuModel;
import edubuntututorial.imk.kelompok.view.PlayView;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hendri
 */
public class SesiSatuPanel extends javax.swing.JPanel implements SesiSatuListener {

    private SesiSatuModel model;
    private SesiSatuControll controller;
    private PlayView playView;
    private FramePlay Frame;

    /** Creates new form SesiSatuPanel */
    public SesiSatuPanel() {
        initComponents();

        model = new SesiSatuModel();
        controller = new SesiSatuControll();

        model.setListener(this);
        controller.setSesiSatuModel(model);

        buttonInstallEdubuntu.setMnemonic('I');
        buttonRepostory.setMnemonic('O');
        buttonSoftwareCenter.setMnemonic('M');
        buttonManualDownload.setMnemonic('A');
        

    }

    public PlayView getPlayView() {
        return playView;
    }

    public void setPlayView(PlayView playView) {
        this.playView = playView;
    }

    public FramePlay getFramePlay() {
        return Frame;
    }

    public void setFramePlay(FramePlay framePlay) {
        this.Frame = framePlay;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonInstallEdubuntu = new edubuntututorial.imk.kelompok.widget.ButtonImageGlass();
        buttonRepostory = new edubuntututorial.imk.kelompok.widget.ButtonImageGlass();
        buttonSoftwareCenter = new edubuntututorial.imk.kelompok.widget.ButtonImageGlass();
        buttonManualDownload = new edubuntututorial.imk.kelompok.widget.ButtonImageGlass();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        buttonInstallEdubuntu.setForeground(new java.awt.Color(255, 255, 255));
        buttonInstallEdubuntu.setText(" 1. Install Edubuntu"); // NOI18N
        buttonInstallEdubuntu.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buttonInstallEdubuntu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstallEdubuntuActionPerformed(evt);
            }
        });

        buttonRepostory.setForeground(new java.awt.Color(255, 255, 255));
        buttonRepostory.setText("2. Open Office"); // NOI18N
        buttonRepostory.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buttonRepostory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRepostoryActionPerformed(evt);
            }
        });

        buttonSoftwareCenter.setForeground(new java.awt.Color(255, 255, 255));
        buttonSoftwareCenter.setText("3. Aplikasi Media Edubuntu"); // NOI18N
        buttonSoftwareCenter.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buttonSoftwareCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSoftwareCenterActionPerformed(evt);
            }
        });

        buttonManualDownload.setForeground(new java.awt.Color(255, 255, 255));
        buttonManualDownload.setText("4. Aplikasi Internet"); // NOI18N
        buttonManualDownload.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        buttonManualDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManualDownloadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonManualDownload, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(buttonSoftwareCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonRepostory, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonInstallEdubuntu, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(buttonInstallEdubuntu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(buttonRepostory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonSoftwareCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonManualDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInstallEdubuntuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstallEdubuntuActionPerformed
        // TODO add your handling code here:
        controller.installUbuntu();
    }//GEN-LAST:event_buttonInstallEdubuntuActionPerformed

    private void buttonRepostoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRepostoryActionPerformed
        // TODO add your handling code here:
        controller.repository();
    }//GEN-LAST:event_buttonRepostoryActionPerformed

    private void buttonSoftwareCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSoftwareCenterActionPerformed
        // TODO add your handling code here:
        controller.softwareCeter();
    }//GEN-LAST:event_buttonSoftwareCenterActionPerformed

    private void buttonManualDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManualDownloadActionPerformed
        // TODO add your handling code here:
        controller.manualDownload();
    }//GEN-LAST:event_buttonManualDownloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edubuntututorial.imk.kelompok.widget.ButtonImageGlass buttonInstallEdubuntu;
    private edubuntututorial.imk.kelompok.widget.ButtonImageGlass buttonManualDownload;
    private edubuntututorial.imk.kelompok.widget.ButtonImageGlass buttonRepostory;
    private edubuntututorial.imk.kelompok.widget.ButtonImageGlass buttonSoftwareCenter;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void onInstallUbuntu() {

        try {
            Frame.setPlayPanel1(0);
            //Frame.getjPanel8().set

        } catch (IOException ex) {
            Logger.getLogger(SesiSatuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void onRepository() {

        try {
            Frame.setPlayPanel1(1);


        } catch (IOException ex) {
            Logger.getLogger(SesiSatuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void onSoftwareCeter() {
        try {
            Frame.setPlayPanel1(2);

        } catch (IOException ex) {
            Logger.getLogger(SesiSatuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void onManualDownload() {
        try {
            Frame.setPlayPanel1(3);

        } catch (IOException ex) {
            Logger.getLogger(SesiSatuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void onFormatInstalasi() {
        try {
            Frame.setPlayPanel1(4);

        } catch (IOException ex) {
            Logger.getLogger(SesiSatuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
