package org.gaozou.book.javaabc.examples.ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author TuringEmmy
 *
 */
public class FileReaderTest {
    public static void filereadertest() {
        String name = "javatest.txt";        // Newһ���ַ������͵�name��������ֵΪ��java.txt��
        try {
            FileReader fr = new FileReader(name); //����һ��ָ���ļ�����FileReader������ֵname;
            char[] c = new char[1];        //new һ��char���ͳ���Ϊ1������
            while (fr.read(c) != -1) {        //ѭ���ж��Ƿ��ȡ���ļ��ĵײ�
                System.out.print(new String(c)); //����ȡ�������ݴ�ӡ����ʾ����
            }

            fr.close();                        //�ر���
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args)         //������
    {
        filereadertest();                        //���ò�������
    }
}

