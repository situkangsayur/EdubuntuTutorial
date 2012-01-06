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
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class WarnaComp2 extends JPanel {

    public WarnaComp2() {
        this.setOpaque(false);
    }
        
   

    @Override
    protected void paintComponent(Graphics g) {
        


        Graphics2D g2 = (Graphics2D) g.create();
       
        Shape rec2 = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        Paint paint = new LinearGradientPaint(getWidth(), 0, getWidth(), getHeight(), new float[]{
                    0F,1F
                }, new Color[]{Color.BLACK, Color.ORANGE});
         

        g2.setPaint(paint);
        g2.setStroke(new BasicStroke(3F));
        g2.fill(rec2);
      

        
 super.paintComponent(g);


            g2.dispose();
       

    }
}
