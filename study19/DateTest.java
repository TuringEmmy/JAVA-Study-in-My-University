package org.gaozou.book.javaabc.examples.ch19;

import java.util.Date;

/**
 * @author TuringEmmy
 *
 */
public class DateTest {
    public static void main(String[] args) {
        //��ȡ��ϵͳ��ǰʱ��
        System.out.println("��ǰʱ���ǣ�" + System.currentTimeMillis());
        //��ȡ��ϵͳ��ǰ����
        Date date = new Date();
        System.out.println("���ڵ�ʱ���ǣ�" + date.toString());
        //��ȡ���ӱ�׼��׼ʱ�䵽���ڵĺ�����
        System.out.println("��1970��1��1��0ʱ0��0�뿪ʼ�������ĺ�������	" + date.getTime());
    }
}
