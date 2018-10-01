package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class LightFont extends Applet implements Runnable {
    private String text;                    // �����ı�����
    private Font font;                        // �����������
    private int fontSize;                    // ��������Ĵ�С
    private Thread thread;                    // �����̶߳���
    private int position = 100;                // ����������ֵ�λ��
    private int tsize = 20;                    // �ı��Ĵ�С
    private int twidth = 0;                    // �ı��Ŀ��
    private int fheigth, baseLine, w;

    public void init()                            // С����ĳ�ʼ��
    {
        text = "�ƹ�������";                // ��С��������Ҫ��ʾ���ı�����
        fontSize = 30;                    // ��������Ĵ�С
        font = new Font("TimesRoman", Font.BOLD, fontSize); // ����Font����
        FontMetrics fm = getFontMetrics(font);    // ��ȡFontMetrics���������
        fheigth = fm.getHeight();
        baseLine = getSize().height / 2 + fheigth / 3;
        twidth = fm.stringWidth(text);
        w = fm.stringWidth(text);
        w = (getSize().width - w) / 2;
        position = w;
        setBackground(Color.black);         // ����С����ı���ɫΪ��ɫ
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);            // �������߳�
            thread.start();                    // �������߳�
        }
    }

    public void stop() {
        thread.stop();                        // ֹͣ�����߳�
        thread = null;
    }

    public void run()                            // �����߳�
    {
        while (true) {
            repaint();                        // �ػ�����
            try {
                thread.sleep(30);
            }                                // �߳�����
            catch (InterruptedException e) {
            }
        }
    }

    public void update(Graphics g)                // �������
    {
        paint(g);
    }
    // ����clipRect()������ÿ�ε�����ʾ����paint()ʱ��
    // ���ú�ɫ�ıʻ�һ�����֣����ð�ɫ�ڲü����л�һ������

    public void paint(Graphics g) {
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString(text, w, baseLine);         // ��һ����ʾ
        g.clipRect(position, 0, tsize, getSize().height); // ���òü�����
        g.setColor(Color.white);
        g.drawString(text, w, baseLine);         // �ڶ�����ʾ
        position = (position + 1) % (twidth + 100); // �ƶ����λ��
    }
}
