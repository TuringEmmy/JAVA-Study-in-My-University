package cn.legeyung.study11;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ��ѡ��
 * @author Ӻ���(Lege_Yung)
 *
 */
public class JCheckBoxTest {
    JFrame f = null;

    JCheckBoxTest() {
        f = new JFrame("��ѡ��ʾ��");        // ����һ��JFrameʵ������
        Container contentPane = f.getContentPane();    // ����һ������
        contentPane.setLayout(new GridLayout(2, 1));    // ���ô��ڵĲ���
        
        JPanel p1 = new JPanel();                // ����һ��������p1
        p1.setLayout(new GridLayout(1, 3));
        p1.setBorder(BorderFactory.createTitledBorder("ѡ������Ҫȥ�ĳ��У�"));
        JCheckBox c1 = new JCheckBox("����");
        JCheckBox c2 = new JCheckBox("����");
        JCheckBox c3 = new JCheckBox("�ൺ");
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);

        contentPane.add(p1);

        
        JPanel p2 = new JPanel();                // ����һ��������p1
        p1.setLayout(new GridLayout(1, 3));
        p1.setBorder(BorderFactory.createTitledBorder("ѡ������Ҫȥ�ĳ��У�"));
        JCheckBox c4 = new JCheckBox("����");
        JCheckBox c5 = new JCheckBox("����");
        JCheckBox c6 = new JCheckBox("�ൺ");
        p2.add(c4);
        p2.add(c5);
        p2.add(c6);

        contentPane.add(p2);
        
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {        // ����һ�����ڼ�����

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new JCheckBoxTest();
    }
}

