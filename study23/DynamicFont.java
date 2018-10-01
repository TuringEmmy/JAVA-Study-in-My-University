package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 *//
public class DynamicFont extends Applet implements Runnable {
    String str = null;
    Thread thread = null;                 // ����һ���߳�
    char[] ch;
    int p = 0;
    Image image;
    Graphics gphics;
    Color[] color;
    int one = 1;
    int two = 18;
    int three = 18;
    private Font f;                 // ����
    private FontMetrics fm;         // ��ģ

    public void init() {
        str = "����Applet����";         // �����߲���������
        this.setSize(520, 200);     // ����Applet�Ĵ�С
        setBackground(Color.white); // ���ñ�����ɫ
        ch = new char[str.length()];
        ch = str.toCharArray();        // ���ַ����еĸ����ַ����浽������
        image = createImage(getSize().width, getSize().height);
        gphics = image.getGraphics();
        f = new Font("", Font.BOLD, 18);
        fm = getFontMetrics(f);     // ���ָ�������������
        gphics.setFont(f);             // �������������
        float hue;
        color = new Color[str.length()]; // ��ɫ��ɫԪ
        for (int i = 0; i < str.length(); i++) {
            hue = ((float) i) / ((float) str.length());
            color[i] = new Color(Color.HSBtoRGB(hue, 0.8f, 1.0f)); // ��ɫ����
        }
    }

    public void start() {             // �߳̿�ʼ����
        if (thread == null) {         // ����߳�Ϊ�գ���
            thread = new Thread(this);
            // ��ʼ�µ��߳�
            thread.start();         // ��ʼ
        }
    }
    // ��ֹ�߳�

    public void stop() {
        if (thread != null) {         // ����̲߳�Ϊ�գ���
            thread.stop();             // ��ֹ�̣߳�ʹ��
            thread = null;            // Ϊ��
        }
    }
    // �����߳�

    public void run() {
        while (thread != null) {
            try {
                thread.sleep(200);     // ���̳߳�˯200����
            } catch (InterruptedException e) {
            }
            repaint();                 // ���»��ƽ���
        }
    }

    public void update(Graphics g) {// ��дupdate�����������˸����
        int x, y;
        double a;
        gphics.setColor(Color.black);
        gphics.fillRect(0, 0, getSize().width, getSize().height);
        p += one;
        p %= 7;         // ��Ҫ�����ֵ��ٶȣ�������ԽС���ٶ�Խ��
        // System.out.println(p+�� p1��);
        for (int i = 0; i < str.length(); i++) {
            // ��Ҫ���ƻ��ȵģ�������ԽС������Խ��
            a = ((p - i * one) % 7) / 4.0 * Math.PI;
            // ��x����ֵ
            x = 30 + fm.getMaxAdvance() * i + (int) (Math.cos(a) * two);
            y = 80 + (int) (Math.sin(a) * three);     // ��y����ֵ
            gphics.setColor(color[(p + i) % str.length()]);
            gphics.drawChars(ch, i, 1, x, y);
        }
        paint(g);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
