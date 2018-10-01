package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class MouseTest extends WindowAdapter implements MouseListener {
	JFrame jfarme = null;
	JButton button1 = null;
	JLabel label = null;

	public MouseTest() {
		jfarme = new JFrame("����¼�ʾ��"); // ����һ�����
		Container contentPane = jfarme.getContentPane(); // ���һ����������
		contentPane.setLayout(new GridLayout(2, 1));// ���ò��ַ�ʽ
		button1 = new JButton("��ť"); // ����һ����Ť
		label = new JLabel("��ʼ״̬����û������¼�", JLabel.CENTER);// ����һ���ı���ǩ
		button1.addMouseListener(this); // Ϊ��Ť����¼�����
		contentPane.add(label);
		contentPane.add(button1);
		jfarme.pack(); // �����ڵ��ڵ��ʵ��Ĵ�С
		jfarme.show(); // ��ʾ����
		jfarme.addWindowListener(this); // ��Ӵ����¼�����
	}

	public void mousePressed(MouseEvent e) { // ������������¼�
		label.setText("���Ѿ�������갴ť");
	}

	public void mouseReleased(MouseEvent e) { // �����ͷ���갴��
		label.setText("���Ѿ�̧����갴ť");
	}

	public void mouseEntered(MouseEvent e) { // ���������ʱ����
		label.setText("����Ѿ����밴ť");
	}

	public void mouseExited(MouseEvent e) { // ����뿪���ʱ����
		label.setText("����Ѿ��뿪��ť");
	}

	public void mouseClicked(MouseEvent e) { // ���������ϵ���ʱ����
		label.setText("�㵥����ť");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new MouseTest();
	}
}
