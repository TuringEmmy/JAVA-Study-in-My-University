package org.gaozou.book.javaabc.examples.ch25;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author TuringEmmy
 *
 */
public class GetIP {
    public static void main(String args[]) {
        InetAddress baidu = null;//����һ��InetAddress���ڴ�Űٶȵĵ�ַ
        InetAddress myIP = null;    //����һ��InetAddress���ڴ�ű�����ַ
        InetAddress[] yahoo = null;//����һ��InetAddress���ڴ���Ż���ַ����
        //ȡ�õ�ַ
        try {
            //ʹ��getByName���sina��IP��ַ
            baidu = InetAddress.getByName("www.baidu.com");
            //��ñ�����ַ
            myIP = InetAddress.getLocalHost();
            //ʹ��getAllByName���yahoo�ĵ�ַ����
            yahoo = InetAddress.getAllByName("www.yahoo.com.cn");
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(baidu);            //��ӡ���ٶȵ�ַ
        System.out.println(myIP);            //��ӡ��������ַ
        for (int i = 0; i < yahoo.length; i++)        //��ӡ���Ż��ĵ�ַ����
            System.out.println(yahoo[i]);
    }
}
