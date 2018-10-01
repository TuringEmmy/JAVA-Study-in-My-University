package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class BubbleTest extends Applet implements Runnable {
    Thread artist = null;
    int bubble = 0, thisbubble = 0;     // ������������ǰ������
    int MAXBUBBLES = 25;                 // �����������
    int stepper = 4;                     //�ƶ���ƫ����
    int record[][] = new int[MAXBUBBLES][5]; // ��¼����Ķ�ά����

    public void init() {                // ��ʼ��applet
        resize(400, 400);             // �趨applet�ߴ�
    }
    // �������

    public void draw_bubble(int x, int y, int r, Color col, Graphics g) {
        int i;
        for (i = x - r; i <= x + r; i++) {    // ���һ��Բ��
            g.setColor(col);
            g.drawLine(i, y - (int) (Math.sqrt(r * r - ((i - x) * (i - x)))),
                    i, y + (int) (Math.sqrt(r * r - ((i - x) * (i - x)))));
        }
    }
    //�������ݵ��ƶ�

    public void move_bubble(int x, int y, int r, Color col, int step, Graphics g) {
        int i;
        for (i = x - r; i <= x + r; i++) {    // �������������ϰ벿��
            g.setColor(col);
            g.drawLine(i, y - (int) (Math.sqrt(r * r - ((i - x) * (i - x)))),
                    i, y + step
                            - (int) (Math.sqrt(r * r - ((i - x) * (i - x)))));
        }
        for (i = x - r; i <= x + r; i++) {    // �������������°벿��
            g.setColor(Color.white);
            g.drawLine(i, y + (int) (Math.sqrt(r * r - ((i - x) * (i - x)))),
                    i, y + step
                            + (int) (Math.sqrt(r * r - ((i - x) * (i - x)))));
        }
    }

    public void paint(Graphics g) {
        int i, j, tmp;
        if (bubble < MAXBUBBLES || thisbubble < MAXBUBBLES) {
            record[thisbubble][0] = (int) (Math.random() * 300);
            record[thisbubble][1] = 320;
            record[thisbubble][2] = (int) (Math.random() * 400) / 20;
            record[thisbubble][3] = (int) (Math.random() * 255);
            record[thisbubble][4] = (int) (Math.random() * 255);
            // �������
            draw_bubble(record[thisbubble][0], record[thisbubble][1],
                    record[thisbubble][2], new java.awt.Color(
                            record[thisbubble][3], record[thisbubble][4], 255),
                    g);
            // ���������С�����ֵ����������������1����ǰ����������1
            if (bubble < MAXBUBBLES) {
                bubble++;
                thisbubble++;
            } else
                // �������������ֵ
                thisbubble = MAXBUBBLES;
        }
        for (i = 0; i < bubble; i++) {
            if (i % 5 <= stepper) {
                record[i][1] -= 1;
                // �ƶ�����
                move_bubble(record[i][0], record[i][1], record[i][2],
                        new java.awt.Color(record[i][3], record[i][4], 255), 1,
                        g);
                for (j = 0; j < i; j++) {
                    tmp = ((record[i][1] - record[j][1])
                            * (record[i][1] - record[j][1]) + (record[i][0] - record[j][0])
                            * (record[i][0] - record[j][0]));
                    if (j != i && Math.sqrt(tmp) < record[i][2] + record[j][2]) {
                        for (tmp = record[i][2]; tmp >= -1; tmp = tmp - 2)
                            draw_bubble(record[i][0], record[i][1],
                                    record[i][2] - tmp, Color.white, g);
                        draw_bubble(record[j][0], record[j][1], record[j][2],
                                new java.awt.Color(record[j][3], record[j][4],
                                        255), g);
                        record[i][1] = -1;
                        record[i][2] = 0;
                    }
                }
            }
            if (record[i][1] + record[i][2] < 0 && bubble >= MAXBUBBLES) {
                thisbubble = i;
            }
            stepper = (int) (Math.random() * 10);
        }
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void start() {
        // ����applet,�����������߳�
        if (artist == null) {
            artist = new Thread(this);
            artist.start();
        }
    }

    public void stop() {
        // ����applet
        artist = null;
    }

    public void run() {
        // �����߳�
        while (artist != null) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            repaint();
        }
        artist = null;
    }
}
