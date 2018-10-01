package org.gaozou.book.javaabc.examples.ch20;

import java.util.*;

/**
 * @author TuringEmmy
 *
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();    //����HashMap����hm
        hm.put("���� ", new Integer(5));        //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("����", new Integer(3));         //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("���� ", new Integer(2));         //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("����", new Integer(1));         //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("Ǯ��", new Integer(4));         //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("�Ը�", new Integer(7));         //���һ��ӳ���ϵ�ļ�ֵ
        hm.put("˼˼", new Integer(6));        //���һ��ӳ���ϵ�ļ�ֵ
        //����һ��TreeMap����
        Map<String, Integer> sortedMap = new TreeMap<String, Integer>();
        sortedMap.putAll(hm);                //��hm���е�Ԫ�������sortedMap
        System.out.println(sortedMap);        //���sortedMap�ļ�ֵ��
        Iterator itk = hm.keySet().iterator();//����hm�ļ��ĵ�����
        Iterator itv = hm.values().iterator();//����hmֵ�ĵ�����
        while (itk.hasNext()) {            //ͨ�����ĵ���������
            Object key = itk.next();//���ؼ�����һ��Ԫ��
            Object value = itv.next();    //����ֵ����һ��Ԫ��
            System.out.print(key.toString() + "=");//�����������
            System.out.print(value.toString() + ", ");//���ֵ
        }
    }

    public static void print(Collection c)    //���������
    {
        Iterator it = c.iterator();        //���ص�����
        while (it.hasNext())        //����������
        {
            Object o = it.next();    //��ȡ��һ��Ԫ��
            System.out.println(o);//�����
        }
    }
}

