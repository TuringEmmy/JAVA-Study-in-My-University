package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class MyThreadTest implements Runnable {
    //ʵ��run����

    public void run() {
        for (int i = 0; i < 10; i++)                        //forѭ��
        {
            try {
                Thread.sleep(100);                //�߳�����
            }
            catch (InterruptedException e)            //�����쳣
            {
                e.printStackTrace();
            }
            System.out.println("��" + i + "MyThreadTest");        //�߳���Ϣ
        }
    }
}

