package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class MoreThreadTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("frist");
        Thread2 t2 = new Thread2("second");
        Thread3 t3 = new Thread3("third");
        t1.start();
        t2.start();
        t3.start();
    }

}

class Thread1 extends Thread {
    String name;

    Thread1(String threadname) {
        name = threadname;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + "��" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(name + "�쳣");
        }
        System.out.println("�˳�");
    }
}

class Thread2 extends Thread {
    String name;

    Thread2(String threadname) {
        name = threadname;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + "��" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(name + "�쳣");
        }
        System.out.println("�˳�");
    }
}

class Thread3 extends Thread {
    String name;

    Thread3(String threadname) {
        name = threadname;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + "��" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(name + "�쳣");
        }
        System.out.println("�˳�");
    }
}

