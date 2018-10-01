package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class SynchMethodDemo {
    public static void main(String[] args) {
        Source s = new Source();                //����һ����Դ����
        //��������ʵ��Runnable�ӿڵĶ���
        MyThread2 mt1 = new MyThread2(s, "method1");
        MyThread2 mt2 = new MyThread2(s, "method2");
        //���������߳�
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        //�����߳�
        t1.start();
        t2.start();
    }
}

class Source {
    //����ͬ������method1

    synchronized void method1() {
        System.out.println("���뷽��method1�������");
        try {
            Thread.sleep(1000);                //�߳�����
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mehtod1ִ����ϣ��ͷ���");
    }
    //����ͬ������method2

    synchronized void method2() {
        System.out.println("���뷽��method2�������");
        try {
            Thread.sleep(1000);                //�߳�����
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mehtod2ִ����ϣ��ͷ���");
    }
}
//�����߳���

class MyThread2 implements Runnable {
    String name;                            //ͨ��name���жϵ����ĸ�����
    Source s = null;

    MyThread2(Source s, String nm)                //���췽��
    {
        this.s = s;
        name = nm;
    }

    public void run() {                        //�߳�ִ��ʱ�Ĳ���
        if ("method1".equals(name))
            s.method1();                    //����ͬ������1
        else {
            System.out.println("Thread2������׼������method2");
            s.method2();                    //����ͬ������2
        }
    }
}
