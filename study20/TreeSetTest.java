package org.gaozou.book.javaabc.examples.ch20;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author TuringEmmy
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<People> people = new TreeSet<People>();    //����һ������ļ���
        People people1 = new People("����", "0001");    //����������ʼ��Student����
        People people2 = new People("����", "0002");
        People people3 = new People("����", "0003");
        People people4 = new People("����", "0004");
        People people5 = new People("Ǯ��", "0005");
        People people6 = new People("�Ը�", "0006");
        people.add(people1);                //��Ԫ��s1��ӵ�����
        people.add(people2);
        people.add(people3);
        people.add(people4);
        people.add(people5);
        people.add(people6);
        System.out.print(people);        //�������Ԫ��
    }

    public static void print(Collection c) {
        Iterator it = c.iterator();            //���ؼ��ϵ�����
        while (it.hasNext()) {            //����������
            Object o = it.next();
            System.out.println(o);    //���Ԫ��
        }
    }
}

class People implements Comparable {
    String name;                        //�����ַ���������name
    String id;                            //�����ַ���������id
    //����Student�����췽��

    public People(String name, String id) {
        this.name = name;                //��ʼ����Ա����name
        this.id = id;                    //��ʼ����Ա����id
    }
    //��������Ϣת��Ϊ�ַ�����Ϣ

    public String toString() {
        return name + "|" + id;            //������Ϣ
    }
    //ʵ��compareTo�ӿڣ��Ƚ�id�Ĵ�С

    public int compareTo(Object o) {
        People ts = (People) o;                //����People�ֲ�����
        return id.compareTo(ts.id);            //����compareTo������
    }
}
