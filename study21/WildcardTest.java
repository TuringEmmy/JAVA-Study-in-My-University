package org.gaozou.book.javaabc.examples.ch21;

import java.util.ArrayList;

/**
 * @author TuringEmmy
 *
 */
public class WildcardTest {
    public static void printMyValue(ArrayList<?> mv) {
        //��ӡ�ö����е�ֵ
        System.out.println("�б��е�ֵ�ǣ�");
        System.out.println(mv);
    }

    public static void main(String[] args) {
        //�������Ͳ���String��ArrayList����
        ArrayList<String> as = new ArrayList<String>();
        //ѭ������20���ַ���
        for (int i = 0; i < 20; i++) {
            as.add(" " + i);
        }
        //����printMyValue�������д�ӡ
        printMyValue(as);
    }
}
