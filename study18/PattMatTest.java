package org.gaozou.book.javaabc.examples.ch18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author TuringEmmy
 *
 */
public class PattMatTest {
    public static void main(String[] args) {
        //����һ��������ʽ�ͱ�ƥ����ַ���
        String patternStr = "(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
        String matcherStr = "���ڵ�ʱ����11:15am�������Ӫҵʱ����ÿ���8:30am��5:30pm";
        //����Pattern�����Matcher����
        Pattern pa = Pattern.compile(patternStr);
        Matcher ma = pa.matcher(matcherStr);
        //����һ��Ŀ���ַ���������
        StringBuffer sb = new StringBuffer();
        //����һ��������
        int count = 0;
        //����ʼ�ַ�����ӡ����
        System.out.println("��ʼ�ַ����ǣ�");
        System.out.println(matcherStr);
        //ʹ��whileѭ������ƥ����
        while (ma.find()) {
            //����һ����ʱ�ַ����Ļ�����
            StringBuffer temp = new StringBuffer();
            if (ma.group(3).equals("am")) {
                //���ʱ��Ϊam��������滻
                //�����¼��ĸ�ʽ
                temp.append(ma.group(1));
                temp.append(":");
                temp.append(ma.group(2));
            } else {
                //����ʱ��Ϊpm�Ľ����滻
                //��ʱ�������ȡ
                int time = Integer.parseInt(ma.group(1));
                time = time + 12;
                //�����µ�ʱ���ʽ
                temp.append(time + ":" + ma.group(2));
            }
            //�����滻����������õ�Ŀ���ַ�����������
            ma.appendReplacement(sb, temp.toString());
            //��ӡÿ���滻�����
            System.out.println("[" + (++count) + "]��" + ma.group(0) + "�滻Ϊ" + temp.toString());

        }
        //�����һ���滻����ʣ����ַ�����ӵ�Ŀ���ַ���������
        ma.appendTail(sb);
        //��ӡ���Ľ��
        System.out.println("���Ľ����");
        System.out.println(sb.toString());
    }
}

