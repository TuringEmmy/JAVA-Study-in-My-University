package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * @author TuringEmmy
 *
 */
public class JComboBoxTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JComboBoxDemo1");    // ����һ��JFrame����
        Container contentPane = jf.getContentPane();        // ����һ������
        contentPane.setLayout(new GridLayout(1, 2));
        // ����һ���ַ������飬�������ʼ��
        String[] str = {"�ʹ�", "̩ɽ", "�żҽ�", "�ú�԰", "�׸�"};
        Vector vector = new Vector();            //����һ��Vector����
        //��Vector�������������
        vector.addElement("����");
        vector.addElement("�Ϻ�");
        vector.addElement("�ൺ");
        vector.addElement("����");
        vector.addElement("�ɶ�");
        vector.addElement("����");
        JComboBox combo1 = new JComboBox(str);    // ����һ��JComboBox17	����
        // ����JComboBox�����ṩ��addItem()����������һ����Ŀ����JComboBox19	�С�
        combo1.addItem("̩ɽ");
        //����һ������ָ������ı����
        combo1.setBorder(BorderFactory.createTitledBorder("����ȥ�ĸ��������棿"));
        JComboBox combo2 = new JComboBox(vector);
        combo2.setBorder(BorderFactory.createTitledBorder("��ϲ���ĳ���"));
        contentPane.add(combo1);
        contentPane.add(combo2);
        jf.pack();
        jf.show();
        jf.addWindowListener(new WindowAdapter() {        // ��Ӵ��ڼ�����

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
