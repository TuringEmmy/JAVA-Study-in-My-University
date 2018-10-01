package org.gaozou.book.javaabc.examples.ch15;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * @author TuringEmmy
 *
 */
public class FileTest {
    public void ReadFileList(File file, Filter filter) {
        if (file.isDirectory())            //�����ж�file�Ƿ�ΪĿ¼
        {
            try {
                File[] files = file.listFiles(filter);        //����Ŀ¼����
                ArrayList<File> fileList = new ArrayList<File>();//ͨ�����鴴�������б�
                for (int i = 0; i < files.length; i++) {        //forѭ����������
                    // ���г�Ŀ¼
                    if (files[i].isDirectory()) {            //�ж��Ƿ�ΪĿ¼
                        System.out.println("[" + files[i].getPath() + "]");    //���·����
                        ReadFileList(files[i], filter);        //�ݹ����ReadFileList����
                    } else {
                        // �ļ��ȴ���fileList
                        fileList.add(files[i]);
                    }
                }
                // �г��ļ�
                for (File f : fileList) {                //ʹ����ǿ��for����������
                    ReadFileList(f, filter);            //����ReadFileList����
                }
                System.out.println();            //������з�
            }
            catch (ArrayIndexOutOfBoundsException e) {//�����쳣
                e.printStackTrace();                //��ӡ�쳣��Ϣ
            }
        } else if (file.isFile())            //��fileΪ�ļ�ʱ
        {
            FileDesc(file);            //����FileDesc����
        }

    }

    public void FileDesc(File file) {
        if (file.isFile()) { // �ж��Ƿ�Ϊ�ļ�
            System.out.print(file.toString() + " \n���ļ�");//����ַ�����Ϣ
            System.out.print(file.canRead() ? "�ɶ� " : "���ɶ� ");//�ж��ļ��Ƿ�ɶ�
            System.out.print(file.canWrite() ? "��д " : "����д ");//�ж��ļ��Ƿ��д
            System.out.println(file.length() + "�ֽ�");        //����ֽ���
        }
    }

    public static void main(String[] args) {
        String filename = "F:\\FileTest\\";    //�ɲ�����ȡ�ļ���
        File file = new File(filename);        //����������ʼ�����ļ����������ļ�����
        Filter filter = new Filter("java");    //����������ʼ���ļ�������
        new FileTest().ReadFileList(file, filter); //����FileDemoʵ����������ReadFileList����
    }
}

class Filter implements FilenameFilter {
    String extent;
    //������ʵ��Filter�Ĺ��췽��

    Filter(String extent) {
        this.extent = extent;    //��ʼ����Ա����extent
    }
    //���Ǹ����accept����

    public boolean accept(File dir, String name) {
        return name.endsWith("." + extent);         //�����ļ��ĺ�׺��
    }
}
