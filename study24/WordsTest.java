package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class WordsTest extends Applet implements Runnable {
    private Image image;                        // ����ͼƬ����
    private Graphics graphic;                    // ����Graphics����
    private Font font;                            // ����Font����
    private String str;                    // ����һ���ַ�������
    private Thread thread;                    // ����һ��Thread����
    private int fontSize;                        // ����һ��int�ͱ���

    public void init() {                        // AppletС�����ʼ��
        this.setSize(400, 400);
        image = createImage(400, 400);         // /����Imageͼ�����
        graphic = image.getGraphics();
        str = "����AppletС����";            // ��Ҫ�仯���ı�����
        font = new Font("TimesRoman", Font.BOLD, 8);
    }

    public void start() {                        // �������߳�
        if (thread == null) {
            thread = new Thread(this);
            thread.start();                    // �����߳�
        }
    }

    public void update(Graphics g) {            // ���µ���paint����
        paint(g);
    }

    public void paint(Graphics g) {                // ��ͼ��
        graphic.setColor(Color.black);
        graphic.fillRect(0, 0, getSize().width, getSize().height);
        font = new Font("TimesRoman", Font.BOLD, fontSize);
        graphic.setFont(font);
        graphic.setColor(Color.white);
        FontMetrics fm = graphic.getFontMetrics(font);
        int fontHeight = fm.getHeight();
        int w;
        int baseLine = getSize().height / 2 + fontHeight / 2;
        w = fm.stringWidth(str);
        w = (getSize().width - w) / 2;
        graphic.drawString(str, w, baseLine -= 20);
        g.drawImage(image, 0, 0, this);
        fontSize++;
    }

    public void run() {                        // ��дrun����
        while (true) {
            repaint();
            if (fontSize > getSize().height)
                fontSize = 0;
            try {
                thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
