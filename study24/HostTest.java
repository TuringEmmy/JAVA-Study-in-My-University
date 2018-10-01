package org.gaozou.book.javaabc.examples.ch25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author TuringEmmy
 *
 */
public class HostTest {
    private static String lookup(String host) {
        InetAddress ia;
        byte[] b = null;    // ��ʼ��һ��byte���͵�����
        try {
            ia = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            return "û���ҵ�������";
        }
        if (isHostName(host)) {    //�ж��Ƿ�������
            String s = "";        //����һ���ַ���
            for (int i = 0; i < b.length; i++) {//ѭ���������������ַ���
                int c = b[i] < 0 ? (b[i] + 256) : b[i];
                s += c;
                if (i != b.length - 1) {
                    s += ",";
                }
            }
            return s;              //����һ���ַ���
        } else {
            return ia.getHostName();//����һ���ַ�����
        }
    }

    private static boolean isHostName(String host) {
        char[] ch = host.toCharArray();//����һ���ַ����飬����ʼ��
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isDigit(ch[i])) {
                if (ch[i] != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {     // ʹ��������
                System.out.println(lookup(args[i]));
            }
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println();
            while (true) {
                try {
                    String s = br.readLine();
                    if (s.equals("exit")) {//�ж�����ַ����롰exit����ͬ���ͽ�����ǰ������
                        break;
                    }
                    System.out.println(lookup(s));
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
