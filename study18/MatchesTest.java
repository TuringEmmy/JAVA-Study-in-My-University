package org.gaozou.book.javaabc.examples.ch18;

/**
 * @author TuringEmmy
 *
 */
public class MatchesTest {
    public static void main(String[] args) {
        //�������ַ�����ʾ��������ʽ
        String paterStr = "\\d{4}-\\d{2}-\\d{2}";
        //����������ƥ����ַ���
        String s1 = "9999-66-88";
        String s2 = "������9999-66-88";
        //���ַ���s1����ƥ����
        if (s1.matches(paterStr)) {
            //ƥ��ɹ������
            System.out.println("��ϲ�㣬�ַ���s1����ָ����ʽ��ƥ��Ҫ��");
        } else {
            //ƥ��ɹ������
            System.out.println("����ʧ�ܣ��ַ���s1δ������ָ����ʽ��ƥ��Ҫ��");
        }
        if (s2.matches(paterStr)) {
            //ƥ��ɹ������
            System.out.println("��ϲ�㣬�ַ���s2����ָ����ʽ��ƥ��Ҫ��");
        } else {
            //ƥ��ɹ������
            System.out.println("����ʧ�ܣ��ַ���s2δ������ָ����ʽ��ƥ��Ҫ��");
        }
    }
}
