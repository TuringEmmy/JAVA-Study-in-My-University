package cn.legeyung.study10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * ���岼�ֵĲ���ѧϰ
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class NewFlowLayout extends Frame {
	// ����������ť���
	Button b1 = new Button("��ťһ");
	Button b2 = new Button("��ť��");
	Button b3 = new Button("��ť��");
	Button b4 = new Button("��ť��");

	NewFlowLayout() {
		// ���ô�������
		this.setTitle("FlowLayout���ֹ�����");
		// ���ò��ֹ�����ΪFlowLayout
		this.setLayout(new FlowLayout());
		// ��Ӱ�ť
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		// ���ô��ڴ�С����ʾλ��
		this.setBounds(100, 100, 250, 250);//����java.awt �� Window
		// ���ô��ڿɼ�
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NewFlowLayout();
	}
}
