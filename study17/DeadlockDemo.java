package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class DeadlockDemo {
    public static void main(String[] args) {
        //������Դ����
        Resource rs1 = new Resource("��Դ1");
        Resource rs2 = new Resource("��Դ2");
        Resource rs3 = new Resource("��Դ3");
        //��������ʵ��Runnable�ӿڵĶ���
        MyThread1 ms1 = new MyThread1(rs1, rs2, "�߳�1");
        MyThread1 ms2 = new MyThread1(rs2, rs3, "�߳�2");
        MyThread1 ms3 = new MyThread1(rs3, rs1, "�߳�3");
        //�����߳�
        Thread t1 = new Thread(ms1);
        Thread t2 = new Thread(ms2);
        Thread t3 = new Thread(ms3);
        //�����߳�
        t1.start();
        t2.start();
        t3.start();
    }
}

class Resource                     //��Դ��
{
    String resoureName;            //��Դ����

    Resource(String name) {
        this.resoureName = name;
    }
}

class MyThread1 implements Runnable     //ʵ��Runnble�ӿ�
{
    Resource rs1;                    //�߳���Ҫ����Դ1
    Resource rs2;                    //�߳���Ҫ����Դ1
    String name;

    MyThread1(Resource rs1, Resource rs2, String name) {//���췽��
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.name = name;
    }
    //run����������ͬ������䣬ֻ����ͬʱռ��������Դ����ʱ����ִ�����

    public void run() {
        synchronized (rs1)                 //����Դ1ͬ������
        {
            System.out.println(this.name + "���  " + rs1.resoureName);
            try {
                Thread.sleep(1000);        //�߳�����
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + "�ȴ�" + rs2.resoureName + "�ͷ�");
            synchronized (rs2)                 //����Դ2ͬ������
            {
                System.out.println(this.name + "���  " + rs2.resoureName);
                try {
                    Thread.sleep(1000);        //�߳�����
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

