package org.gaozou.book.javaabc.examples.ch21;

/**
 * @author TuringEmmy
 *
 */
public class FFTest {
    //�Զ��巺�ͷ���

    public static <T> T getLast(T[] a) {
        //����ָ��������������һ��Ԫ�ء�
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        //�����ַ������͵�����
        String[] str = {"��һ��Ԫ��", "�ڶ���Ԫ��", "������Ԫ��"};
        //ʹ�÷��ͷ�������Ϊ��ָ�����Ͳ���
        String laststr = FFTest.<String>getLast(str);
        //��ӡ���
        System.out.println("String����str�����һ��Ԫ���ǣ�" + laststr);
        //����Integer��������
        Integer[] inte = {new Integer(100), new Integer(200), new Integer(300)};
        //ʹ�÷��ͷ���������û����ʾָ�����Ͳ���
        Integer lastint = FFTest.getLast(inte);
        //��ӡ���
        System.out.println("Integer����inte�����һ��Ԫ���ǣ�" + lastint);
    }
}
