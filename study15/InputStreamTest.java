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
     * 字节流测试
     */
    public static void testStream() {
        InputStream fis = null;         //声明输入流对象
        OutputStream fos = null;         //声明输出流对象
        try {
            fis = new FileInputStream("C:\\x.txt"); //设置目标文件
            fos = new FileOutputStream("C:\\xcopy.txt");//设置输出目标文件
            long num = 0;                  //读取字节计数
            int bt = 0;   //每次读入字节内容
            //当读入文件末尾时，读入数据的值为-1
            //每次读入一个字节，存放到变量bt中，直到读完整个文件
            while ((bt = fis.read()) != -1) {
                //以字母的形式逐个输出文件的每个字节
                System.out.print((char) bt);
                fos.write(bt);     //将字节写入输出流中，实现文件的copy功能
                num++;
            }
            System.out.println("读取的字节数为" + num + "\n文件复制成功"); //打印输出
            fis.close();                     //关闭流
            fos.close();                     //关闭流
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定的文件！");     //打印输出异常
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件读取时发生IO异常！"); //打印输出异常
            e.printStackTrace();
        }
    }
}

