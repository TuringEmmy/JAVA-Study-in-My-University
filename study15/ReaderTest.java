package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        reader();
    }

    public static void reader() throws IOException {    //�½�һ����������Ϊreader
        /**
         *   �ַ�������
         */
        // ����һ��ָ��C:\\x.txt ���ֽ���
        FileInputStream fileInputStream = new FileInputStream("C:\\x.txt");
        //�ֽ���ת����InputStreamReader
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //		InputStreamReader ת���ɴ������bufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //	InputStreamReader ת���ɴ������bufferedReader
        String ss = new String();
        String s;             //����ȡ��������Ϣ���Ƹ��ַ���s

        while ((s = bufferedReader.readLine()) != null) {
            ss += s;
        }
        //����һ��ָ��������ֽ���
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\x.txt");
        // �ֽ���ת����outputStreamWriter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                fileOutputStream);
        //outputStreamWriter ת���ɴ������bufferedReader
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(ss);
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}

