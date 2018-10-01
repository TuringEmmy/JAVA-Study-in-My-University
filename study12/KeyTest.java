package cn.legeyung.study12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Author: George Li
 * Powered by GaoZou group.
 */
public class KeyTest extends KeyAdapter
        implements ActionListener {
    JFrame jframe = null;            //����һ��JFrame�����
    JLabel label = null;        //����һ��JLabel�����
    JTextField jtext = null;    //����һ��JTextField�����
    String key = "";

    public KeyTest() {
        jframe = new JFrame("���̼���ʾ��");    // Ϊ���JFrame����һ������
        Container contentPane = jframe.getContentPane();
        contentPane.setLayout(new GridLayout(3, 1));
        label = new JLabel();            // ����һ����ǩ����
        jtext = new JTextField();
        jtext.requestFocus();
        jtext.addKeyListener(this);
        JButton b = new JButton("���");    // ����һ����ť
        b.addActionListener(this);
        contentPane.add(label);
        contentPane.add(jtext);
        contentPane.add(b);
        jframe.pack();
        jframe.show();
        jframe.addWindowListener(new WindowAdapter() {    //��Ӵ����¼�����

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        key = "";
        label.setText("");
        jtext.setText("");
        jtext.requestFocus();
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();    //��ȡ�¼�Դ�ϵ��ַ�
        if (c == 'o') {        //���������ĸo���ͻ�����´���
            JFrame newF = new JFrame("��������o�󵯳����´���");
            newF.setSize(200, 200);
            newF.show();
        }
        key = key + c;
        label.setText(key);
    }

    public static void main(String[] args) {
        new KeyTest();
    }
}

