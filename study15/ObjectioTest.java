package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;
import java.util.Calendar;

/**
 * @author TuringEmmy
 *
 */
public class ObjectioTest {
    // ������������

    public static void serialize(String fileName) throws Exception {
        // ����һ�������������������������ļ�
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                fileName));
        out.writeObject("��������ں�ʱ�����£�"); // ���л�һ���ַ��������ļ�
        out.writeObject(Calendar.getInstance());// ���л���ǰ���ڶ����ļ�
        // ���л�һ��MyClass����
        TestClass tc = new TestClass(1, 2, 3, 4);
        out.writeObject(tc);
        out.close();
    }
    // �����л��Ķ�������

    public static void deserialize(String fileName) throws Exception {
        // ����һ�����������������ļ���ȡ����
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                fileName));
        // ��ȡ�ַ�������
        String today = (String) (in.readObject());
        System.out.println(today);
        // ������Calendar����
        Calendar date = (Calendar) (in.readObject());
        System.out.println(date.get(Calendar.YEAR) + "��"
                + (date.get(Calendar.MONTH) + 1) + "��"
                + date.get(Calendar.DAY_OF_MONTH) + "�գ�"
                + date.getTime().toLocaleString());
        // ���������ж�ȡTestClass����
        TestClass tc = (TestClass) (in.readObject());
        System.out.println(tc.toString());
        in.close();
    }

    public static void main(String[] args) {
        System.out.println("�����л��Ľ�����£�");
        String fileName = "D:/temp/TestClass.txt";
        try {
            ObjectioTest.serialize(fileName);
        } catch (Exception e) {
            System.out.println("�������л�ʧ��" + e.getMessage());
        }
        try {
            ObjectioTest.deserialize(fileName);
        } catch (Exception e) {
            System.out.println("�������л�ʧ��" + e.getMessage());
        }
    }
}
// һ���࣬���ڱ����л��ͷ����л���
//һ��Ҫʵ��Serializable���ܹ������л��ͷ����л���

class TestClass implements Serializable {
    private int i, n; // һ���ʵ�������ᱻ���л��ͷ����л�
    private transient int x; // ��transient�����ı������ᱻ���л��ͷ����л�
    private static int y; // �����Ҳ���ᱻ���л��ͷ����л�

    public TestClass(int m, int n, int x, int y) {// ���ù��췽����ֵ
        this.i = m;
        this.n = n;
        this.x = x;
        TestClass.y = y;
    }

    public String toString() {
        return i + " : " + n + "  :" + x + "  :" + y;
    }
}

