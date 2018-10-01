package org.gaozou.book.javaabc.examples.ch25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author TuringEmmy
 *
 */
public class TCPServer {
    public static void main(String[] args) { // java��������ڴ�
        try {
            Server server = new Server(8080);// ����˿ں�ʵ��������
        } catch (Exception e) {             // �����쳣
            System.out.println("���Է������˼�������" + e.getMessage());
        }
    }
}

class Server {                     // Socket��������
    private int port;             // �˿�

    public Server(int port) {         // �������Ĺ��췽�����г�ʼ��
        this.port = port;
        start();                     // ���������������˵ķ���
    }

    public String infoUpperCase(String line) {// ������Ϣ
        return line.toUpperCase(); // ���ַ�����д
    }

    public void start() {             // ������������
        try {
            // ���ݶ˿ڴ�����������Socket����
            ServerSocket serverSocket = new ServerSocket(port);
            // ��ʾ������Ϣ
            System.out.println("�������������������˿ں�Ϊ��" + port);
            System.out.println("���ڵȴ��ͻ�������.........");
            // ����ȴ��ͻ�������
            Socket socketAccept = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    socketAccept.getInputStream()));    // ��ȡ��ȡ�ͻ��˵�������
            // ��ȡд���ͻ��˵����������,true:�Զ�ˢ��
            PrintWriter out = new PrintWriter(socketAccept.getOutputStream(),
                    true);
            out.println("�����������ӳɹ�.........");     // ��ͻ�����������Ϣ
            out.println("����quit�Ͽ��������������");
            boolean done = false;
            while (!done) {
                String line = in.readLine();     // ��ȡ�ͻ���ÿ�е�����
                if (line == null) {             // û��д�򲻶�ȡ
                    done = true;
                } else {
                    // ��ʾ�ͻ��˷��͵�����
                    System.out.println("���Կͻ��˵���Ϣ��" + line);
                    // ��Ϣ����
                    String message = infoUpperCase(line);
                    // ��ͻ��˷�����Ϣ
                    out.println("���Է������˵���Ϣ��" + message);
                    if (line.trim().equals("quit"))// �˳��ж�
                        done = true;
                }
            }
            socketAccept.close();         // �ر�ͨ����Դ
        } catch (Exception e) {         // �����쳣
            System.out.println("�����������˳��ִ���" + e.getMessage());
        }
    }
}

