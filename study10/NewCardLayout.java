package cn.legeyung.study10;

import java.awt.*;

/**
 * ��Ƭ����ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class NewCardLayout {
	public static void main(String[] args) {
		// ����Frame�����ò���
		Frame f = new Frame("��Ƭ���ֹ�����ʾ��");
		f.setLayout(new CardLayout());
		// ����������ť������ӵ�������
		f.add(new Button("��ťһ"), "card1");
		f.add(new Button("��ť��"), "card2");
		// ���ô��ڵ���ʾ��С��λ��
		f.setBounds(100, 100, 250, 250);
		f.setVisible(true);
	}
}
