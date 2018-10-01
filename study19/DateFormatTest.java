package org.gaozou.book.javaabc.examples.ch19;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author TuringEmmy
 *
 */
public class DateFormatTest {
    public static void main(String[] args) {

        Date date = new Date();
        DateFormat df1 = DateFormat.getInstance();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,
                Locale.CHINA);
        DateFormat df4 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss�� EE",
                Locale.CHINA);
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEEEE",
                Locale.US);
        DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df7 = new SimpleDateFormat("yyyy��MM��dd��");

        System.out.println("����Java��Ĭ�ϸ�ʽ���������Ĭ�ϵ������ǣ�" +
                df1.format(date));
        System.out.println("����ָ����ʽyyyy-MM-dd hh:mm:ss EE��ϵͳĬ�������ǣ�" +
                df2.format(date));
        System.out.println("�������ڵ�FULLģʽ����������Ϊ���ģ�" +
                df3.format(date));
        System.out.println("����ָ����ʽyyyy��MM��dd�� hhʱmm��ss�� EE������Ϊ���ģ�" +
                df4.format(date));
        System.out.println("����ָ����ʽyyyy-MM-dd hh:mm:ss EEEEEE��������������" +
                df5.format(date));

    }

}

