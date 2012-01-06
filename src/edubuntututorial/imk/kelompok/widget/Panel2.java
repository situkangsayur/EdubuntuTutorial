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
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class Panel2 extends JPanel {
    private Image image;
    private Paint glass;
    public Panel2() {
        setOpaque(false);
        image = new ImageIcon(getClass().getResource("/edubuntututorial/imk/widget/logo.jpg")).getImage();
    }
   

    @Override
    protected void paintComponent(Graphics g) {
        


        Graphics2D g2 = (Graphics2D) g.create();
       
        Shape rec2 = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        Paint paint = new LinearGradientPaint(getWidth(), 0, getWidth(), getHeight(), new float[]{
                    0F, 1F
                }, new Color[]{ Color.BLACK, Color.GREEN});
         

        g2.setPaint(paint);
        g2.setStroke(new BasicStroke(3F));
        g2.fill(rec2);
        g2.drawImage(image, (getWidth() / 2),20, this);
         glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.6F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        g2.setPaint(glass);
        g2.fill(rec2);

        
 super.paintComponent(g);

            g2.dispose();
       

    }
}
