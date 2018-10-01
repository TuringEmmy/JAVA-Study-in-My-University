package org.gaozou.book.javaabc.examples.ch17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

/**
 * @author TuringEmmy
 *
 */
public class DigitalTimer extends JLabel implements ActionListener {
    private volatile String value;    // Ҫ���ı�������ʾ������
    private Thread thread;            // ����һ���߳�
    private volatile boolean isStop;// ��ʶ�Ƿ�ֹͣ��ʱ
    Runnable r = null;                //����һ��Runnable����Ķ���

    public DigitalTimer() {            // ���췽��ΪSwing�����ʼ��
        setBorder(BorderFactory.createLineBorder(Color.blue));
        setHorizontalAlignment(SwingConstants.RIGHT);
        this.setForeground(Color.red);
        setFont(new Font("SansSerif", Font.BOLD, 16));
        setText("00000.0");         //����component�Ĵ�С
        setMinimumSize(getPreferredSize());
        setPreferredSize(getPreferredSize());
        setSize(getPreferredSize());
        value = "0.0";
        setText(value);
        isStop = true;
        r = new Runnable() {        // ����һ��ʵ��Runnable�ӿ��ڲ������

            public void run() {
                try {
                    startTime();
                } catch (Exception x) {
                    x.printStackTrace();
                }
            }
        };
        thread = new Thread(r, "Stopwatch");// ����Runnable����������һ���߳�
        thread.start();                        // �����߳�
    }

    private void startTime() {                // ��ʼ��ʱ
        long startTime = System.currentTimeMillis();// �߳̿�ʼ���е�ʱ��
        int n = 0;                            // һ��ʱ����
        long sleepTime = 100;                // �߳��������ߵ�ʱ��
        long nextSleepTime = 100;            // ������׼�����ߵ�ʱ��
        DecimalFormat format = new DecimalFormat("0.0");
        Runnable updateText = new Runnable() {
            public void run() {
                setText(value);
            }
        };
        while (isStop) {
            try {
                Thread.sleep(nextSleepTime);
                n++;
                // ��ȡϵͳ�ĵ�ǰʱ��
                long nowTime = System.currentTimeMillis();
                // ������ʱ��=��ǰʱ��-��ʼʱ��
                long elapsedTime = nowTime - startTime;
                nextSleepTime = sleepTime + ((n * 100) - elapsedTime);
                if (nextSleepTime < 0) {
                    nextSleepTime = 0;
                }
                value = format.format(elapsedTime / 1000.0);
                System.out.println(value);
                // ʹ���߳���Swing�����ͬ��ִ��
                SwingUtilities.invokeAndWait(updateText);
            } catch (InterruptedException ix) {
                return;            // ֹͣ����
            } catch (InvocationTargetException x) {
                x.printStackTrace();
            }
        }
    }

    public void endTime() {        // ������ʱ
        isStop = false;
        thread.interrupt();        // �ж��߳�
    }

    public boolean isAlive() {
        return thread.isAlive();    // �жϸ��߳��Ƿ��ǻ��
    }

    public static void main(String[] args) {
        DigitalTimer dt = new DigitalTimer();// ����һ�������ʵ��������
        // ����һ���������䲼�ַ�ʽΪ������
        JPanel p = new JPanel(new FlowLayout());
        p.add(dt);                    // ���������ӵ������
        JFrame frame = new JFrame("���ּ�ʱ��");// ����һ�����
        // ����2��JButton��Ť���������ǿ�ʼ��ʱ��ֹͣ��ʱ����Ϊ�������Ӧ���¼�����
        JButton b1 = new JButton();
        b1.setText("��ʼ");                // Ϊ��Ť�����ı�����
        b1.setBounds(20, 40, 60, 20);    // ���ð�Ť�Ĵ�С
        b1.setActionCommand("start");    // ���ü����˰�Ť���¼���������
        b1.addActionListener(dt);        // ��Ӽ����¼�
        JButton b2 = new JButton();
        b2.setText("ֹͣ");
        b2.setBounds(80, 40, 60, 20);
        b2.setActionCommand("end");        // ���ü����˰�Ť���¼���������
        b2.addActionListener(dt);        // ��Ӽ����¼�
        frame.setContentPane(p);        // �ڸÿ����������
        frame.add(b1);                    // �ڸÿ������Ӱ�Ť���
        frame.add(b2);
        frame.setSize(250, 100);        // ���ÿ�ܵĴ�С
        frame.setVisible(true);            // ���ÿ��Ϊ�ɼ�
    }

    public void actionPerformed(ActionEvent e) {// �¼�����
        if (e.getActionCommand().equals("start")) {    // ���������ʼ��Ť
            if (!isAlive()) {            // �ж������ǰ���̲߳����ڿɻ״̬
                isStop = true;            // ��״̬����Ϊtrue
                //���¸���Runnable����������һ���µ��߳�
                thread = new Thread(r, "Stopwatch");
                thread.start();            // �������߳�
            } else {
                startTime();
            }
        } else if (e.getActionCommand().equals("end")) {// �������ֹͣ��Ť
            endTime();    // �����endTime�������жϵ�ǰ�������е��߳�
        }
    }
}

