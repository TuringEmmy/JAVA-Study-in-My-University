package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class ReplaceTest {
    public static void main(String[] args) {
        //����һ��StringBuffer����
        StringBuffer sb = new StringBuffer
                ("Tom is a good sttudent,Tom love his mother,Tom like palying football");
        System.out.println(sb);            //��ӡ��StringBuffer��������
        int index = 0;                    //��index����ʾ�´ε���indexOf��λ��
        //��Ҫ��index�����ֵĳ���length����indexOf�������ж�λ
        int length = "Tom".length();
        String name = "Mark";                //��mark���滻tom
        //ѭ����䣬ֱ��ȫ�����滻���λ��
        while (sb.indexOf("Tom", index + 1) > index) {
            index = sb.indexOf("Tom");        //ȡ��λ��
            sb.replace(index, index + length, name);            //�滻
        }
        System.out.println(sb);                            //��ӡ�����
    }
}
