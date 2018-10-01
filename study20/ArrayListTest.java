package org.gaozou.book.javaabc.examples.ch20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author TuringEmmy
 *
 */
public class ArrayListTest {
    public static void main(String[] args) { // java��������ڴ�
        add();                     // ���÷��������Ӻ��ʳ��
        leftovers();                 // ���÷������ʣ�µ�ʳ��
    }

    public static void add() {
        List list = new ArrayList(5); // ��������Ϊ5���б���
        list.add("����");             // ���Ԫ��(����)������������ʳ��
        list.add("��ѧ");
        list.add("����");
        list.add("����");
        System.out.println("��һ��ѡ�ε��еĿ�Ŀ:");
        for (Iterator iter = list.iterator(); iter.hasNext();) { // ʹ��Iterator����ѭ��
            Object obj = iter.next();     // ���ÿ��Ԫ��(����)
            System.out.print(obj + "\t");
            if ("��ѧ".equals(obj))     // ��һ����Ҫѡ����ѧ��Ŀ���������ж��ĸ�����ѧ
                iter.remove();             // ѡ����ȷ��Ե����Ƴ�����
        }
        System.out.println();
        System.out.println("�ڶ���ѡ�ε��еĿ�Ŀ��");
        Iterator it = list.iterator();// ���Iterator����
// ֻҪ��Ԫ��(����)�����ѭ�����ڶ���ѡ�Σ���ѧ�Ѿ�ѡ��
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println();
    }

    public static void leftovers() {     // �鿴����һϵ�п�Ŀ��ѡ������ʣ�µĿ�Ŀ
        Vector vector = new Vector(4);     // ��������Ϊ4����������
        vector.add("����");             // ���Ԫ��(����)
        vector.add("��ѧ");
        vector.add("����");
        vector.add("����");
        System.out.println("���û��ѡ��Ŀ�Ŀ:");
        for (Iterator iter = vector.iterator(); iter.hasNext();) { // ʹ��Iterator����ѭ��
            if (iter.next().equals("����"))     // ���һ��Ԫ�ؽ����ж�
                iter.remove();                 // �Ƴ�����
            else {
                System.out.println(iter.next().toString());// ���Ԫ��
            }
        }
    }
}
