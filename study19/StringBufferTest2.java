package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdefg");    //����һ��StringBuffer����
        System.out.println(sb);                    //��ӡ��sb��ֵ
        //ȡ��ÿ��λ�õ��ַ������ô�д��ʽ�滻
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            System.out.println(c);
            c = (char) (c - 32);                        //ȡ��c�Ĵ�д��ʽ
            sb.setCharAt(i, c);                    //�滻
        }
        System.out.println(sb);
    }
}

