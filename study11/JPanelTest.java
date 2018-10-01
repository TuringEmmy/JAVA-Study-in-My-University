package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JPanelTest {
    public static void main(String[] args)    //������
    {
        PanelFrame frame = new PanelFrame();    //�����������
        frame.addWindowListener(new         //�����������ӹر��¼�
                WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        frame.setVisible(true);            //��ʾ����
    }
}

class PanelFrame extends JFrame            //�̳�JFrame��
{
    public PanelFrame() {
        setTitle("ʹ�����");                //���ñ���
        setSize(400, 300);                    //���ô����С
        MyPanel p = new MyPanel();            //�����������
        Container con = getContentPane();    //ȡ�ô�������
        con.add(p);                        //����������
    }
}

class MyPanel extends JPanel                //�����̳���JPanel��
{
    //���������ʾ��Ϣ

    public void paintComponent(Graphics g)    //��дpaintComponent����
    {
        g.drawString("������ʾ������ϵ���Ϣ", 120, 100);//��ʾ��Ϣ
    }
}

