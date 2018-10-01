package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class WordsToExpand extends Applet implements Runnable {
    private Image image;//����Imageͼ�����
    private Graphics graphic;//����Graphics����
    private int width = 0, height = 0;//�����ߺͿ����
    private String words;//�����ı�����
    private Thread thread;//����Thread���̶߳���
    private int xPosition = 0, yPosition = 0, myHeight;//����x��y�����
    private int times = 0;//��ʾ�������ֵķ���
    private Font font;

    public void init()//��ʼ��AppletС����
    {
        this.setSize(300, 200);
        font = new Font("TimesRoman", Font.ROMAN_BASELINE, 30);
        width = 300;
        height = 200;
        myHeight = height / 3;
        yPosition = myHeight;
        words = "����AppletС����";
        image = createImage(width, height);
        graphic = image.getGraphics();
    }

    public void start()//��AppletС����Ͷ��߳�
    {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void update(Graphics g)//�������
    {
        paint(g);
    }

    public void paint(Graphics g)//�������
    {
        g.drawImage(image, 0, yPosition, width, myHeight, this);
    }

    public void run()//���ж��߳�
    {
        try {
            while (true) {
                yPosition = 0;
                myHeight = height;
                graphic.setColor(Color.pink);
                graphic.fillRect(0, 0, width, height);
                repaint();
                thread.sleep(100);
                if (times == 0) {
                    graphic.setColor(Color.red);
                    for (int i = width; i >= 0; i--) {
                        graphic.fillRect(i, height / 3, width, height / 10);
                        repaint();
                        thread.sleep(10);
                    }
                } else if (times == 1) {
                    graphic.setColor(Color.black);
                    for (int i = 0; i <= width; i++) {
                        graphic.fillRect(0, height / 3, i, height / 10);
                        repaint();
                        thread.sleep(10);
                    }
                }
                yPosition = height / 3;
                myHeight = height / 3;
                for (int i = height / 3; i >= 0; i--) {
                    xPosition = 0;
                    yPosition--;
                    myHeight = myHeight + 2;
                    if (times == 0)//0��ʾ���������ƶ�
                    {
                        graphic.setColor(Color.black);
                        graphic.fillRect(0, 0, width, height);
                        graphic.setFont(font);
                        graphic.setColor(Color.yellow);
                        graphic.drawString(words, 10, 35);
                        times++;
                    } else if (times == 1)//1��ʾ���������ƶ�
                    {
                        graphic.setColor(Color.red);
                        graphic.fillRect(0, 0, width, height);
                        graphic.setFont(font);
                        graphic.setColor(Color.black);
                        graphic.drawString(words, 10, 35);
                        times = 0;
                    }
                    repaint();
                    thread.sleep(100);
                }
                thread.sleep(2500);
                System.out.println(times);
            }
        } catch (InterruptedException e) {
        }
    }
}
