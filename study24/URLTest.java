package org.gaozou.book.javaabc.examples.ch25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author TuringEmmy
 *
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            //����һ��URL����
            URL url = new URL("http://news.163.com/special/00014J0Q/nanjingexplode.html");
            System.out.println("url���ݣ�" + url.getContent());    //��ȡ��Դ����
            System.out.println("������" + url.getHost());    //��ȡ��Դ�ĵ�ַ
            System.out.println("�˿ڣ�" + url.getPort());    //��ȡ��Դ�Ķ˿�
            System.out.println("��ѯ��:" + url.getQuery());    //��ȡ����Դ�Ĳ�ѯ��
            System.out.println("·����" + url.getPath());    //��ȡ����Դ���ļ�·��
            System.out.println("�ļ�����" + url.getFile());    //��ȡ����Դ���ļ���
            System.out.println("��Ȩ��" + url.getAuthority());    //��ȡ����Դ����Ȩ
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

