package cn.legeyung.study10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

/**
 * �ı���
 * @author Ӻ���(Lege_Yung)
 *
 */
public class NewTextFiled {
    public static void main(String[] args) {
        Frame f = new Frame("����һ���ı���ʾ��");
        f.setLayout(new GridLayout(2, 3));
        Label lb = new Label("�������ı�");
        lb.setAlignment(Label.RIGHT);
        TextField tf = new TextField();
        tf.setBackground(Color.red);

        f.add(lb);
        f.add(tf);
        f.setSize(200, 160);
        f.setVisible(true);
    }
}
