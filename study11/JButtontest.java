package cn.legeyung.study11;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * JButtonѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class JButtontest {
	public static void main(String[] args) {
		JFrame f = new JFrame("����һ����ť");
		Container contentPane = f.getContentPane();
		JButton b = new JButton("��ť");// ����һ������ʼ�ı��İ�ť��
		// ���û���������ֵ�λ�ã�ϵͳĬ��ֵ�Ὣ��������ͼ�ε��ұ��м�λ�á�
		// �����ı������ͼ���ˮƽ�����λ�á�
		b.setHorizontalTextPosition(JButton.CENTER);
		// �����ı������ͼ��Ĵ�ֱ�����λ�á�
		b.setVerticalTextPosition(JButton.BOTTOM);
		contentPane.add(b);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
