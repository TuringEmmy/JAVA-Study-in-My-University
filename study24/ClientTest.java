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
    public ServiceFrame sf;            //客户端窗体
    private Socket csocket;            //Socket对象
    private DataInputStream in;        //输入流
    private DataOutputStream out;        //输出流

    public static void main(String args[]) {
        String who = "";
        //获得输入流
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //输出提示信息
        System.out.print("请输入你的名字");
        try {
            who = in.readLine().trim();    //读取登录名
        } catch (IOException e) {
            e.printStackTrace();
        }
        new ClientTest(who, "127.0.0.1", 9001);//调用Client构造函数
    }

    public ClientTest(String who, String server, int port) {
        sf = new ServiceFrame("客户端聊天窗口");    //创建客户端窗体
        sf.sendFD.addKeyListener(new ActListener(this, sf));//添加键盘监听事件
        sf.addWindowListener(new ExitListener(this));
        try {
            csocket = new Socket(server, port);//创建Socket对象
            //输入流
            in = new DataInputStream(new BufferedInputStream(csocket.getInputStream()));
            //输出流
            out = new DataOutputStream(new BufferedOutputStream(csocket.getOutputStream()));
            out.writeUTF(who);            //向输出流输出who信息
            out.flush();                    //刷新输出流
            while (true) {
                sf.showTA.append("--" + in.readUTF() + "\n");  //在窗体输出信息
            }
        }
        catch (Exception e) {
            System.out.println("Server error!");
            this.close();
            System.exit(0);
        }
    }

    protected void send(String msg)        //输出信息
    {
        try {
            out.writeUTF(msg);            //向输出流写入信息
            out.flush();                    //刷新输出流
        }
        catch (IOException e) {
        }
    }

    protected void close()                    //关闭客户端，释放各种资源
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

class ServiceFrame extends Frame        //客户端窗体类
{
    protected TextArea showTA;        //消息显示区
    protected TextField sendFD;        //消息输入区

    public ServiceFrame(String winnm) {
        super(winnm);                //调用父类的构造函数
        setLayout(new BorderLayout());            //设置窗体布局
        add("North", showTA = new TextArea());
        showTA.setEditable(false);
        add("South", sendFD = new TextField());
        pack();
        show();                                //显示窗体
        sendFD.requestFocus();
    }
}

class ActListener extends KeyAdapter                //自己定义适配器类
{
    ClientTest client;                                //客户类对象
    ServiceFrame sframe;                        //窗体对象

    public ActListener(ClientTest c, ServiceFrame sf)        //构造函数
    {
        client = c;
        sframe = sf;
    }

    public void keyPressed(KeyEvent e)                //事件监听事件
    {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            client.send(sframe.sendFD.getText());
            sframe.sendFD.setText("");
        }
    }
}

class ExitListener extends WindowAdapter            //定义自己的适配器类
{
    ClientTest client;

    public ExitListener(ClientTest c)                    //构造函数
    {
        client = c;
    }

    public void windowClosing(WindowEvent e)//窗体关闭事件
    {
        client.close();
        System.exit(0);
    }
}
