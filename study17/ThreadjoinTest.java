package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadjoinTest {
    public static void main(String[] args) {
        FirstTest1 one = new FirstTest1();    //����FirstTest����
        SecondTest1 two = new SecondTest1();    //����secondTest����
        ThirdTest1 threa = new ThirdTest1();    //����thirdTest����
        one.start();                        //����one�߳�
        two.start();                        //����two�߳�
        threa.start();                    //����threa�߳�
    }
}
//������һ���߳�

class FirstTest1 extends Thread {
//	ʵ��run()������

    public void run() {
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 10;) {            //ѭ����ӡ����
                a++;
                System.out.println("��һ���߳�   ��" + a + "��ѭ��");    //��ӡ���
                Thread.sleep(1000);        //���1���ӡһ��
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //��ӡ����쳣
        } finally {
        }
    }
}
//�����ڶ����߳�

class SecondTest1 extends Thread {
    public FirstTest1 first;

    public void run() {            //ʵ��run()������
        // TODO �Զ����ɷ������
        for (int a = 0; a < 10;) {    //ѭ����ӡ����
            try {
                a++;
                System.out.println("�ڶ����߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.sleep(1000);    //���1���ӡһ��
            } catch (Exception e) {
                System.out.println("�쳣");    //��ӡ����쳣
            }
            if (a == 4) {
                try {
                    first.join();            //�����߳�FirstTest1
                } catch (InterruptedException e) {
                    // TODO �Զ����� catch ��
                    e.printStackTrace();
                }
            }
        }
    }
}
//�����������߳�

class ThirdTest1 extends Thread {
//	ʵ��run()������

    public void run() {
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 10;) {            //ѭ����ӡ����
                a++;
                System.out.println("�������߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.sleep(1000);        //���1���ӡһ��
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //��ӡ����쳣
        }
    }
}

