package cn.legeyung.study10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ��ʽ����ѧϰ���Զ���Ӱ�ť
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class FlowLayoutTest extends Frame implements ActionListener {
	Button b = new Button("���");
	int i;

	FlowLayoutTest() {
		// ���ô�������
		this.setTitle("FlowLayout���ֹ�����");
		// ���ò��ֹ�����ΪFlowLayout
		this.setLayout(new FlowLayout());
		// ��Ӱ�ť
		this.add(b);
		b.addActionListener(this);
		// ���ô��ڴ�С
		this.setBounds(100, 100, 250, 250);
		// ���ô��ڿɼ�
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

	public void actionPerformed(ActionEvent e) {

		i++;
		Button bi = new Button("��ť" + i);
		this.add(bi);
		this.show(true);

	}
}
