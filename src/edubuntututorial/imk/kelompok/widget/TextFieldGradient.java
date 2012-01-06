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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author echo
 */
public class TextFieldGradient extends JTextField {

    private Paint paint;

    private Shape shape;

    private boolean fokus;

    private Paint glass;

    public TextFieldGradient() {
        setForeground(Color.WHITE);
        setOpaque(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));

        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setFokus(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                setFokus(false);
            }
        });
    }

    public boolean isFokus() {
        return fokus;
    }

    public void setFokus(boolean fokus) {
        this.fokus = fokus;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();

        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight());

        if (isFokus()) {
            paint = new GradientPaint(0, 0, Color.BLUE, getWidth(), 0, Color.BLACK);
        } else {
            paint = new GradientPaint(0, 0, Color.BLACK, getWidth(), 0, Color.BLUE);
        }

        gd.setPaint(paint);
        gd.fill(shape);

        super.paintComponent(g);

        glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        gd.setPaint(glass);
        gd.fill(shape);

        gd.dispose();
    }
}
