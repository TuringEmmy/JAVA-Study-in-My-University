package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class BooleanTeat {
    public static void main(String[] args) {
        //ͨ��������ͬ�Ĺ��췽�����������
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("a");
        //�ù��캯���������
        Boolean b4 = new Boolean("true");
        Boolean b5 = new Boolean("a");
        Boolean b6 = new Boolean(true);
        //��ӡ����ЩBoolean�����ֵ
        System.out.println("b1�����ֵ��" + b1.booleanValue());
        System.out.println("b2�����ֵ��" + b2.booleanValue());
        System.out.println("b3�����ֵ��" + b3.booleanValue());
        System.out.println("b4�����ֵ��" + b4.booleanValue());
        System.out.println("b5�����ֵ��" + b5.booleanValue());
        System.out.println("b6�����ֵ��" + b6.booleanValue());
    }
}
