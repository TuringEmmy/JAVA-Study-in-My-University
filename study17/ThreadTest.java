package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();        //�����̶߳���
        mt.start();                            //�����߳�
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);        //���߳�����
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("��" + i + "ThreadDemo");    //���̴߳�ӡ�����Ϣ
        }
    }
}

class MyThread extends Thread {
    //��дrun����

    public void run() {
        for (int i = 0; i < 10; i++)                //����forѭ�����
        {
            try                             //����try������
            {
                Thread.sleep(100);            //����sleep�����õ�ǰ�߳�����
            }
            catch (InterruptedException e)    //catch��������쳣
            {
                e.printStackTrace();
            }
            System.out.println("��" + i + "MyThread");//���߳��д�ӡ����ص���Ϣ
        }
    }
}

