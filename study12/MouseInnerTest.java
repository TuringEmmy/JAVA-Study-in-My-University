package cn.legeyung.study12;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */
public class MouseInnerTest {
    private Frame f;
    private TextField tf;

    public static void main(String[] args) {

        MouseInnerTest mit = new MouseInnerTest();
        mit.show();

    }

    public MouseInnerTest() {
        f = new Frame("������");
        tf = new TextField();
    }

    public void show() {
        f.add(tf, "North");
        f.setVisible(true);
        f.addMouseMotionListener(new MyMouseMotionListener());
        f.setSize(300, 240);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
                f.dispose();
                System.out.println("�˳�");
                System.exit(0);
            }
        });
    }

    class MyMouseMotionListener extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            tf.setText("������꣺X=" + e.getX() + "Y=" + e.getY());
        }
    }
}
