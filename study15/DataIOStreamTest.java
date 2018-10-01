package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class DataIOStreamTest {
    public static void main(String[] args) {
        String filename = "f:\\FileTest\\DataioStreamTest.txt";
//����������ʼ���ļ����ַ���
        //����������ʼ��People��������
        People[] people = {
                new People("������", 23),
                new People("���Ƴ�", 24),
                new People("�ܲ�", 25),
                new People("����", 22)};
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream(filename));        //����DataOutputStream����
            for (People Employee : people)                 //ʹ��for����
            {
                // д���ַ���
                dataOutputStream.writeUTF(Employee.getName());
                // д������
                dataOutputStream.writeInt(Employee.getAge());
            }
            // ��������������Ŀ�ĵ�
            dataOutputStream.flush();
            // �ر���
            dataOutputStream.close();
            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream(filename));
            // �������ݲ���ԭΪ����
            for (int i = 0; i < people.length; i++) {
                // ����UTF�ַ���
                String name = dataInputStream.readUTF();
                // ����int����
                int score = dataInputStream.readInt();
                people[people.length - 1 - i] = new People(name, score);
            }
            // �ر���
            dataInputStream.close();
            // �����ԭ�������
            for (People Employee : people) {
                System.out.printf("%s\t%d%n",
                        Employee.getName(), Employee.getAge());    //��ʽ�����
            }
        }
        catch (IOException e) {        //�����쳣
            e.printStackTrace();    //�쳣��Ϣ���
        }
    }
}

