package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @author TuringEmmy
 *
 */
public class MagnifierTest extends Applet implements MouseMotionListener {
    Graphics g;                        // ����Graphics����
    Image image;                    // ����Image����
    Image back_Image;                // ����Image����
    String name;                    // ����String����
    MediaTracker tracker;             // ����ý�������tracker
    int Glass_X = 0, Glass_Y = 0;     // �Ŵ󾵳�ʼλ��
    int Glass_W = 100, Glass_H = 100;// �Ŵ󾵿�ȡ��߶�
    int width, height;                 // ��������ͼƬ�Ŀ�Ⱥ͸߶�

    public void init() {             // ��ʼ��applet
        // ����ͼƬ
        this.setSize(370, 500);
        g = getGraphics();
        name = "aa.jpg";
        tracker = new MediaTracker(this);
        back_Image = getImage(getDocumentBase(), name);
        image = createImage(250, 100);     // ���÷Ŵ���ͼ��Ĵ�С
        Graphics offg = image.getGraphics();
        offg.drawImage(back_Image, 0, 0, this);
        addMouseMotionListener(this);     // �������¼�����
    }

    public void mouseDragged(MouseEvent e) {// �����ק�¼�����
    }

    public void mouseMoved(MouseEvent e) {     // ��������ƶ��¼�
        // ͨ�����λ�����÷Ŵ󾵵�λ��
        reprintGlass(Glass_X, Glass_Y, e.getX(), e.getY());
        // ���÷Ŵ󾵵ĵ�ǰλ��
        Glass_X = e.getX();
        Glass_Y = e.getY();
        // ���Ŵ����applet����е���
        if (Glass_X > (width - Glass_W / 2))
            Glass_X = width - Glass_W / 2;
        if (Glass_Y > (height - Glass_H / 2))
            Glass_Y = height - Glass_H / 2;
        printGlass(); // �����Զ��巽��������Ŵ�
    }

    void printGlass() {
        Graphics temp = g.create(); // ����g��һ��ʵ��
        // Ϊtemp����һ����������
        temp.clipRect(Glass_X, Glass_Y, Glass_W, Glass_H);
        temp.drawImage(back_Image, -Glass_X, -Glass_Y, width * 2, height * 2,
                null);                 // ����Ŵ���ͼ��
        g.setColor(Color.black);    // ���÷Ŵ󾵱߿����ɫ
        // ����Ŵ󾵱߿�
        g.drawRect(Glass_X, Glass_Y, Glass_W - 1, Glass_H - 1);
    }
    // ����Ѿ������ľ��ο�ͷŴ��ͼ��

    void reprintGlass(int X, int Y, int new_X, int new_Y) {
        Graphics temp = g.create(); // ͬ��
        if (new_X <= X && new_Y <= Y) {
            temp.clipRect(new_X, new_Y + Glass_H, Glass_W + X - new_X, Y
                    - new_Y);
            temp.drawImage(image, 0, 0, null);
            temp = g.create();
            temp.clipRect(new_X + Glass_W, new_Y, X - new_X, Glass_H + Y
                    - new_Y);
            temp.drawImage(image, 0, 0, null);
        } else if (new_X > X && new_Y <= Y) {
            temp.clipRect(X, new_Y + Glass_H, Glass_W + new_X - X, Y - new_Y);
            temp.drawImage(image, 0, 0, null);
            temp = g.create();
            temp.clipRect(X, new_Y, new_X - X, Glass_H + Y - new_Y);
            temp.drawImage(image, 0, 0, null);
        } else if (new_X > X && new_Y > Y) {
            temp.clipRect(X, Y, Glass_W + new_X - X, new_Y - Y);
            temp.drawImage(image, 0, 0, null);
            temp = g.create();
            temp.clipRect(X, Y, new_X - X, Glass_H + new_Y - Y);
            temp.drawImage(image, 0, 0, null);
        } else {
            temp.clipRect(new_X, Y, Glass_W + X - new_X, new_Y - Y);
            temp.drawImage(image, 0, 0, null);
            temp = g.create();
            temp.clipRect(new_X + Glass_W, Y, X - new_X, Glass_H + new_Y - Y);
            temp.drawImage(image, 0, 0, null);
        }
    }
    //	 �÷������ж�infoflags�����Ƿ�����ȫ������ͼ�����򷵻�false�����򷵻�true

    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w,
                               int h) {
        if (infoflags == ALLBITS) { // ALLBITSָʾ�����������һ����ǰ���Ƶľ�̬ͼ�񣬲��ҿ�����������ʽ�ٴλ�������
            width = back_Image.getWidth(this);
            height = back_Image.getHeight(this);
            image = createImage(width + Glass_W / 2, height + Glass_H / 2);
            Graphics offg = image.getGraphics();
            offg.setColor(Color.white);
            offg.fillRect(0, 0, width + Glass_W / 2, height + Glass_H / 2);
            offg.drawImage(back_Image, 0, 0, this);
            repaint();
            return false;
        } else
            return true;
    }

    public void paint(Graphics g) {
        g.drawImage(back_Image, 0, 0, this); // �������ͼƬ
        printGlass();         // ���Ŵ�
    }
}
