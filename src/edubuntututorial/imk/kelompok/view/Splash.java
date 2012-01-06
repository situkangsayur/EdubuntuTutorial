/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.view;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;

/**
 *
 * @author game hendri
 */
public class Splash extends JWindow {

    private JLabel loading;
    private Dimension screensize;
    private JProgressBar jProgressBar;

    public Splash() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loading = new JLabel(new ImageIcon(getClass().getResource("/edubuntututorial/imk/sourceimk/SPLASHSCREEC.jpg")));
        } catch (Exception e) {
            System.out.println("Error di image iconnya");
        }
        jProgressBar = new JProgressBar(0, 100);


        getContentPane().add(loading, BorderLayout.CENTER);
        getContentPane().add(jProgressBar, BorderLayout.SOUTH);
        jProgressBar.setPreferredSize(new Dimension(150, 16));
        pack();

        screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screensize.width / 2) - (getSize().width / 2),
                (screensize.height / 2) - (getSize().height / 2));

        loading.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));

    }

    public JProgressBar getjProgressBar() {
        return jProgressBar;
    }

    public void setjProgressBar(JProgressBar jProgressBar) {
        this.jProgressBar = jProgressBar;
    }
}
