package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * �¼�����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class EventTest1 extends WindowAdapter implements ActionListener {
	JButton b1 = null;
	JButton b2 = null;

	public EventTest1() { // ���췽��
		JFrame f = new JFrame("EventTest1"); // ����һ�����
		Container contentPane = f.getContentPane(); // ���һ����������
		contentPane.setLayout(new GridLayout(1, 2)); // ���ò��ַ�ʽ�����񲼾֣�
		b1 = new JButton("�رմ���"); // ����һ���رմ��ڵİ�Ť
		b2 = new JButton("�򿪴���"); // ����һ�����´��ڵİ�Ť
		// Ϊ��Ť����¼�����
		b1.addActionListener(this);
		b2.addActionListener(this);
		// ����������Ӱ�Ť���
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack(); // �����ڵ��ڵ��ʵ��Ĵ�С
		f.show(); // ��ʾ����
		f.addWindowListener(this); // ��Ӵ����¼�����
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) // ����getSource�ж��ĸ���ť�������ˡ�
			Toolkit.getDefaultToolkit().beep();
		if (e.getSource() == b2) {
			JFrame jf = new JFrame("�´���");
			jf.setSize(200, 200);
			jf.show();
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String args[]) {
		new EventTest1();
	}
}
