package org.gaozou.book.javaabc.examples.ch25;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;

/**
 * @author TuringEmmy
 *
 */
public class ClientTest {
    public ServiceFrame sf;            //�ͻ��˴���
    private Socket csocket;            //Socket����
    private DataInputStream in;        //������
    private DataOutputStream out;        //�����

    public static void main(String args[]) {
        String who = "";
        //���������
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //�����ʾ��Ϣ
        System.out.print("�������������");
        try {
            who = in.readLine().trim();    //��ȡ��¼��
        } catch (IOException e) {
            e.printStackTrace();
        }
        new ClientTest(who, "127.0.0.1", 9001);//����Client���캯��
    }

    public ClientTest(String who, String server, int port) {
        sf = new ServiceFrame("�ͻ������촰��");    //�����ͻ��˴���
        sf.sendFD.addKeyListener(new ActListener(this, sf));//��Ӽ��̼����¼�
        sf.addWindowListener(new ExitListener(this));
        try {
            csocket = new Socket(server, port);//����Socket����
            //������
            in = new DataInputStream(new BufferedInputStream(csocket.getInputStream()));
            //�����
            out = new DataOutputStream(new BufferedOutputStream(csocket.getOutputStream()));
            out.writeUTF(who);            //����������who��Ϣ
            out.flush();                    //ˢ�������
            while (true) {
                sf.showTA.append("--" + in.readUTF() + "\n");  //�ڴ��������Ϣ
            }
        }
        catch (Exception e) {
            System.out.println("Server error!");
            this.close();
            System.exit(0);
        }
    }

    protected void send(String msg)        //�����Ϣ
    {
        try {
            out.writeUTF(msg);            //�������д����Ϣ
            out.flush();                    //ˢ�������
        }
        catch (IOException e) {
        }
    }

    protected void close()                    //�رտͻ��ˣ��ͷŸ�����Դ
    {
        try {
            sf.dispose();
            out.close();
            in.close();
            csocket.close();
        } catch (IOException ex) {
        }
    }
}

class ServiceFrame extends Frame        //�ͻ��˴�����
{
    protected TextArea showTA;        //��Ϣ��ʾ��
    protected TextField sendFD;        //��Ϣ������

    public ServiceFrame(String winnm) {
        super(winnm);                //���ø���Ĺ��캯��
        setLayout(new BorderLayout());            //���ô��岼��
        add("North", showTA = new TextArea());
        showTA.setEditable(false);
        add("South", sendFD = new TextField());
        pack();
        show();                                //��ʾ����
        sendFD.requestFocus();
    }
}

class ActListener extends KeyAdapter                //�Լ�������������
{
    ClientTest client;                                //�ͻ������
    ServiceFrame sframe;                        //�������

    public ActListener(ClientTest c, ServiceFrame sf)        //���캯��
    {
        client = c;
        sframe = sf;
    }

    public void keyPressed(KeyEvent e)                //�¼������¼�
    {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            client.send(sframe.sendFD.getText());
            sframe.sendFD.setText("");
        }
    }
}

class ExitListener extends WindowAdapter            //�����Լ�����������
{
    ClientTest client;

    public ExitListener(ClientTest c)                    //���캯��
    {
        client = c;
    }

    public void windowClosing(WindowEvent e)//����ر��¼�
    {
        client.close();
        System.exit(0);
    }
}
