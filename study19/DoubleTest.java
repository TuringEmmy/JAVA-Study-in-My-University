package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double dd = new Double(56);
        //��ӡ��Double���һЩ����
        System.out.println("Double�����ֵ�ǣ�" + dd.MAX_VALUE);
        System.out.println("Double����Сֵ�ǣ�" + dd.MIN_VALUE);
        System.out.println("Double�������ǣ�" + dd.TYPE);
        System.out.println("Double�����ݴ�С�ǣ�" + dd.SIZE);
        System.out.println("Double���������ǣ�" + dd.POSITIVE_INFINITY);
        System.out.println("Double�ĸ������ǣ�" + dd.NEGATIVE_INFINITY);
    }
}
