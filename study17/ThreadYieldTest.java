package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadYieldTest {
    public static void main(String[] args) {
        FirstTest2 one = new FirstTest2();        //����FirstTest����
        SecondTest2 two = new SecondTest2();        //����secondTest����
        ThirdTest2 threa = new ThirdTest2();        //����thirdTest����
        one.start();                            //����one�߳�
        two.start();                            //����two�߳�
        threa.start();                        //����threa�߳�
    }
}
//������һ���߳�

class FirstTest2 extends Thread {
//	ʵ��run()������

    public void run() {
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {            //ѭ����ӡ����
                a++;
                System.out.println("��һ���߳�   ��" + a + "��ѭ��");//��ӡ���
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //����쳣
        } finally {
        }

    }

}
//�����ڶ����߳�

class SecondTest2 extends Thread {
//	ʵ��run()������

    public void run() {
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {                    //ѭ����ӡ����
                a++;
                System.out.println("�ڶ����߳�   ��" + a + "��ѭ��");//��ӡ���
                Thread.yield();            //�߳��ò�
            }
        } catch (Exception e) {
            System.out.println("�쳣");    //��ӡ����쳣
        }
    }
}
//�����������߳�

class ThirdTest2 extends Thread {
//	ʵ��run()������

    public void run() {
        // TODO �Զ����ɷ������
        try {
            for (int a = 0; a < 5;) {                        //ѭ����ӡ����
                a++;
                System.out.println("�������߳�   ��" + a + "��ѭ��");//��ӡ���
            }
        } catch (Exception e) {
            System.out.println("�쳣");        //��ӡ����쳣
        }
    }
}

