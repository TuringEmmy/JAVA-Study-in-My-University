package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class RunnableTest {
    public static void main(String[] args) {

        MyThreadTest my = new MyThreadTest();            //����MyThread�����
        Thread thr = new Thread(my);                //�����µ��̶߳���
        thr.start();                                //�����߳�
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);                //���߳�����
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("��" + i + "RunnableTest");    //���߳���Ϣ
        }
    }
}

