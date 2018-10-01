package org.gaozou.book.javaabc.examples.ch25;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author TuringEmmy
 *
 */
public class IPTypeTest {
    public static int getVersion(InetAddress ia) {
        byte[] b = ia.getAddress();//����һ���ֽ��͵����飬����ʼ����
        if (b.length == 4) {        //�ж��������ĳ����Ƿ����4
            return 4;            //������ֵ4
        } else if (b.length == 16) {
            return 6;
        } else {
            return -1;
        }
    }

    public static char getClass(InetAddress ia) {
        byte[] b = ia.getAddress();//����һ���ֽ��͵����飬����ʼ����
        if (b.length != 4) {        //�ж�����ĳ����Ƿ񲻵���4
            //���������4�����׳�һ���Ƿ������쳣
            throw new IllegalArgumentException("no ipv6 address");
        }
        int firstByte = b[0];        //����һ�����͵ı���
        //���͵ı�����ʮ��������Ƚ�
        if ((firstByte & 0x80) == 0) {
            return 'A';
        } else if ((firstByte & 0xc0) == 0x80) {
            return 'B';
        } else if ((firstByte & 0xe0) == 0xc0) {
            return 'C';
        } else if ((firstByte & 0xF0) == 0xE0) {
            return 'D';
        } else if ((firstByte & 0xF8) == 0xF0) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        InetAddress ia = null;
        try {
            ia = InetAddress.getByName("www.sina.com");//����һ����������
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        int len;
        char king;
        len = getVersion(ia);        //���÷��������ַ�ĳ���
        System.out.println("��ַ����Ϊ��" + len);
        king = getClass(ia);        //���÷��������ַ������
        System.out.println("��ַ������Ϊ��" + king);
    }
}
