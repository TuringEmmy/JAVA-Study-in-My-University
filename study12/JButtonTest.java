package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ��ť����
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class JButtonTest {
	public JButtonTest() {
		JFrame f = new JFrame("�򿪴���");// ����һ��JFrame���󣬲��������ı���Ϊ"�򿪴���"
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		JButton b1 = new JButton("��һ���ı�����"); // ����һ����ť���
		JButton b2 = new JButton("��һ���մ���");
		b1.setMnemonic('T'); // ����b1�ϵļ������Ƿ�ΪT
		b2.setMnemonic('I'); // ����b2�ϵļ������Ƿ�ΪI
		f.getRootPane().setDefaultButton(b1);
		b1.addActionListener( // ��Ӽ�����
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("���ִ���");
				JLabel label = new JLabel("����һ�������ֵĴ���");
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);
				newf.show();
			}
		});
		b2.addActionListener( // ��Ӽ�����
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("�մ���");// ����һ��JFrame�Ķ���
				JLabel label = new JLabel();
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);// ���ô��ڵĴ�С
				newf.show();
			}
		});
		// ����������ť��ӵ������
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}
