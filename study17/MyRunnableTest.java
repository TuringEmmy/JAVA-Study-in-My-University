package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        //����ʵ��Runnable�ӿ���Ķ���
        RunnableTest1 rt = new RunnableTest1();
        //����Thread���󣬽���һ�����������������Ϊ����������
        Thread t = new Thread(rt);
        //�����߳�
        t.start();
    }
}

class RunnableTest1 implements Runnable {
    //ʵ��run������

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("��ϲ�㣬�߳��Ѿ�������" +
                "ִ����run�����еĴ���");
    }
}

