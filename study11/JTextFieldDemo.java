package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JTextFieldDemo {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("�ı���������ʾ��");
        Container contentPane = jframe.getContentPane();// ���ش���������
        contentPane.setLayout(new BorderLayout());     // ���ô����������֡�
        JPanel jpanel = new JPanel();                 // �������������
        jpanel.setLayout(new GridLayout(3, 2));             // ������岼�֡�
        jpanel.setBorder(BorderFactory.createTitledBorder("��������ĵ�½��Ϣ"));
        // �������߽硣
        JLabel lable1 = new JLabel("�û�����", JLabel.CENTER); // ������ǩ��
        JLabel lable2 = new JLabel("���룺", JLabel.CENTER);
        JTextField t1 = new JTextField(10);         // ���������ı����䳤��Ϊ10��
        JPasswordField t2 = new JPasswordField(10);
        jpanel.add(lable1);         // ����ǩ�������ı���������ӵ�����С�
        jpanel.add(t1);
        jpanel.add(lable2);
        jpanel.add(t2);
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

