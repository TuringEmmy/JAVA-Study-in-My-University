package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class IntegerTest {
    public static void main(String[] args) {
        //��ӡInteger�����ֵ
        System.out.println("Integer�����ֵ�ǣ�" + Integer.MAX_VALUE);
        String s = new String("1010");
        //����s��ʮ������
        System.out.println("s��ʮ�������ǣ�" + Integer.getInteger(s, 2));
        Integer i = new Integer("1234");
        //�Ƚ�
        System.out.println("i�ıȽϣ�" + i.compareTo(123));
        int j = 12345;
        //ת��Ϊ�ַ���
        System.out.println("ת���ַ������Ϊ��" + Integer.toString(j, 16));
    }
}
