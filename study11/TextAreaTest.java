package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class TextAreaTest {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("�ı���ʾ��");
        Container contentPane = jframe.getContentPane();// ���ش���������
        contentPane.setLayout(new BorderLayout());     // ���ô����������֡�
        JPanel jpanel = new JPanel();                 // �������������
        JTextArea jta = new JTextArea(10, 20);         // ���������ı����䳤��Ϊ10��
        jpanel.add(jta);
        contentPane.add(jpanel);
        jframe.setSize(500, 200);
        jframe.setVisible(true);
        jframe.addWindowListener(new WindowAdapter()     // �ر��¼���
        {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

