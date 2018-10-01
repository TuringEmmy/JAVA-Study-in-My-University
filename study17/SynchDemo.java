package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class SynchDemo {
    public static void main(String[] args) {
        //����һ����ӡ������
        Printer ps = new Printer();
        //����3����ʦʵ��
        Teacher t1 = new Teacher(ps, "lancy", 87, 76, 90);
        Teacher t2 = new Teacher(ps, "macula", 97, 86, 70);
        Teacher t3 = new Teacher(ps, "herbert", 67, 86, 97);
        //������ӡ����
        t1.t.start();
        t2.t.start();
        t3.t.start();
    }
}
//Printer������ģ���ӡ���������Ի����Ϣ��������ӡ����

class Printer {
    //��ӡ����

    void printScore(String name, int score1, int score2, int score3) {
        System.out.println(name + "�ĳɼ���");
        System.out.print(name + "Ӣ�");
        System.out.println(score1);
        //Ϊ���ǳ������н�����ԣ��ڴ�ӡ�Ĺ������ô�ӡ��������һ��ʱ��
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(name + "��ѧ��");
        System.out.println(score2);
        System.out.print(name + "���ģ�");
        System.out.println(score3);
    }
}
//��ʦ�࣬ÿ����ʦ�����Լ����̲߳��ҹ���һ����ӡ��

class Teacher implements Runnable {
    Printer ps = null;                            //��ӡ��
    String name = null;                            //����
    Thread t;                                //�߳�
    int score1 = 0;                                //�ɼ�
    int score2 = 0;
    int score3 = 0;
    //��ʦ��Ĺ��캯��

    Teacher(Printer printer, String nm, int s1, int s2, int s3) {
        ps = printer;
        name = nm;
        t = new Thread(this);
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    //��ʦ���ô�ӡ��

    public void run() {
        ps.printScore(name, score1, score2, score3);
    }
}
