package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class InputStreamTest {
    public static void main(String[] args) {
        testStream();

    }

    /**
     * �ֽ�������
     */
    public static void testStream() {
        InputStream fis = null;         //��������������
        OutputStream fos = null;         //�������������
        try {
            fis = new FileInputStream("C:\\x.txt"); //����Ŀ���ļ�
            fos = new FileOutputStream("C:\\xcopy.txt");//�������Ŀ���ļ�
            long num = 0;                  //��ȡ�ֽڼ���
            int bt = 0;   //ÿ�ζ����ֽ�����
            //�������ļ�ĩβʱ���������ݵ�ֵΪ-1
            //ÿ�ζ���һ���ֽڣ���ŵ�����bt�У�ֱ�����������ļ�
            while ((bt = fis.read()) != -1) {
                //����ĸ����ʽ�������ļ���ÿ���ֽ�
                System.out.print((char) bt);
                fos.write(bt);     //���ֽ�д��������У�ʵ���ļ���copy����
                num++;
            }
            System.out.println("��ȡ���ֽ���Ϊ" + num + "\n�ļ����Ƴɹ�"); //��ӡ���
            fis.close();                     //�ر���
            fos.close();                     //�ر���
        } catch (FileNotFoundException e) {
            System.out.println("�Ҳ���ָ�����ļ���");     //��ӡ����쳣
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("�ļ���ȡʱ����IO�쳣��"); //��ӡ����쳣
            e.printStackTrace();
        }
    }
}

