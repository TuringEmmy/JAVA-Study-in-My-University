package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class FloatDemo {
    public static void main(String[] args) {
        //����һ��Float����
        Float f = new Float(20f);
        //��ӡ��Float�ඨ��ĳ���
        System.out.println("Float���ֵ��" + f.MAX_VALUE);
        System.out.println("Float��Сֵ��" + f.MIN_VALUE);
        System.out.println("Floatλ����" + f.SIZE);
        System.out.println("Float�������ĳ���:" + f.POSITIVE_INFINITY);
        System.out.println("Float�������ĳ���:" + f.NEGATIVE_INFINITY);
        System.out.println("f��ֵ��" + f.floatValue());
        System.out.println("f��ʮ��������ʽ" + f.toHexString(f));
        System.out.println("f��doubleֵ" + f.doubleValue());
    }
}
