package org.gaozou.book.javaabc.examples.ch18;

/**
 * @author TuringEmmy
 *
 */
public class ReplaceTest {
    public static void main(String[] args) {
        //�������ַ�����ʾ��������ʽ�Լ���ƥ����ַ�����
        String patternStr = "\\b\\d*\\.\\d{3,}\\b";
        String s1 = "123.5 123.56 123.5678 123.5600 123.0098";
        //��ӡ��ƥ��ĳ�ʼ����
        System.out.println("��ʼ�ַ��������ǣ�");
        System.out.println(s1);
        //����replaceAllȫ��ƥ���滻����
        String s2 = s1.replaceAll(patternStr, "Error");
        //��ӡreplaceAllȫ��ƥ���滻��Ľ��
        System.out.println("ʹ��replaceAll��������Ϊ��");
        System.out.println(s2);
        //ʹ��replaceFirst��һ��ƥ���滻����
        s2 = s1.replaceFirst(patternStr, "Error");
        //��ӡreplaceFirst��һ��ƥ���滻�����Ľ��
        System.out.println("ʹ��replaceFirst��������Ϊ��");
        System.out.println(s2);
    }
}
