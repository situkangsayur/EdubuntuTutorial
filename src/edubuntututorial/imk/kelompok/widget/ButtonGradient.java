/*
 *  BACA DENGAN TELITI !!!
 * 
 *  Anda boleh menggunakan, mengubah, menghapus, menambah, dan
 *  melakukan hal yang anda inginkan ke dalam source code ini.
 * 
 *  Dan saya tidak bertanggung jawab atas kesalahan,
 *  bug, atau keanehan yang ada dalam source code ini, dan
 *  saya juga TIDAK MENERIMA PERTANYAAN dari Anda
 *  mengenai isi source code ini.
 * 
 *  Semoga source code ini bermanfaat bagi Anda, dan juga
 *  bermanfaat bagi project yang sedang Anda buat.
 * 
 *  Salam saya, Eko Kurniawan Khannedy
 */
package edubuntututorial.imk.kelompok.widget;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

/**
 *
 * @author echo
 */
public class ButtonGradient extends JButton {

    private Paint paint;

    private Shape shape;

    private Paint glass;

    private boolean over;

    public ButtonGradient() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);

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
        Graphics2D gd = (Graphics2D) g.create();

        paint = new GradientPaint(0, 0, Color.BLACK, 0, getHeight(), Color.BLUE);
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
        if (isOver()) {
            glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), 0, getHeight(), new Color(1F, 1F, 1F, 0.5F));
        } else {
            glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        }

        gd.setPaint(paint);
        gd.fill(shape);

        super.paintComponent(g);

        gd.setPaint(glass);
        gd.fill(shape);

        gd.dispose();
    }
}
