package org.gaozou.book.javaabc.examples.ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author TuringEmmy
 *
 */
public class ReadomAccessFileTest {
    public static void RandomToWrite(File file) {
        Student[] students = new Student[4];
        // ����Student����
        // ��ʼ��Student����
        students[0] = new Student("����", "90");
        students[1] = new Student("����", "80");
        students[2] = new Student("����", "70");
        students[3] = new Student("����", "60");
        RandomAccessFile randomAccessFile = null; // ����RandomAccessFile����
        try {
            randomAccessFile = new RandomAccessFile(file, "rw"); // ����һ������֧�ֶ�д״̬��
            //RandomAccessFile����
        } catch (FileNotFoundException e1) {         // �����쳣
            System.out.println("�ļ�û���ҵ�" + e1.getMessage());     // ����쳣��Ϣ
        }
        try {
            for (int i = 0; i < students.length; i++) // for����students����
            {
                randomAccessFile.writeChars(students[i].getLevel());// ���ļ���д�����ֵȼ�
                randomAccessFile.writeChars(students[i].getScore());// ���ļ���д�����
            }
            randomAccessFile.close(); // �ر�randomAccessFile
        } catch (IOException e1) {    // �����쳣
            e1.printStackTrace();     // ����쳣��Ϣ
        }
    }

    private static String readName(RandomAccessFile randomAccessfile)
            throws IOException {
        char[] name = new char[5];     // ����char��������
        for (int i = 0; i < name.length; i++) {
            name[i] = randomAccessfile.readChar();     // ��ȡ�ַ�
        }
        return new String(name);
    }

    public static Student[] RandomToRead(File file) throws Exception {
        RandomAccessFile randomAccessFile;         // ����RandomAccessFileʵ��
        randomAccessFile = new RandomAccessFile(file, "r"); // ��ʼ��randomAccessFile����
        int num = (int) randomAccessFile.length() / Student.size(); // ����Student���ռ�ÿռ��С
        Student[] student = new Student[num];     // ����Student����student
        for (int i = 0; i < num; i++) {
            randomAccessFile.seek((i) * Student.size());
            // ʹ�ö�Ӧ��read�����������ݡ�
            student[i] = new Student(readName(randomAccessFile),
                    readName(randomAccessFile));
        }
        randomAccessFile.close();     // randomAccessFile�ر�
        return student;         // ��������
    }

    public static void main(String[] args) throws Exception {
//		 ����������ʼ�ļ�����
        String filename = "D:/temp/a.txt";
        File file = new File(filename); // ��������ʼFile����file
        RandomToWrite(file);     // ����RandomWriteFile����
        Student[] student = RandomToRead(file);     // �����ļ��б����student����
        // ʹ��for������student����
        System.out.println(filename + "���������£�");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Level=" + student[i].getLevel() + "|Score="
                    + student[i].getScore());
        }
    }
}

class Student {
    String level;     // ���ּ���
    String score;     // ����
    final static int SIZE = 8;// ����������ʼ����̬��LEN

    public Student(String level, String score) {
        if (level.length() > SIZE) {
            level = level.substring(0, 8); // ��ȡ�ַ��������ַ���
        } else {
            while (level.length() < SIZE)
                level = level + "\u0000";
        }
        this.level = level; // ��ʼ��level
        this.score = score; // ��ʼ��score
    }
    // ��ȡ��ռ�õĿռ�

    public static int size() {
        return 20;    // �ַ���������8��һ���ַ�ռ��2���ֽڣ�һ��������4���ֽ�
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
