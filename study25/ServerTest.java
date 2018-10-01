package org.gaozou.book.javaabc.examples.ch25;

//import sun.nio.ch.SocketOpts;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author TuringEmmy
 *
 */
public class ServerTest {
    public ServerTest(int port) throws IOException//���캯��������Ϊ�˿ں�
    {
        ServerSocket server = new ServerSocket(port);//����ServerSocket
        //����ѭ�����ܿͻ��˵�����
        while (true) {
            Socket conn = server.accept();    //�����ͻ��˵�����
            //���������˵���������װ��DataInputStream���У�����֧��������޹صı��뷽ʽ
            DataInputStream in = new DataInputStream(conn.getInputStream());
            String who = in.readUTF();        //��ȡ�û���Ϣ
            System.out.print("Client " + "(SocketOpts.IP:" + conn.getInetAddress() + ")" + who + " enter!" + "\n");
            //ÿ�μ�������������ʹ���һ���߳�
            ServerHander cn = new ServerHander(who, conn);    //�Ը����Ӵ���һ���߳�
            cn.start();            //�������߳�
        }
    }

    public static void main(String args[]) throws IOException {
        new ServerTest(9001);                    //��ʼ��������
    }
}

class ServerHander extends Thread        //�߳���
{
    Socket socket;                    //Socket����
    DataInputStream in;                //����������
    DataOutputStream out;                //���������
    String who;
    //�������еĿͻ��˶���
    protected static Vector<ServerHander> clientlist = new Vector<ServerHander>();

    public ServerHander(String name, Socket socket) throws IOException    //���캯��
    {
        this.who = name;
        this.socket = socket;
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void run() {
        try {
            clientlist.addElement(this);    //��ӵ�ǰ����vector
            sendallclient("��ӭ  " + who + "  ����������");//�����¿ͻ�������Ϣ���ͻ�
            //���޵�ѭ��
            while (true) {
                String msg = in.readUTF();    //��ȡ������Ϣ
                sendallclient(who + "  ˵:  " + msg);//��������Ϣ���͸�������
            }
        }
        catch (IOException e) {
            System.out.println("Client exit or error.");
        }
        finally {
            clientlist.removeElement(this);//�����ſͻ��˵�����
            sendallclient(who + "  �˳� !");
            try {
                socket.close();        //�ر�Socket����
            }
            catch (IOException ex) {
                System.out.println("Connection has been closed");
            }
        }
    }

    protected static void sendallclient(String msg)    //���ͻ��˴�����Ϣ�ķ���
    {
        synchronized (clientlist) {            //�Կͻ���vector����
            //���vector��ö�ٶ���
            Enumeration<ServerHander> allclients = clientlist.elements();
            //��������ÿ���ͻ��˶���
            while (allclients.hasMoreElements()) {
                ServerHander serh = (ServerHander) allclients.nextElement();
                try {
                    serh.out.writeUTF(msg);    //��ͻ��˷�����Ϣ
                    serh.out.flush();        //ˢ�����������֤�������
                }
                catch (IOException exc) {
                    serh.interrupt();        //�ն��߳�
                }
            }
        }
    }
}
