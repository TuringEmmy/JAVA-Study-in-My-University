package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class AppendTest {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");    //����һ��StringBuffer����sb
        sb.append('!');                //��sb��β��׷��һϵ��Ԫ��
        sb.append("\n");
        sb.append(true);
        sb.append("\n");
        sb.append(20);
        sb.append("\n");
        sb.append("Hello!");
        System.out.println(sb);                    //��ӡ�����
    }
}
