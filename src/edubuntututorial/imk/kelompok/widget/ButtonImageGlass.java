/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edubuntututorial.imk.kelompok.widget;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author hendri
 */
public class ButtonImageGlass extends JButton{

    private Paint glass;

     private boolean over;

    public ButtonImageGlass() {
            setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }
        });
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd = (Graphics2D) g.create();
        if(isOver()){
          glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0,
        getHeight(), new Color(1F, 1F, 1F, 0F));
        }else{
            glass = new GradientPaint(0, 0,new Color(1F, 1F, 1F, 0F),0,getHeight(),
        new Color(1F, 1F, 1F, 0.5F));
        }

          gd.setPaint(glass);
          gd.fillRoundRect(0, 0, getWidth(), getHeight(),50,50);


        gd.dispose();

    }


}
