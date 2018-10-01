package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JRadioButtonTest {
    JFrame f = null;
    JRadioButton r4 = null;
    JRadioButton r5 = null;

    JRadioButtonTest() {
        f = new JFrame("��ѡ��ʾ��");            // ����һ��JFrame�Ķ���
        Container contentPane = f.getContentPane();    // ����һ������
        contentPane.setLayout(new GridLayout(2, 1));    // ����������ڵĲ���
        JPanel p1 = new JPanel();                    // ����һ��������p1
        p1.setLayout(new GridLayout(1, 3));        // ���ò��ֹ������ĸ�ʽ
        p1.setBorder(BorderFactory.createTitledBorder("ѡ����ϲ���ĳ���"));
        // ����3��JRadioButton��ѡ��ť
        JRadioButton r1 = new JRadioButton("����");
        JRadioButton r2 = new JRadioButton("�Ϻ�");
        JRadioButton r3 = new JRadioButton("�ൺ");
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
        contentPane.add(p1);
        contentPane.add(p2);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {// ���һ�����ڼ�����

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new JRadioButtonTest();
    }
}

