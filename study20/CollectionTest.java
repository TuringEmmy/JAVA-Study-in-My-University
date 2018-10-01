package org.gaozou.book.javaabc.examples.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author TuringEmmy
 *
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collstr = new ArrayList<String>();
        //����һ��Ԫ��λString���͵��б�
        collstr.add("����");        //Ϊ�б����Ԫ��
        collstr.add("����");
        collstr.add("����");
        collstr.add("����");
        System.out.println(collstr);    //�������Ԫ������
        Object[] arrayo = collstr.toArray();    //���б�ת��λ����
        Collection<String> coll = new ArrayList<String>();
        //����һ��Ԫ��λ�ַ������͵��б�
        coll.add("�Ը�");    //Ϊ�б����Ԫ��
        coll.add("����");
        coll.addAll(collstr);
        System.out.println(coll);//����ڶ��������е�Ԫ������
        System.out.println("coll.contains(\"�Ը�\") = " + coll.contains("�Ը�"));
        //�鿴�б��Ƿ����"�Ը�"
        System.out.println("coll.contains(collstr) = " + coll.containsAll(collstr));
        //�жϵڶ��������Ƿ�����е�һ�������е�Ԫ��
        coll.retainAll(collstr);//�ӵڶ���������ɾ����һ�������в�������Ԫ��
        System.out.println("�ӵڶ���������ɾ����һ�������в�������Ԫ�أ��ڶ�������Ԫ��Ϊ");
        //����ַ�����Ϣ
        System.out.println(coll);    //����ڶ��������еĵ�Ԫ��
        coll.add("�Ը�");    //λ�б�c2���Ԫ��
        Iterator it = coll.iterator();    //�����б������
        System.out.print("[");        //����ַ�����Ϣ
        while (it.hasNext())        //ͨ�������������б�Ԫ��
            System.out.print(it.next() + ", ");//�������Ԫ��
        System.out.println("]");        //����ַ�����Ϣ
        coll.removeAll(collstr);         //��colll�б���ɾ��collstr��Ԫ��
        System.out.println("�ӵڶ�����������ɾ����һ�������а�����Ԫ�أ��ڶ�������Ԫ��Ϊ");
        //����ַ�����Ϣ
        System.out.println(coll);//����ڶ��������е�Ԫ��
        coll.remove("�Ը�");        //ɾ��Ԫ�ء��Ը�"
        System.out.println("coll.isEmpty() = " + coll.isEmpty());    //�鿴����Ƿ�λ���б�
        System.out.println(collstr);    //�����һ������
        collstr.clear();//�����һ�������е�Ԫ��
        System.out.println("ʹ�÷���clear()�󣬵�һ�������е�Ԫ��\n" + collstr);
    }
}

