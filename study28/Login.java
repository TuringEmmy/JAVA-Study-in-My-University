package org.gaozou.book.javaabc.examples.ch28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class Login extends JFrame implements ActionListener {
    private JPanel jp = new JPanel();//����JPanel����
    private JLabel[] jlArray = {//������ǩ��
            new JLabel("�û�IP"), new JLabel("�˿ں�"), new JLabel("�û���"),
            new JLabel("��  ��"), new JLabel("")
    };
    private JButton[] jbArray = {//������ť����
            new JButton("ѧ����¼"), new JButton("���"), new JButton("����Ա��¼")
    };
    private JTextField[] jtxtArray = { //�����ı���
            new JTextField("127.0.0.1"), new JTextField("3306"), new JTextField("1001")
    };
    private JPasswordField jpassword = new JPasswordField("1001"); //���������
    String sql;
    DataBase db;

    public Login() {
        jp.setLayout(null); //����JPanel�Ĳ��ֹ�����
        for (int i = 0; i < 4; i++) { //�Ա�ǩ�밴ť�ؼ�ѭ������
            jlArray[i].setBounds(30, 20 + i * 50, 80, 25);//���ñ�ǩ�밴ť�Ĵ�С��λ��
            jp.add(jlArray[i]);//����ǩ�Ͱ�ť���ӽ�JPanel������
        }
        for (int i = 0; i < 3; i++) {//���ð�ť�Ĵ�Сλ�ò�Ϊ�������¼�������
            jbArray[i].setBounds(10 + i * 120, 230, 100, 25);
            jp.add(jbArray[i]);
            jbArray[i].addActionListener(this);
        }
        for (int i = 0; i < 3; i++) {//�����ı���Ĵ�Сλ�ò�Ϊ�������¼�������
            jtxtArray[i].setBounds(80, 20 + 50 * i, 180, 25);
            jp.add(jtxtArray[i]);
            jtxtArray[i].addActionListener(this);
        }
        jpassword.setBounds(80, 170, 180, 25);//���������Ĵ�Сλ��
        jp.add(jpassword);//����������ӽ�JPanel����
        jpassword.setEchoChar('*');//���������Ļ����ַ�
        jpassword.addActionListener(this);//Ϊ�����ע�������
        jlArray[4].setBounds(10, 280, 300, 25);//����������ʾ��¼״̬�ı�ǩ�Ĵ�Сλ��
        jp.add(jlArray[4]); //����ǩ���ӽ�JPanel����
        this.add(jp);
        Image image = new ImageIcon(this.getClass().getResource("/ico.png")).getImage();//��logoͼƬ���г�ʼ��
        this.setIconImage(image);
        //���ô���Ĵ�Сλ�ü��ɼ���
        this.setTitle("�Ǵ�ͼ��ݹ���ϵͳ - ��¼");
        this.setResizable(false);
        this.setBounds(100, 100, 400, 350);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    //ʵ��ActionListener�ӿ��еķ���

    public void actionPerformed(ActionEvent e) {//�¼�ԴΪ�ı���
        String mgno = jtxtArray[2].getText().trim();
        String mgIP = jtxtArray[0].getText().trim();
        String port = jtxtArray[1].getText().trim();
        String message = mgIP + ":" + port;
        DataBase.message = message;//��������׵ı�����Ϊ������ֵ��DataBase������˽�б���
        if (e.getSource() == jtxtArray[0]) {
            jtxtArray[1].requestFocus();//�л����뽹�㵽�����
        }
        if (e.getSource() == jtxtArray[1]) {
            jtxtArray[2].requestFocus();//�л����뽹�㵽�����
        }
        if (e.getSource() == jtxtArray[2]) {
            jpassword.requestFocus();//�л����뽹�㵽�����
        } else if (e.getSource() == jbArray[1]) {//�¼�ԴΪ��հ�ť
            //���������Ϣ
            jlArray[4].setText("");
            jtxtArray[2].setText("");
            jpassword.setText("");
            //�����뽹�����õ��ı���
            jtxtArray[2].requestFocus();
        } else if (e.getSource() == jbArray[2]) {//�¼�ԴΪ����Ա��¼��ť
            //�ж��û����������Ƿ�ƥ��
            if (!mgno.matches("\\d+")) {//����û�����ʽ��������
                JOptionPane.showMessageDialog(this, "�û�����ʽ���󣡣���", "��Ϣ",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (jtxtArray[0].getText().trim().equals("")) {//���"�û�IP"�ı���Ϊ�գ���ʾ
                JOptionPane.showMessageDialog(this, "�û�IP����Ϊ�գ�����", "��Ϣ",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (jtxtArray[1].getText().trim().equals("")) {//���"�˿ں�"�ı���Ϊ�գ���ʾ
                JOptionPane.showMessageDialog(this, "�û��˿ںŲ���Ϊ�գ�����", "��Ϣ",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            sql = "select mgNo,password from manager where mgNo=" + Integer.parseInt(mgno);
            db = new DataBase();
            db.selectDb(sql);//���������Ƕ��û�����������в�ѯ����֤����
            try {
                String mgNo = "";
                String password = "";
                while (db.rs.next()) {//ȡ������������ݲ���ֵ
                    mgNo = db.rs.getString(1).trim();
                    password = db.rs.getString(2).trim();
                }
                if (jtxtArray[2].getText().trim().equals(mgNo) &&
                        String.valueOf(jpassword.getPassword()).equals(password)) {//��¼�ɹ�
                    jlArray[4].setText("��ϲ������¼�ɹ�������");
                    new Root(mgNo);
                    this.dispose();
                } else {//��¼ʧ��
                    jlArray[4].setText("�Բ��𣬵�¼ʧ�ܣ�����");
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            db.dbClose();//�ر����ݿ�����
        } else if (e.getSource() == jbArray[0]) {//�¼�ԴΪѧ����¼��ť
            if (!jtxtArray[2].getText().trim().matches("\\d+")) {
                //��ѧ�Ÿ�ʽ���������ʾ�Ի���
                JOptionPane.showMessageDialog(this, "��������,ѧ��ֻ��Ϊ����!!!",
                        "��Ϣ", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (jtxtArray[0].getText().trim().equals("")) {//��"�û�IP"�ı�������Ϊ�գ���ʾ
                JOptionPane.showMessageDialog(this, "�û�IP����Ϊ�գ�����", "��Ϣ",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (jtxtArray[1].getText().trim().equals("")) {//��"�˿ں�"�ı�������Ϊ�գ���ʾ
                JOptionPane.showMessageDialog(this, "�û��˿ںŲ���Ϊ�գ�����",
                        "��Ϣ", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //��ѯѧ���ı�������ѧ���Ƿ������STUDENT����
            sql = "select StuNO,Password from STUDENT where StuNO=" + Integer.parseInt(jtxtArray[2].getText().trim());
            db = new DataBase();
            db.selectDb(sql);
            try {
                if (!(db.rs.next())) {//��ѧ�Ŵ��������ʾ�Ի���
                    JOptionPane.showMessageDialog(this, "�����˴����ѧ�ţ���", "��Ϣ", JOptionPane.INFORMATION_MESSAGE);
                } else {//�õ�����ѧ�ŵ�ѧ���������Ͱ༶
                    String stuNO = db.rs.getString(1).trim(),
                            password = db.rs.getString(2).trim();
                    if (jtxtArray[2].getText().trim().equals(stuNO) &&
                            String.valueOf(jpassword.getPassword()).equals(password)) {//��¼�ɹ�
                        jlArray[4].setText("��ϲ������¼�ɹ�������");
                        new StudentSystem();
                        this.dispose();
                    } else {//��¼ʧ��
                        jlArray[4].setText("�Բ��𣬵�¼ʧ�ܣ�����");
                    }
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            db.dbClose(); //�ر����ݿ�����
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}