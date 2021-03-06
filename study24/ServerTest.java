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
    public ServerTest(int port) throws IOException//构造函数，参数为端口号
    {
        ServerSocket server = new ServerSocket(port);//创建ServerSocket
        //不断循环接受客户端的连接
        while (true) {
            Socket conn = server.accept();    //监听客户端的连接
            //将服务器端的输入流封装到DataInputStream类中，该类支持与机器无关的编码方式
            DataInputStream in = new DataInputStream(conn.getInputStream());
            String who = in.readUTF();        //读取用户信息
            System.out.print("Client " + "(SocketOpts.IP:" + conn.getInetAddress() + ")" + who + " enter!" + "\n");
            //每次监听到连接请求就创建一个线程
            ServerHander cn = new ServerHander(who, conn);    //对该连接创建一个线程
            cn.start();            //启动该线程
        }
    }

    public static void main(String args[]) throws IOException {
        new ServerTest(9001);                    //初始服务器端
    }
}

class ServerHander extends Thread        //线程类
{
    Socket socket;                    //Socket对象
    DataInputStream in;                //数据输入流
    DataOutputStream out;                //数据输出流
    String who;
    //保存所有的客户端对象
    protected static Vector<ServerHander> clientlist = new Vector<ServerHander>();

    public ServerHander(String name, Socket socket) throws IOException    //构造函数
    {
        this.who = name;
        this.socket = socket;
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void run() {
        try {
            clientlist.addElement(this);    //添加当前对象到vector
            sendallclient("欢迎  " + who + "  进入聊天室");//发送新客户进入消息给客户
            //无限的循环
            while (true) {
                String msg = in.readUTF();    //读取输入信息
                sendallclient(who + "  说:  " + msg);//将输入信息发送给所有人
            }
        }
        catch (IOException e) {
            System.out.println("Client exit or error.");
        }
        finally {
            clientlist.removeElement(this);//清除存放客户端的向量
            sendallclient(who + "  退出 !");
            try {
                socket.close();        //关闭Socket对象
            }
            catch (IOException ex) {
                System.out.println("Connection has been closed");
            }
        }
    }

    protected static void sendallclient(String msg)    //给客户端传递信息的方法
    {
        synchronized (clientlist) {            //对客户端vector加锁
            //获得vector的枚举对象
            Enumeration<ServerHander> allclients = clientlist.elements();
            //遍历访问每个客户端对象
            while (allclients.hasMoreElements()) {
                ServerHander serh = (ServerHander) allclients.nextElement();
                try {
                    serh.out.writeUTF(msg);    //向客户端发送信息
                    serh.out.flush();        //刷新输出流，保证内容输出
                }
                catch (IOException exc) {
                    serh.interrupt();        //终端线程
                }
            }
        }
    }
}
