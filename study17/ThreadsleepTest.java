package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadsleepTest {
    public static void main(String[] args) {
        FirstTest one = new FirstTest();        //����FirstTest����
        SecondTest two = new SecondTest();    //����secondTest����
        ThirdTest threa = new ThirdTest();    //����thirdTest����
        one.start();                        //����one�߳�
        two.start();                        //����two�߳�
        threa.start();                    //����threa�߳�
    }
}
//������һ���߳�

class FirstTest extends Thread {
    public void run() {                //	ʵ��run()������
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {            //ѭ����ӡ����
                a++;                        //a����1
                System.out.println("��һ���߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.sleep(2000);        //���2���ӡһ��
            }
        } catch (Exception e) {
            System.out.println("�쳣");
        }
    }
}
//�����ڶ����߳�

class SecondTest extends Thread {
    public void run() {                //ʵ��run()������
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {        //ѭ����ӡ����
                a++;
                System.out.println("�ڶ����߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.sleep(2500);    //���2.5���ӡһ��
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //��ӡ����쳣
        }
    }
}
//�����������߳�

class ThirdTest extends Thread {
    public void run() {                    //ʵ��run()������
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {            //ѭ����ӡ����
                a++;
                System.out.println("�������߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.sleep(3000);        //���3���ӡһ��
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //��ӡ���
        }
    }
}

