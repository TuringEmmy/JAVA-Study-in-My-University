package cn.legeyung.study10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Ӻ���(Lege_Yung)
 *
 */

public class NewButton {
    public static void main(String[] args) {
        Frame f = new Frame("Button");
        Button b = new Button();
        b.setLabel("����������");

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(1);
            }
        });
        f.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}

