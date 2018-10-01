package org.gaozou.book.javaabc.examples.ch17;

import java.applet.Applet;
import java.awt.*;
import java.util.Date;

/**
 * @author TuringEmmy
 *
 */
public class MoveClock extends Applet implements Runnable {
    Thread hhread = null;                             // ʱ���߳�
    Thread mThread = null;                         // �����߳�
    Thread sThread = null;                         // �����߳�
    // ��ʾʱ,��,����˵��XY�����
    int hourX, hourY, minuteX, minuteY, secondX, secondY;
    int currentHour = 0;             // ��ȡ��ǰʱ���д���Сʱ������ֵ
    int currentMinute = 0;         // ��ȡ��ǰʱ���д�����ӵ�����ֵ
    int currentSecond = 0;         // ��ȡ��ǰʱ���д����������ֵ
    Graphics sGraphics = null;         // �����������
    Graphics mGraphics = null;         // ���Ʒ������
    Graphics hGraphics = null;         // ����ʱ�����
    Graphics2D mg2D = null;            // ����Graphics2D�ֶ���
    Graphics2D hg2D = null;            // ����Graphics2DСʱ����
    Graphics2D sg2D = null;            // ����Graphics2D�����
    double drawX[] = new double[61];     // ��ű��̶̿ȵ�X������
    double drawY[] = new double[61];         // ��ű��̶̿ȵ�Y������
    double dial_x[] = new double[61];         // �����Ʊ���ʹ��x������ֵ
    double dial_y[] = new double[61];        // �����Ʊ���ʹ��Y������ֵ
    int isRestart = 0;                     // �ж��Ƿ����¿�ʼ

    public void init() {                     // ���ݳ�ʼ��
        hGraphics = this.getGraphics();        // ʵ����ʱ��Graphics����
        hGraphics.setColor(Color.white);    // ����ʱ�����ɫ
        hg2D = (Graphics2D) hGraphics;        // ʵ����ʱ��Graphics2D����
        hGraphics.translate(200, 200);         // ��������ϵͳ�任ԭ������(200,200)��
        mGraphics = this.getGraphics();     // ʵ���������Graphics����
        mg2D = (Graphics2D) mGraphics;        // ʵ���������Graphics2D����
        mGraphics.setColor(Color.green);     // ���÷������ɫ
        mGraphics.translate(200, 200);     // ��������ϵͳ�任������ԭ������(200,200)��	30				sGraphics = this.getGraphics(); 		// ʵ��������Graphics����
        sg2D = (Graphics2D) sGraphics;    // ʵ��������Graphics2D����
        sGraphics.setColor(Color.blue);// �����������ɫ
        sGraphics.translate(200, 200);     // ��������ϵͳ�任��ԭ������(200,200)��
        drawX[0] = 0;
        // ����ʱ��12�㴦��λ�����꣨��������ϵ�����꣩
        drawY[0] = -120;
        dial_x[0] = 0;
        // 12�㴦�Ŀ̶�λ�����꣨��������ϵ�����꣩
        dial_y[0] = -140;
        double jiaodu = 6 * Math.PI / 180;
        // ���̷ָ��60�֣����ָ�����������������
        for (int i = 0; i < 60; i++) {
            drawX[i + 1] = drawX[i] * Math.cos(jiaodu) - Math.sin(jiaodu)
                    * drawY[i];
            drawY[i + 1] = drawY[i] * Math.cos(jiaodu) + drawX[i]
                    * Math.sin(jiaodu);
        }
        drawX[60] = 0;
        drawY[60] = -120;
        // ���̷ָ��60�֣����ָ����������ڻ���������
        for (int i = 0; i < 60; i++) {
            dial_x[i + 1] = dial_x[i] * Math.cos(jiaodu) - Math.sin(jiaodu)
                    * dial_y[i];
            dial_y[i + 1] = dial_y[i] * Math.cos(jiaodu) + Math.sin(jiaodu)
                    * dial_x[i];
        }
        dial_x[60] = 0;
        dial_y[60] = -140;
    }

    public void start() {
        if (isRestart >= 1) {
            sThread.interrupt();             // �����߳�
            mThread.interrupt();
            hhread.interrupt();
        }
        hhread = new Thread(this);         // ����ʱ���߳�
        mThread = new Thread(this);         // ���������߳�
        sThread = new Thread(this);         // ���������߳�
        sThread.start();                     // ���������߳�
        mThread.start();                     // ���������߳�
        hhread.start();                     // ����ʱ���߳�
        isRestart++;
        if (isRestart >= 2)
            isRestart = 1;
    }

    public void stop() {
        sThread.interrupt();                 // �����߳�
        mThread.interrupt();
        hhread.interrupt();
    }

    public void paint(Graphics g) {         // ����ͼ��
        this.setBackground(Color.black);
        this.start();
        g.drawOval(50, 50, 300, 300);        // ���̵���Ȧ
        g.translate(200, 200);             // ��������ϵͳ�任
        for (int i = 0; i < 60; i++) {         // ���Ʊ��̵�С�̶Ⱥʹ�̶�
            if (i % 5 == 0) {
                g.setColor(Color.red);     // ������ɫ
                g.fillOval((int) dial_x[i], (int) dial_y[i], 10, 10);
            } else
                g.fillOval((int) dial_x[i], (int) dial_y[i], 5, 5);
        }
    }

    public void run() {                     // ʵ��Thread�ķ���,��ʼ�߳�
        Date date = new Date();             // ��ȡ����ʱ��
        String string = date.toString();
        // ��õ�ǰʱ���Сʱ
        currentHour = Integer.parseInt(string.substring(11, 13));
        // ��ȡ��ǰʱ��ķ���
        currentMinute = Integer.parseInt(string.substring(14, 16));
        // ��ȡ��ǰʱ�������
        currentSecond = Integer.parseInt(string.substring(17, 19));
        if (Thread.currentThread() == sThread) {     // �����ǰ�߳������߳�
            secondX = (int) drawX[currentSecond];    // �����ʼ��
            secondY = (int) drawX[currentSecond];
            // �ñ���ɫ���ǰһ�������
            sGraphics.drawLine(0, 0, secondX, secondY);
            sg2D.setStroke(new BasicStroke(2.0f));    // ��������������Ŀ��
            int i = currentSecond;
            while (true) {
                try {
                    sThread.sleep(1000);             // ÿ��һ������
                    Color c = getBackground();        // ��ȡ������ɫ
                    sGraphics.setColor(c);         // �����������ɫ
                    // �ñ���ɫ���ǰһ�������
                    sGraphics.drawLine(0, 0, secondX, secondY);
                    sg2D.setStroke(new BasicStroke(2.0f));
                    // ����������غ�,�ָ�������ʾ
                    if ((secondX == minuteX) && (secondY == minuteY)) {
                        // �ñ���ɫ���ǰһ�ֵķ���
                        mGraphics.drawLine(0, 0, minuteX, minuteY);
                    }
                    // ������ʱ���غϣ��ָ�ʱ�����ʾ
                    if ((secondX == hourX) && (secondY == hourY)) {
                        // �ñ���ɫ���ǰһʱ��ʱ��
                        hGraphics.drawLine(0, 0, hourX, hourY);
                        // ����������ʱ��Ŀ��
                        hg2D.setStroke(new BasicStroke(4.0f));
                    }
                } catch (InterruptedException e) {         // �����쳣
                    Color c = getBackground();         // ��ȡ������ɫ
                    sGraphics.setColor(c);                // �����������ɫ
                    // �ñ���ɫ�������
                    sGraphics.drawLine(0, 0, secondX, secondY);
                    sg2D.setStroke(new BasicStroke(2.0f));
                    return;
                }
                secondX = (int) drawX[(i + 1) % 60];     // ������ǰ��һ����λ
                secondY = (int) drawY[(i + 1) % 60]; // ÿһ����6�ȣ�һ����λ��
                sGraphics.setColor(Color.blue);    // �����������ɫ
                // �ñ���ɫ���ǰһ�������
                sGraphics.drawLine(0, 0, secondX, secondY);
                sg2D.setStroke(new BasicStroke(2.0f));
                i++;
            }
        }
        if (Thread.currentThread() == mThread) { // �����ǰ�߳��Ƿ��߳�
            minuteX = (int) drawX[currentMinute];
            minuteY = (int) drawY[currentMinute];
            mGraphics.drawLine(0, 0, minuteX, minuteY);
            mg2D.setStroke(new BasicStroke(3.0f));
            int i = currentMinute; // ��ȡ��ǰ����
            while (true) {
                try { // ��һ�ι�60-second���ǰ��һ���ӣ��Ժ�ÿ��60��ǰ��һ����
                    mThread.sleep(1000 * 60 - currentSecond * 1000);
                    currentSecond = 0;
                    Color c = getBackground();// ��ȡ������ɫ
                    mGraphics.setColor(c);    // ���÷������ɫ
                    mg2D.setStroke(new BasicStroke(3.0f));// ���������Ʒ���Ŀ��
                    mGraphics.drawLine(0, 0, minuteX, minuteY);
                    // ���ʱ��ͷ����غ�
                    if ((hourX == minuteX) && (hourY == minuteY)) {
                        hGraphics.drawLine(0, 0, minuteX, minuteY);
                        hg2D.setStroke(new BasicStroke(4.0f));
                    }
                } catch (InterruptedException e) {
                    return;
                }
                minuteX = (int) drawX[(i + 1) % 60]; // ������ǰ��һ����λ
                minuteY = (int) drawY[(i + 1) % 60]; // ÿһ����6�ȣ�һ����λ��
                mGraphics.setColor(Color.BLUE);     // ���Ʒ������ɫ
                mg2D.setStroke(new BasicStroke(3.0f));
                mGraphics.drawLine(0, 0, minuteX, minuteY);
                i++;
                currentSecond = 0;
            }
        }
        if (Thread.currentThread() == hhread) { // �����ǰ�߳���ʱ�߳�
            int h = currentHour % 12;
            hourX = (int) drawX[h * 5 + currentMinute / 12];
            hourY = (int) drawY[h * 5 + currentMinute / 12];
            int i = h * 5 + currentMinute / 12;
            hGraphics.drawLine(0, 0, hourX, hourY);
            hg2D.setStroke(new BasicStroke(4.0f));
            while (true) {
                try {
                    // ��һ�ι�12-minute%12���Ӿ�ǰ��һ���̶�,�Ժ�ÿ��12����ǰ��һ�̶�
                    hhread.sleep(1000 * 60 * 12 - 1000 * 60
                            * (currentMinute % 12) - currentSecond * 1000);
                    currentMinute = 0;
                    Color c = getBackground();
                    hGraphics.setColor(c);
                    hGraphics.drawLine(0, 0, hourX, hourY);
                    hg2D.setStroke(new BasicStroke(4.0f));
                } catch (InterruptedException e) {
                    return;
                }
                hourX = (int) drawX[(i + 1) % 60];
                hourY = (int) drawY[(i + 1) % 60];
                hGraphics.setColor(Color.BLACK);
                hGraphics.drawLine(0, 0, hourX, hourY);
                hg2D.setStroke(new BasicStroke(4.0f));
                i++;
                currentMinute = 0;
            }
        }
    }
}

