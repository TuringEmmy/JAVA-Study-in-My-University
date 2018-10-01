package org.gaozou.book.javaabc.examples.ch18;

/**
 * @author TuringEmmy
 *
 */
public class SplitTest {
    public static void main(String[] args) {
        //�����ַ�����ʾ��������ʽ�ͱ�ƥ����ַ���
        String patternStr = ";|,";
        String str = "����;����,����";
        //��ӡ������ֵ��ַ�������
        System.out.println("��Ҫ��ֵ��ַ��������ǣ�");
        System.out.println(str);
        //���ַ������Ĭ�Ϸ�
        System.out.println("���ַ�������Ĭ�Ͻ����и�");
        String[] arrStr = str.split(patternStr);
        //��ӡ��ֺ�Ľ��
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //���ַ�����ֳ�3��
        System.out.println("\n���ַ�����ֳ�3��");
        arrStr = str.split(patternStr, 3);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //���ַ�����ֳ�-2��
        System.out.println("\n���ַ�����ֳ�-2��");
        arrStr = str.split(patternStr, -2);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //���ַ�����ֳ�0��
        System.out.println("\n���ַ�����ֳ�0��");
        arrStr = str.split(patternStr, 0);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
    }
}
