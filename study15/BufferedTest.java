package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class BufferedTest {
    public static void bufferedtest() {
        FileInputStream fis = null;        //�����ļ�������
        FileOutputStream fos = null;        //�����ļ������
        BufferedInputStream bis = null;    //��������������
        BufferedOutputStream bos = null;    //�������������
        String name1 = "java.txt";        //���ö�ȡĿ���ļ�
        String name2 = "copyjava.txt";        //����д��Ŀ���ļ�
        int i;
        try {
            fis = new FileInputStream(name1);
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream(name2);
            bos = new BufferedOutputStream(fos);

            i = bis.read();                    //��ȡ����
            while (i != -1) {
                bos.write(i);                //д�뷽��
                i = bis.read();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) //������
    {
        bufferedtest();                //���ò�������
    }
}

